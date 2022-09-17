import unittest

from main import (
    climbing_leaderboard,
    get_player_rank,
    update_player_ranks    
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Climbing the Leaderboard
Script: main.py
"""


LEADERBOARD: list[int] = [100, 100, 50, 40, 40, 20, 10]
PLAYER_SCORES: list[int] = [5, 25, 50, 120]


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

class TestUpdatePlayerRank(unittest.TestCase):

    def test_should_update_single_player_rank_by_given_score(self):

        # Given
        rank = 2
        score = 50
        expected = [2]

        # When
        actual = update_player_ranks(score, LEADERBOARD)
        
        # Then
        self.assertIsInstance(actual, list)
        self.assertIsInstance(actual[0], int)
        self.assertIn(rank, actual)
        self.assertNotIn(score, actual)
        self.assertEqual(actual, expected)

class TestClimbingTheLeaderboard(unittest.TestCase):

    def test_should_return_player_ranks_from_leaderboard_for_all_player_scores(self):

        # Given
        expected = [6, 4, 2, 1]

        # When
        actual = climbing_leaderboard(LEADERBOARD, PLAYER_SCORES)
        
        # Then
        self.assertIsInstance(actual, list)
        self.assertIsInstance(actual[0], int)
        self.assertEqual(actual, expected)


if __name__ == '__main__':
    unittest.main()
