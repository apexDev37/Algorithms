import unittest

from main import (
    is_highscore,
    update_highscore_rank
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

class TestExistsInLeaderboard(unittest.TestCase):
    pass