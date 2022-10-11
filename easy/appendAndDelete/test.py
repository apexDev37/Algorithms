import unittest

from main import (
    append_by_empty_string,
    get_substring_index
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Append and Delete
Script: main.py
"""


INITIAL_STRING: str = 'hackerhappy'
DESIRED_STRING: str = 'hackerrank'
MOVES: int = 9


class TestAppendAndDelete(unittest.TestCase):
    
    def test_should_compute_if_can_create_empty_string_and_append_desired_string(self) -> None:
        """ 
            Test to determine if the initial string can be
            converted to an empty string (delete) and 
            replaced by desired string (append) all in
            the given amount of moves. 
        """
        
        # Given
        # --- Reference constant values defined above
        expected = 'No'
        
        # When
        actual = append_by_empty_string(INITIAL_STRING, DESIRED_STRING, MOVES)
        
        # Then
        self.assertIsInstance(actual, type(expected))
        self.assertIn(actual, ['Yes', 'No'])
        self.assertEqual(actual, expected)
        
        
    def test_should_get_the_index_of_first_occurring_char_change(self) -> None:
        """
        Test behavior to retrieve the index of the first
        character which is not equal in the initial and
        desired strings. 
            Initial: hackerhappy
            Desired: hackerrank
            Index: 6 ('h' != 'r')
        """
        
        # Given
        # --- Reference constant values defined above
        expected = 6

        # When 
        actual = get_substring_index(INITIAL_STRING, DESIRED_STRING)
        
        # Then 
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertLessEqual(actual, len(INITIAL_STRING))
        self.assertEqual(actual, expected)


if __name__ == '__main__':
    unittest.main()
