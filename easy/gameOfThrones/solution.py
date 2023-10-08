"""
|| HackerRank
    Problem: Game of Thrones - I 
    Level: Easy
    Author: amititkgp
    Implementation: apexDev37 & TuiyaVictoria

    Status: PASSED - All 20 test cases passed
"""


# Copy and paste all your functional code from
# from the HackerRank platform.

YES: str = 'YES'
NO: str = 'NO'


def game_of_thrones(value: str) -> str:
  char_freq = count_char_frequency(value)
  return YES if is_palindrome(char_freq) else NO


def count_char_frequency(value: str) -> dict[str, int]:
  frequency = {
    char: value.count(char) for char in set(value)}
  return frequency

  
def is_palindrome(map: dict[str, int]) -> bool:
  odd_frequencies = sum(1
    for freq in map.values()
    if is_odd(freq))
  return odd_frequencies <= 1


def is_odd(value: int) -> bool:
  return value % 2 == 1
