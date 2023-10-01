"""
|| HackerRank
    Problem: Making Anagrams 
    Level: easy
    Author: amititkgp
    Implementation: apexDev37
"""


def making_anagrams(s1: str, s2: str) -> int:
  if is_anagram(s1, s2):
    return 0

  # Optimization
  truncated = truncate_symmetric_diff(s1, s2)
  deletions =  abs(len(s1) - len(truncated['s1'])) + abs(len(s2) - len(truncated['s2'])) 
  if is_anagram(truncated['s1'], truncated['s2']):
    return deletions
  
  deletions += count_frequency_diff(truncated['s1'], truncated['s2'])
  return deletions


def is_anagram(s1: str, s2: str) -> bool:
  if len(s1) != len(s2):
    return False
  return sorted(s1) == sorted(s2)


def truncate_symmetric_diff(s1: str, s2: str) -> dict[str, str]:
  uncommon_set = set(s1) ^ set(s2)
  uncommon_chars = ''.join(uncommon_set)
  return {'s1': truncate(uncommon_chars, s1), 
          's2': truncate(uncommon_chars, s2)}


def truncate(chars: str, given: str) -> str:
  result = ''.join(filter(lambda x: x not in chars, given))
  return result


def count_frequency_diff(s1: str, s2: str) -> int:
  intersection = get_intersection(s1, s2)
  s1_frequency = count_char_frequency(intersection, s1)
  s2_frequency = count_char_frequency(intersection, s2)
  return sum_frequency_diff(s1_frequency, s2_frequency)


def get_intersection(s1: str, s2: str) -> str:
  common_chars: set = set(s1) & set(s2)
  return ''.join(common_chars)


def count_char_frequency(intersection: str, s: str) -> dict[str, int]:
  assert set(intersection) == set(s) 
  char_freq = {char: s.count(char) for char in intersection}
  return char_freq


def sum_frequency_diff(s1: dict[str, int], s2: dict[str, int]) -> int:
  assert s1.keys() == s2.keys() 
  deletions = sum([abs(s1[char] - s2[char]) for char in s1.keys()])
  return deletions


def main() -> None:
  s1, s2 = 'abcd', 'acde'
  print('Number of deletions to make anagram: ', making_anagrams(s1, s2))


if __name__ == "__main__":
  main()
