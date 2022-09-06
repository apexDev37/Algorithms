import unittest

from main import (
    filter_numbers_by_pair,
    filter_numbers_by_digit,
    get_subarray_pairs,
    picking_numbers,
    remove_duplicate_numbers
)

# ---------------------------- Tests ---------------------------- #

"""
Tests for problem: Picking Numbers
Script: main.py
"""


NUMBERS: list[int] = [4, 6, 5, 3, 3, 1]


class TestRemoveDuplicateNumbers(unittest.TestCase):

    def test_should_return_list_of_integers(self) -> None:
        # Given
        expected = type(NUMBERS)

        # When
        actual = remove_duplicate_numbers(sorted(NUMBERS))

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(actual[0], int)

    def test_should_remove_duplicate_numbers_in_given_list(self) -> None:
        # Given
        duplicates = [1, 2, 2, 3, 4, 4, 4, 5, 5]
        expected = [1, 2, 3, 4, 5]

        # When
        actual = remove_duplicate_numbers(duplicates)

        # Then
        self.assertNotEqual(actual, duplicates)
        self.assertEqual(actual, expected)


class TestGetSubarrayPairs(unittest.TestCase):

    def test_should_return_list_of_tuples(self) -> None:
        # Given
        numbers = remove_duplicate_numbers(sorted(NUMBERS))
        expected = type(NUMBERS)

        # When
        actual = get_subarray_pairs(numbers)

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(actual[0], tuple)
        self.assertIsInstance(actual[0][0], int)

    def test_should_return_list_of_tuples_pairs_with_difference_less_than_two(
            self) -> None:
        # Given
        numbers = remove_duplicate_numbers(sorted(NUMBERS))
        expected = [(3, 4), (4, 5), (5, 6)]

        # When
        actual = get_subarray_pairs(numbers)

        # Then
        self.assertEqual(actual, expected)


class TestFilterNumbersByPair(unittest.TestCase):

    def test_should_return_list_with_list_of_integers(self) -> None:
        # Given
        pairs = [(3, 4)]
        expected = type(NUMBERS)

        # When
        actual = filter_numbers_by_pair(pairs, sorted(NUMBERS))

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(actual[0], expected)
        self.assertIsInstance(actual[0][0], int)

    def test_should_create_new_filtered_list_from_subarray_pair(self) -> None:
        # Given
        pairs = [(3, 4), (4, 5), (5, 6)]
        expected = [
            [3, 3, 4],
            [4, 5],
            [5, 6]
        ]

        # When
        actual = filter_numbers_by_pair(pairs, sorted(NUMBERS))

        # Then
        self.assertEqual(actual, expected)


class TestFilterNumbersByDigit(unittest.TestCase):

    def test_should_create_new_list_of_digits_appearing_more_than_once(
            self) -> None:
        # Given
        numbers = [1, 1, 2, 3, 3, 3, 3]
        expected = [
            [1, 1],
            [3, 3, 3, 3]
        ]

        # When
        actual = filter_numbers_by_digit(numbers)

        # Then
        self.assertNotIn(2, actual)
        self.assertEqual(actual, expected)


class TestPickingNumbers(unittest.TestCase):

    def test_should_return_integer(self) -> None:
        # Given
        expected = int

        # When
        actual = picking_numbers(NUMBERS)

        # Then
        self.assertIsInstance(actual, expected)

    def test_should_return_the_length_of_largest_subarray(self) -> None:
        # Given
        expected = 3

        # When
        actual = picking_numbers(NUMBERS)

        # Then
        self.assertEqual(actual, expected)


if __name__ == '__main__':
    unittest.main()
