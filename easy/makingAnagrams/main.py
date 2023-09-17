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
  
  truncated = truncate_symmetric_diff(s1, s2)
  deletions =  abs(len(s1) - len(truncated['s1'])) + abs(len(s2) - len(truncated['s2'])) 
  if is_anagram(truncated['s1'], truncated['s2']):
    return deletions
  
  intersection = get_intersection(truncated['s1'], truncated['s2'])
  s1_frequency = count_char_frequency(intersection, truncated['s1'])
  s2_frequency = count_char_frequency(intersection, truncated['s2'])
  
  deletions += sum_frequency_diff(s1_frequency, s2_frequency)
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

def get_intersection(s1: str, s2: str) -> str:
  common_chars: set = set(s1) & set(s2)
  return ''.join(common_chars)

def count_char_frequency(intersection: str, value: str) -> dict[str, int]:
  assert set(intersection) == set(value) 
  char_frequency = {}
  for char in value:
    if char in char_frequency.keys():
      char_frequency[char] += 1
    else:
      char_frequency[char] = 1
    
  return char_frequency

def sum_frequency_diff(s1: dict[str, int], s2: dict[str, int]) -> int:
  sum = 0
  assert s1.keys() == s2.keys() 
  for char in s1.keys():
    sum += abs(s1[char] - s2[char])
  return sum

def main() -> None:
  s1, s2 = 'abcd', 'acde'
  print('Number of deletions to make anagram: ', making_anagrams(s1, s2))


if __name__ == "__main__":
  main()
