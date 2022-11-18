import unittest

from main import (
  sort_and_remove_duplicates,
  filter_min_value,
  get_number_of_sticks_cut
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Cut The Sticks
Script: main.py
"""


STICKS: list[int] = [9, 1, 8, 2, 9, 9, 8, 3]
UNIQUE_STICKS: list[int] = sort_and_remove_duplicates(STICKS)


class CutTheSticks(unittest.TestCase):
  
  def test_should_sort_and_remove_all_duplicate_values_in_given_list(self) -> None:
    
    # Given
    expected = [1, 2, 3, 8, 9]
    
    # When
    actual = sort_and_remove_duplicates(STICKS)
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertListEqual(actual, expected)
    
    
  def test_should_filter_out_the_minimum_value_in_given_list(self) -> None:
    
    # Given
    minimum_value = min(STICKS)
    expected = [9, 8, 2, 9, 9, 8, 3]
    
    # When
    actual = filter_min_value(STICKS, minimum_value)
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertNotIn(minimum_value, actual)
    self.assertListEqual(actual, expected)
    
    
  def test_should_get_the_number_of_sticks_cut_after_each_iteration(self) -> None:
    
    # Given
    expected = [8, 7, 6, 5, 3]
    
    # When
    actual = get_number_of_sticks_cut(STICKS, UNIQUE_STICKS)
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertListEqual(actual, expected)


if __name__ == '__main__':
  unittest.main()
