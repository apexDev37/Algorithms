import unittest

from main import (
    is_perfect_square,
    is_within_range,
    get_first_perfect_square,
    get_perfect_squares,
    next_perfect_square,
    sherlock_and_squares
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Sherlock and Squares
Script: main.py
"""


LOWER_BOUND: int = 1
UPPER_BOUND: int = 9
FIRST_PERFECT_SQUARE = 1
SQUARES: int = 3

class SherlockAndSquares(unittest.TestCase):
    
    def test_should_evaluate_true_if_value_is_a_perfect_square(self) -> None:
        
        # Given
        value = 25
        expected = True
        
        # When
        actual = is_perfect_square(value)
        
        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)
        
    
    def test_should_return_number_of_perfect_squares_in_given_range(self) -> None:
        
        # Given
        expected = SQUARES
        
        # When
        actual = get_perfect_squares(FIRST_PERFECT_SQUARE, LOWER_BOUND, UPPER_BOUND)
        
        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertLessEqual(actual, UPPER_BOUND)
        self.assertEqual(actual, expected)
        
        
    def test_should_retrieve_first_square_root_for_int_in_given_range(self) -> None:
        
        # Given
        expected = 1
        
        # When
        actual = get_first_perfect_square(LOWER_BOUND, UPPER_BOUND)
        
        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertGreaterEqual(actual, LOWER_BOUND)
        self.assertLessEqual(actual, UPPER_BOUND)
        self.assertEqual(actual, expected)
    

    def test_should_evaluate_if_perfect_square_is_within_given_bound(self) -> None:
        
        # Given
        perfect_square = 9
        expected = True
        
        # When
        actual = is_within_range(perfect_square, LOWER_BOUND, UPPER_BOUND)
        
        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)
        
    
    def test_should_get_the_next_perfect_square_in_a_given_range(self) -> None:
        
        # Given
        current_perfect_square = 25
        expected = 36
        
        # When
        actual = next_perfect_square(current_perfect_square)
        
        # Then    
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertGreater(actual, current_perfect_square)
        self.assertEqual(actual, expected)

    
if __name__ == '__main__':
    unittest.main()
