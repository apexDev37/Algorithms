import unittest

from main import (
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
    
    def test_should_return_chair_position_to_receive_the_last_sweet(self) -> None:
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
