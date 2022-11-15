import unittest
from datetime import date

from main import (
  is_returned_by_due_date,
  get_fine,
  compute_date_difference,
  compute_fine_amount,
  convert_to_date
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


  def test_should_compute_date_difference_between_the_return_and_due_date(self) -> None:
    
    # Given
    # --- reference constants for date values at the top of the script
    expected: dict = {'day': 27, 'month': 5, 'year': 0} 
    
    # When
    actual: dict = compute_date_difference(RETURN_DATE, DUE_DATE)

    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertEqual(actual.keys(), expected.keys())
    self.assertDictEqual(actual, expected)


  def test_should_compute_fine_based_on_highest_difference_between_dates(self) -> None:
    
    # Given
    difference = compute_date_difference(RETURN_DATE, DUE_DATE)
    expected = 2500

    # When
    actual = compute_fine_amount(difference)
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, type(expected))
    self.assertEqual(actual, expected)
    
  
  def test_should_return_date_object_given_integer_values_representing_date(self) -> None:
    
    # Given
    day, month, year = 28, 7, 2020
    expected = RETURN_DATE
    
    # When
    actual = convert_to_date(day, month, year)
    
    # Then
    self.assertIsNotNone(actual)
    self.assertIsInstance(actual, date)
    self.assertEqual(actual, expected)
    
  
if __name__ == '__main__':
  unittest.main()
