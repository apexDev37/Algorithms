import unittest

from main import (
    append_and_delete,
    append_by_empty_string,
    get_substring_index,
    get_substring_lengths,
    matching_chars,
    append_by_matching_chars,
    append_by_substrings
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

    def test_should_compute_if_can_create_empty_string_and_append_desired_string(
            self) -> None:
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

    def test_should_compute_and_return_substring_lengths_to_append_and_delete(
            self) -> None:
        """
        Test behavior to get the lengths of the substrings
        in the initial and desired string. Use the return
        value to determine if there are enough moves to
        perform the append and delete.
        """

        # Given
        index = 6
        expected = 9

        # When
        actual = get_substring_lengths(index, INITIAL_STRING, DESIRED_STRING)

        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)

    def test_should_respond_yes_or_no_based_on_append_and_delete_moves(
            self) -> None:
        """
        Test the append and delete functionality to create
        the desired string from the initial string based
        on the given moves to append and delete
        """

        # Given
        expected = 'Yes'

        # When
        actual = append_and_delete(INITIAL_STRING, DESIRED_STRING, MOVES)

        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)

    def test_should_return_yes_if_enough_moves_to_append_and_delete_matching_char_strings(
            self) -> None:
        """
        Test if able to append and delete the initial string
        to the desired string if both strings have matching
        characters without considering string length.
        """

        # Given
        initial_string = 'aaaaa'
        desired_string = 'aaaaaaa'
        moves = 1
        expected = 'No'

        # When
        actual = append_by_matching_chars(
            initial_string, desired_string, moves)

        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)

    def test_should_return_true_if_strings_have_same_chars_sequence(
            self) -> None:
        """
        Test should return a boolean value based on
        if the initial and desired string both have a
        string sequence of a single matching char
        regardless of the length of the two strings.
        """

        # Given
        initial_string = 'aaaaa'
        desired_string = 'aaaaaaa'
        expected = True

        # When
        actual = matching_chars(initial_string, desired_string)

        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)

    def test_should_return_yes_if_can_replace_substrings_to_attain_desired_strings(
            self) -> None:
        """
        Test should determine if the number of available moves
        equals the sum of the lengths of the differing substrings
        in the initial and desired string.
        """

        # Given
        expected = 'Yes'

        # When
        actual = append_by_substrings(INITIAL_STRING, DESIRED_STRING, MOVES)

        # Then
        self.assertIsNotNone(actual)
        self.assertIsInstance(actual, type(expected))
        self.assertEqual(actual, expected)


if __name__ == '__main__':
    unittest.main()
