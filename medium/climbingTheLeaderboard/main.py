"""
|| HackerRank
    Problem: Climbing the Leaderboard
    Level: medium
    Author: Shafaet
    Implementation: apexDev37
"""

import bisect


def climbing_leaderboard(
        leaderboard: list[int],
        player_scores: list[int]) -> list[int]:
    leaderboard = list(dict.fromkeys(leaderboard))[::-1]
    player_ranks = get_player_ranks(leaderboard, player_scores)
    return player_ranks[::-1]


def get_player_ranks(
        leaderboard: list[int],
        player_scores: list[int]) -> list[int]:
    player_ranks = []
    for score in reversed(player_scores):
        rank = get_player_rank(score, leaderboard)
        player_ranks.append(rank)
    return player_ranks


def get_player_rank(score: int, leaderboard: list[int]) -> int:
    player_rank = bisect.bisect_right(leaderboard, score)
    return (len(leaderboard) - player_rank) + 1


def main() -> None:
    leaderboard = [100, 100, 50, 40, 40, 20, 10]
    player_scores = [5, 25, 50, 120]
    print('Player Ranks: ', climbing_leaderboard(leaderboard, player_scores))


if __name__ == "__main__":
    main()
