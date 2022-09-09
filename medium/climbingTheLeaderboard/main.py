"""
|| HackerRank
    Problem: Climbing the Leaderboard 
    Level: medium
    Author: Shafaet
    Implementation: apexDev37
"""


def climbing_leaderboard(leaderboard:list[int], player_scores:list[int]) -> list[int]:
    pass

def update_highscore_rank(score:int, player_rank:list[int]) -> list[int]:
    player_rank[player_rank.index(score)] = 1
    return player_rank

def is_highscore(score:int, leaderboard:list[int]) -> bool:
    return score > leaderboard[0]

def main() -> None:
    leaderboard = [100, 90, 90, 80, 75, 60]
    player_scores = [50, 65, 77, 90, 102]
    print('Player Ranks: ', climbing_leaderboard(leaderboard, player_scores))


if __name__ == "__main__":
    main()
