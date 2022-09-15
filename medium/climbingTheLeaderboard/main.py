"""
|| HackerRank
    Problem: Climbing the Leaderboard 
    Level: medium
    Author: Shafaet
    Implementation: apexDev37
"""

import bisect

def climbing_leaderboard(leaderboard:list[int], player_scores:list[int]) -> list[int]:
    player_ranks = []
    leaderboard = list(dict.fromkeys(leaderboard))[::-1]
    for score in reversed(player_scores):
        player_ranks.extend(update_player_ranks(score, leaderboard))
    return list(reversed(player_ranks))

def update_highscore_rank(score:int, player_ranks:list[int]) -> list[int]:
    player_ranks[player_ranks.index(score)] = 1
    return player_ranks

def is_highscore(score:int, leaderboard:list[int]) -> bool:
    return score > leaderboard[0]

def update_leaderboard(score:int, leaderboard:list[int]) -> list[int]:
    updated_leaderboard = []
    updated_leaderboard.extend(leaderboard)
    updated_leaderboard.append(score)
    non_duplicates = set(updated_leaderboard)
    return sorted(non_duplicates, reverse=True)
    
def get_player_rank(score:int, leaderboard:list[int]) -> int:
    player_rank = leaderboard.index(score)
    return player_rank + 1

def update_player_ranks(score:int, leaderboard:list[int]) -> list[int]:
    player_ranks = []
    if is_highscore(score, leaderboard):
        player_ranks.append(1)
    else:
        updated_leaderboard =  update_leaderboard(score, leaderboard)
        rank = get_player_rank(score, updated_leaderboard)
        player_ranks.append(rank)
    return player_ranks

def main() -> None:
    leaderboard = [100, 100, 50, 40, 40, 20, 10]
    player_scores = [5, 25, 50, 120]
    print('Player Ranks: ', climbing_leaderboard(leaderboard, player_scores))


if __name__ == "__main__":
    main()
