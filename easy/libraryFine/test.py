import unittest
from datetime import date

from main import (
  is_returned_by_due_date,
  get_fine
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Library Fine
Script: main.py
"""


DUE_DATE: date = date(2020, 2, 1)
RETURN_DATE: date = date(2020, 7, 28)


class LibraryFine(unittest.TestCase):
  
  def test_should_check_if_book_is_returned_on_or_before_due_date(self) -> None:
  
    # Given
    before_due_date: date = date(2020, 2, 1)
    expected = True 
    
    # When
    actual = is_returned_by_due_date(before_due_date, DUE_DATE)
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertEqual(actual, expected)
  
  def test_should_charge_zero_fine_for_book_return_on_or_before_due_date(self) -> None:
    
    # Given
    before_due_date: date = date(2020, 1, 1)
    expected = 0
    
    # When
    actual = get_fine(before_due_date, DUE_DATE) 
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertEqual(actual, expected)



if __name__ == '__main__':
  unittest.main()
