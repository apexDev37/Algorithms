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


def get_substring_index(initial:str, desired:str) -> int:
    for tuple in list(enumerate(zip(initial, desired))):    # Tuple format: [0, ('h', 'h')]
        chars = tuple[1]
        if chars[0] != chars[1]:
            substring_index = tuple[0] 
            break
    return substring_index


def main() -> None:
    print('Can append and delete: ', append_and_delete())


if __name__ == "__main__":
    main()
