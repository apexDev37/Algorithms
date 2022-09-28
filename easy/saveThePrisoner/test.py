import unittest

from main import (
    get_remainder_sweets,
    save_the_prisoner
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Save The Prisoner
Script: main.py
"""


PRISONERS: int = 7
SWEETS: int = 19
CHAIR_POSITION: int = 2


class TestSaveThePrisoner(unittest.TestCase):

    def test_should_compute_modulus_of_sweets_and_prisoners(self) -> None:
        """
        || Test for function: get_remainder_sweets
            Checks if the number of sweets is greater
            than the number of prisoners and computes
            the modulus if greater.
        """

        # Given
        expected = 5

        # When
        actual = get_remainder_sweets(PRISONERS, SWEETS)

        # Then
        self.assertIsInstance(actual, int)
        self.assertEqual(actual, expected)

    def test_should_return_chair_position_to_receive_the_last_sweet(
            self) -> None:
        # Given
        expected = 6

        # When
        actual = save_the_prisoner(CHAIR_POSITION, PRISONERS, SWEETS)

        # Then
        self.assertIsInstance(actual, type(expected))
        self.assertGreaterEqual(actual, 1)
        self.assertLessEqual(actual, PRISONERS)
        self.assertEqual(actual, expected)


if __name__ == '__main__':
    unittest.main()
