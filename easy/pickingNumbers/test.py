import unittest

from main import (
    # filter_values_by_pair,
    # get_max_subarray,    
    get_subarray_pairs,
    # picking_numbers,
    remove_duplicate_values
)

# ---------------------------- Tests ---------------------------- #

"""
Tests for problem: Picking Numbers
Script: main.py
"""


SIZE: int = 6
VALUES: list[int] = [4, 6, 5, 3, 3, 1]


class TestRemoveDuplicateValues(unittest.TestCase):

    def test_should_return_list_of_integers(self) -> None:
        # Given
        expected = type(VALUES)

        # When
        actual = remove_duplicate_values(sorted(VALUES))

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(actual[0], int)

    def test_should_no_duplicate_values_exist_in_return_list(self) -> None:
        # Given
        duplicates = [1, 2, 2, 3, 4, 4, 4, 5, 5]
        expected = [1, 2, 3, 4, 5]
         
        # When
        actual = remove_duplicate_values(duplicates)
        
        # Then
        self.assertNotEqual(actual, duplicates)
        self.assertEqual(actual, expected)


class TestGetSubarrayPairs(unittest.TestCase):

    def test_should_return_list_of_tuples(self) -> None:
        # Given
        values = sorted(remove_duplicate_values(VALUES))
        expected = type(VALUES)

        # When
        actual = get_subarray_pairs(values)

        # Then
        self.assertIsInstance(actual, expected)
        self.assertIsInstance(actual[0], tuple)
        self.assertIsInstance(actual[0][0], int)

    def test_should_return_list_of_tuples_with_difference_less_than_two(self) -> None:
        # Given
        values = sorted(remove_duplicate_values(VALUES))
        expected = [(3, 4), (4, 5), (5, 6)]

        # When
        actual = get_subarray_pairs(values)

        # Then
        self.assertEqual(actual, expected)


class TestFilterValueByPair(unittest.TestCase):

    def test_should_filter_values_by_pair_returns_list(self) -> None:
        pass


if __name__ == '__main__':
    unittest.main()
