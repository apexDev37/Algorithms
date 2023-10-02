import unittest

from main import (
  count_char_frequency,
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Game of Thrones - I
Script: main.py
"""


class TestCaseUnit(unittest.TestCase):
  """"
  Tests to cover functional and unit logic.
  """
  
  def test_should_map_char_to_frequency_for_given_string(self) -> None:
    # Given
    s = 'baaxaab'
    expected = {'b': 2, 'a': 4, 'x': 1}

    # When
    actual = count_char_frequency(s)
    
    # Then
    self.assertDictEqual(actual, expected)

  
class TestCaseIntegration(unittest.TestCase):
  """
  Tests to cover the integration and behavior of HackerRank entry-point.
  """
  pass


if __name__ == '__main__':
  unittest.main()
