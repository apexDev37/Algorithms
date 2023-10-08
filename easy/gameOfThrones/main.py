"""
|| HackerRank
    Problem: Game of Thrones - I 
    Level: Easy
    Author: amititkgp
    Implementation: apexDev37 & TuiyaVictoria
"""


YES: str = 'YES'
NO: str = 'NO'


# This is main entry point function to complete
# on the HackerRank platform. 
# Rename as per specified

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


def main() -> None:
  # Custom input to test impl.
  value = 'madam'
  print(f'Is string "{value}" a palindrome: ', game_of_thrones(value))


if __name__ == "__main__":
  main()
