"""
|| HackerRank
    Problem: Climbing the Leaderboard 
    Level: medium
    Author: Shafaet
    Implementation: apexDev37

    Status: PASSED - 11 test cases
"""

import bisect

def climbingLeaderboard(leaderboard, player_scores):
    leaderboard = list(dict.fromkeys(leaderboard))[::-1]
    player_ranks = get_player_ranks(leaderboard, player_scores)
    return player_ranks[::-1]


def get_player_ranks(leaderboard:list[int], player_scores:list[int]) -> list[int]:
    player_ranks = []
    for score in reversed(player_scores):
        rank = get_player_rank(score, leaderboard)
        player_ranks.append(rank)
    return player_ranks


def get_player_rank(score:int, leaderboard:list[int]) -> int:
    player_rank = bisect.bisect_right(leaderboard, score)
    return (len(leaderboard) - player_rank) + 1
