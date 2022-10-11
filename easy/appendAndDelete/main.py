"""
|| HackerRank
    Problem: Append and Delete 
    Level: Easy
    Author: zemen
    Implementation: apexDev37
"""


def append_and_delete():
    pass


def append_by_empty_string(initial:str, desired:str, moves:int) -> str:
    delete_moves = len(initial)
    append_moves = len(desired)
    total_moves = delete_moves + append_moves
    return 'Yes' if (total_moves <= moves) else 'No'


def main() -> None:
    print('Can append and delete: ', append_and_delete())


if __name__ == "__main__":
    main()
