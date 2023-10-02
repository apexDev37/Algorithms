"""
|| HackerRank
    Problem: Game of Thrones - I 
    Level: Easy
    Author: amititkgp
    Implementation: apexDev37 &
"""

# This is main entry point function to complete
# on the HackerRank platform. 
# Rename as per specified

def game_of_thrones():
  pass


def count_char_frequency(value: str) -> dict[str, int]:
  frequency = {
    char: value.count(char) for char in set(value)}
  return frequency
  

def main() -> None:
  value = 'madam'
  print(f'Is string "{value}" a palindrome: ', game_of_thrones(value))


if __name__ == "__main__":
  main()
