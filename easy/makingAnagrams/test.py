import unittest
from unittest import TestCase

from main import (
  is_anagram, 
  making_anagrams,
  get_intersection,
)

# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Making Anagrams
Script: main.py
"""


class FunctionalTestCase(TestCase):
  """
  Test case to test the functional and unit logic.
  """
  
  def test_should_return_true_if_two_given_strings_are_anagrams(self) -> None:
    # Given
    s1 = 'debug'
    s2 = 'dgebu'
    expected = True
    
    # When
    actual = is_anagram(s1, s2)
    
    # Then
    self.assertEqual(actual, expected)
  
  def test_should_get_intersection_of_chars_between_two_given_strings(self) -> None:
    # Given
    s1 = 'abcdefabcdefd'
    s2 = 'mnopqcdmnopqc'
    expected = 'cd'
    
    # When
    actual = get_intersection(s1, s2)
    
    # Then
    self.assertIn(expected, s1)
    self.assertIn(expected, s2)
    self.assertCountEqual(actual, expected)
  
class IntegrationTestCase(TestCase):
  """
  Test case to test the integration and behavior of HackerRank entry-point. 
  """

  def setUp(self) -> None:
    self.under_test = making_anagrams

  def test_should_return_zero_deletions_when_two_strings_are_anagrams(self) -> None:
    # Given
    s1 = 'silent'
    s2 = 'listen'
    
    # When
    actual = self.under_test(s1, s2)
        
    # Then
    self.assertEqual(actual, 0)
  
  
if __name__ == '__main__':
  unittest.main()
