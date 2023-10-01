import unittest
from unittest import TestCase

from main import (
    is_anagram,
    making_anagrams,
    get_intersection,
    truncate_symmetric_diff,
    count_char_frequency,
    sum_frequency_diff,
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

  def test_should_get_intersection_of_chars_between_two_given_strings(
          self) -> None:
    # Given
    s1 = 'abcdefabcdefd'
    s2 = 'mnopqcdmnopqc'
    expected = 'cd'

    # When
    actual = get_intersection(s1, s2)

    # Then
    self.assertCountEqual(actual, expected)

  def test_should_truncate_non_common_chars_in_two_given_strings(self) -> None:
    # Given
    s1 = 'a'
    s2 = 'axyz'
    expected = 'xyz'

    # When
    actual = truncate_symmetric_diff(s1, s2)

    # Then
    self.assertNotIn(expected, actual['s1'] and actual['s2'])

  def test_should_count_frequency_for_each_unique_char_in_given_string(
          self) -> None:
    # Given
    s1 = 'bacdc'
    intersection = 'abcd'
    expected = {'a': 1, 'b': 1, 'c': 2, 'd': 1, }

    # When
    actual = count_char_frequency(intersection, s1)

    # Then
    self.assertDictEqual(actual, expected)

  def test_should_sum_the_difference_for_each_char_frequency_for_two_given_strings(
          self) -> None:
    # Given
    s1 = {'b': 1, 'a': 1, 'c': 2, 'd': 1}
    s2 = {'b': 1, 'a': 1, 'c': 1, 'd': 2}
    expected = 2

    # When
    actual = sum_frequency_diff(s1, s2)

    # Then
    self.assertNotEqual(s1, s2)
    self.assertEqual(actual, expected)


class IntegrationTestCase(TestCase):
  """
  Test case to test the integration and behavior of HackerRank entry-point.
  """

  def setUp(self) -> None:
    self.under_test = making_anagrams

  def test_should_return_zero_deletions_when_two_strings_are_anagrams(
          self) -> None:
    # Given
    s1 = 'silent'
    s2 = 'listen'

    # When
    actual = self.under_test(s1, s2)

    # Then
    self.assertEqual(actual, 0)

  def test_should_return_number_of_deletions_required_to_make_anagrams(
          self) -> None:
    # Given
    s1 = 'abcd'
    s2 = 'acde'
    expected = 2  # be

    # When
    actual = self.under_test(s1, s2)

    # Then
    self.assertEqual(actual, expected)


if __name__ == '__main__':
  unittest.main()
