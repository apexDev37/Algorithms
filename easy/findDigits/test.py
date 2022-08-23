import unittest

from main import (
    find_digits,
    filter_zero_digits,
    get_divisible_digits
)


# ---------------------------- Tests ---------------------------- #

"""
Tests for problem: findDigits
Script: main.py
"""


VALUE: int = 1024
DIGITS: list[int] = list(map(int, str(VALUE)))


class TestFindDigits(unittest.TestCase):

    def test_that_find_digits_returns_int(self) -> None:
        """ Test that function has valid and expected output type"""

        # Given
        expected = type(int)

        # When
        output = find_digits(VALUE)
        actual = type(output)

        # Then
        self.assertIsInstance(actual, expected)

    def test_find_digits_invalid_dividined_argument_exception(self) -> None:
        """
        Test that function raises a Type error
        if argument passed to dividended paramater
        is not an integer
        """

        # Given
        invalid_argument: float = 1024.87654
        expected = 'Required type (int) for argument: dividened'

        # When
        with self.assertRaises(TypeError) as exp_context:
            find_digits(invalid_argument)
        actual = str(exp_context.exception)

        # Then
        self.assertEqual(actual, expected)


class TestFilterOutZeroDigits(unittest.TestCase):

    def test_that_filter_zero_digits_returns_list_of_int(self) -> None:
        """ Test that function has valid and expected output type"""

        # Given
        expected = type(list)

        # When
        output = filter_zero_digits(DIGITS)
        actual = type(output)

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(output[0], int)

    def test_that_filter_zero_digits_filters_out_zero_digits(self) -> None:
        """ 
        Test that function receives a list of digits,
        filters out all zero digits from given parameter,
        returns new list with no zero digits
        """

        # Given
        unfiltered_list: list[int] = [1, 2, 0, 3, 0, 4, 5, 0]
        expected: list[int] = [1, 2, 3, 4, 5]

        # When
        actual = filter_zero_digits(unfiltered_list)
        
        # Then
        self.assertNotEqual(unfiltered_list, actual)
        self.assertNotIn(0, actual)
        self.assertEqual(actual, expected)



class TestGetDivisibleDigits(unittest.TestCase):

    def test_that_get_divisible_digits_returns_list_of_int(self) -> None:
        """ Test that function has valid and expected output type"""

        # Given
        expected = type(int)

        # When
        arguement = filter_zero_digits(DIGITS)
        output = get_divisible_digits(VALUE, arguement)
        actual = type(output)

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(output[0], int)

    def test_that_get_divisible_digits_returns_valid_list_of_divisors(self) -> None:
        """" 
        Test that function returns a list 
        of divisible integers giving a
        remainder of 0
        """

        # Given
        expected: list[int] = [1, 2, 4]         # Using the constant literal: VALUE

        # When
        filtered_digits = filter_zero_digits(DIGITS)
        actual = get_divisible_digits(VALUE, filtered_digits)
        
        # Then
        self.assertAlmostEqual(actual, filtered_digits)
        self.assertEqual(actual, expected)


if __name__ == "__main__":
    unittest.main()
