"""
|| HackerRank
    Problem: Cut The Sticks
    Level: easy
    Author: shashank21j
    Implementation: apexDev37

    Status: PASSED - '10/10 test cases passed'
"""

def cutTheSticks(sticks):
  unique_sticks = sort_and_remove_duplicates(sticks)
  sticks_cut = get_number_of_sticks_cut(sticks, unique_sticks)
  return sticks_cut


def get_number_of_sticks_cut(sticks: list[int], unique_sticks: list[int]) -> list[int]:
  number_of_sticks_cut = [len(sticks)]
  for stick in unique_sticks:
    sticks = filter_min_value(sticks, stick)
    number_of_sticks_cut.append(len(sticks))
  return number_of_sticks_cut[:-1]
   

def sort_and_remove_duplicates(sticks: list[int]) -> list[int]:
  non_duplicate_sticks = set(sticks)
  sorted_sticks = sorted(non_duplicate_sticks)
  return list(sorted_sticks)


def filter_min_value(sticks: list[int], minimum_value: int) -> list[int]:
  filtered_sticks = list(filter(lambda x: x != minimum_value, sticks))
  return filtered_sticks
