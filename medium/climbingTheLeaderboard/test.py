import unittest

from main import (
    climbing_leaderboard,
    get_player_ranks,
    get_player_rank
)


# ---------------------------- Tests ---------------------------- #


"""
Tests for problem: Climbing the Leaderboard
Script: main.py
"""


LEADERBOARD: list[int] = [100, 100, 50, 40, 40, 20, 10]
PLAYER_SCORES: list[int] = [5, 25, 50, 120]


class TestGetPlayerRank(unittest.TestCase):

    def test_should_retrieve_the_player_rank_based_on_single_game_score(
            self) -> None:

        # Given
        score = 50
        expected = 2
        total_ranks = len(set(LEADERBOARD))

        # When
        updated_leaderboard = list(dict.fromkeys(LEADERBOARD))[::-1]
        actual = get_player_rank(score, updated_leaderboard)

        # Then
        self.assertIsInstance(actual, int)
        self.assertGreaterEqual(actual, 1)
        self.assertLessEqual(actual, total_ranks)
        self.assertEqual(actual, expected)


class TestGetPlayerRanks(unittest.TestCase):

    def test_should_get_player_ranks_based_on_given_player_scores(
            self) -> None:

        # Given
        expected = [1, 2, 4, 6]

        # When
        leaderboard = list(dict.fromkeys(LEADERBOARD))[::-1]
        actual = get_player_ranks(leaderboard, PLAYER_SCORES)

        # # Then
        self.assertIsInstance(actual, list)
        self.assertIsInstance(actual[0], int)
        self.assertEqual(actual, expected)


class TestClimbingTheLeaderboard(unittest.TestCase):

    def test_should_return_player_ranks_from_leaderboard_for_all_player_scores(
            self) -> None:

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
