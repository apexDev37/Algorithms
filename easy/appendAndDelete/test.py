import unittest

from main import (
    append_by_empty_string
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
        self.assertEquals(actual, 'Yes' or 'No')
        self.assertEqual(actual, expected)
        
        
        

if __name__ == '__main__':
    unittest.main()
