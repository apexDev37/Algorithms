import unittest

from main import (
    count_char_frequency,
    game_of_thrones,
    is_palindrome,
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Game of Thrones - I
Script: main.py
"""


class TestCaseUnit(unittest.TestCase):
  """"
  Tests to cover unit and concrete implementation.
  """

  def test_should_map_char_to_frequency_for_given_string(self) -> None:
    # Given
    s = 'baaxaab'
    expected = {'b': 2, 'a': 4, 'x': 1}

    # When
    actual = count_char_frequency(s)

    # Then
    self.assertDictEqual(actual, expected)

  def test_should_only_have_one_char_with_odd_frequency_in_map(self) -> None:
    # Given
    char_freq_map = {'b': 2, 'a': 4, 'x': 1}
    expected = True

    # When
    actual = is_palindrome(char_freq_map)

    # Then
    self.assertIsInstance(actual, bool)
    self.assertEqual(actual, expected)


class TestCaseIntegration(unittest.TestCase):
  """
  Tests to cover the integration and behavior of HackerRank entry-point.

  Expected HackerRank return value: 'YES' | 'NO'
  """

  def setUp(self) -> None:
    super().setUp()
    self.entry_point = game_of_thrones

  def test_should_return_binary_answer_if_string_can_be_palindrome(
          self) -> None:
    # Given
    s = 'cdefghmnopqrstuvw'
    expected = 'NO'

    # When
    actual = self.entry_point(s)

    # Then
    self.assertIsInstance(actual, str)
    self.assertIn(actual, ['YES', 'NO'])
    self.assertEqual(actual, expected)


if __name__ == '__main__':
  unittest.main()
