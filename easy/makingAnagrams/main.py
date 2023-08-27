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
  return -1

def is_anagram(s1: str, s2: str) -> bool:
  if len(s1) != len(s2):
    return False
  return sorted(s1) == sorted(s2)

def get_intersection(s1: str, s2: str) -> bool:
  common_chars: set = set(s1) & set(s2)
  return ''.join(common_chars)

def truncate_symmetric_diff(s1: str, s2: str) -> dict[str, str]:
  uncommon_set = set(s1) ^ set(s2)
  uncommon_chars = ''.join(uncommon_set)
  return {'s1': truncate(uncommon_chars, s1), 
          's2': truncate(uncommon_chars, s2)}

def truncate(chars: str, given: str) -> str:
  result = given.rstrip(chars)
  return result

def count_char_frequency(value: str) -> dict[str, int]:
  char_frequency = {}
  for char in value:
    if char in char_frequency.keys():
      char_frequency[char] += 1
    else:
      char_frequency[char] = 1
    
  return char_frequency

def main() -> None:
  s1, s2 = 'anagram', 'instagram'
  print('Number of deletions to make anagram: ', making_anagrams(s1, s2))


if __name__ == "__main__":
  main()
