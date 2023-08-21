"""
|| HackerRank
    Problem: Making Anagrams 
    Level: easy
    Author: amititkgp
    Implementation: apexDev37
"""

# This is main entry point function to complete
# on the HackerRank platform. 
# Rename as per specified

def making_anagrams(s1: str, s2: str) -> int:
  if is_anagram(s1, s2):
    return 0
  return -1

def is_anagram(s1: str, s2: str) -> bool:
  if len(s1) != len(s2):
    return False
  return sorted(s1) == sorted(s2)

def main() -> None:
  s1, s2 = 'anagram', 'instagram'
  print('Number of deletions to make anagram: ', making_anagrams(s1, s2))


if __name__ == "__main__":
  main()
