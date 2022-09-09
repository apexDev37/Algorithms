import unittest

from main import (
    is_highscore,
    update_highscore_rank,
    update_leaderboard,
    get_player_rank    
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Climbing the Leaderboard
Script: main.py
"""

LEADERBOARD: list[int] = [100, 100, 50, 40, 40, 20, 10]
PLAYER_SCORES: list[int] = [5, 25, 50, 120]


class TestIsHighscore(unittest.TestCase):

    def test_should_return_boolean_value(self):
        # Given
        score = 200
        expected = type(True and False)
        
        # When
        actual = is_highscore(score, LEADERBOARD)

        # Then
        self.assertIsInstance(actual, expected)

    def test_should_return_true_if_score_is_greater_than_highscore_in_leaderboard(self):
        # Given
        score = 200
        expected = True
        
        # When
        actual = is_highscore(score, LEADERBOARD)

        # Then
        self.assertEqual(actual, expected)


class TestUpdatePlayerRank(unittest.TestCase):

    def test_should_update_rank_to_one_when_player_achieves_new_highscore(self):
        # Given
        high_score = PLAYER_SCORES[-1]
        player_rank = PLAYER_SCORES
        expected = [5, 25, 50, 1]

        # When
        actual = update_highscore_rank(high_score, player_rank)

        # Then
        self.assertIn(1, actual)
        self.assertEqual(actual, expected)

class TestUpdateLeaderboard(unittest.TestCase):
    
    def test_should_update_and_prepare_leaderboard_with_given_player_score(self):
        """"
        Tests that a given score parameter is updated in the leaderboard list.
        Prepares leaderboard list to retrieve the player rank from a given score.

        Asserts:
            - Returns list of integers
            - Score is present in leaderboard
            - Leaderboard is ordered in desc order
        """

        # Given
        score = 70
        expected = [100, 70, 50, 40, 20, 10]

        # When
        actual = update_leaderboard(score, LEADERBOARD)

        # Then
        self.assertIsInstance(actual, list)
        self.assertIsInstance(actual[0], int)
        self.assertIn(score, actual)
        self.assertEqual(actual, expected)
        self.assertGreater(actual[0], actual[-1])

class TestGetPlayerRank(unittest.TestCase):

    def test_should_retrieve_the_player_rank_based_on_single_game_score(self):

        # Given
        score = 40
        expected = 3
        total_ranks = len(set(LEADERBOARD))

        # When
        updated_leaderboard = update_leaderboard(score, LEADERBOARD)
        actual = get_player_rank(score, updated_leaderboard)

        # Then
        self.assertIsInstance(actual, int)
        self.assertGreaterEqual(actual, 1)
        self.assertLessEqual(actual, total_ranks)
        self.assertEqual(actual, expected)
