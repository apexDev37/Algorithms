"""
|| HackerRank
    Problem: Append and Delete 
    Level: Easy
    Author: zemen
    Implementation: apexDev37
"""


def append_and_delete(initial:str, desired:str, moves:int) -> str:
    response = append_by_empty_string(initial, desired, moves)
    if matching_chars(initial, desired):
        response = append_by_matching_chars(initial, desired, moves)
    if response == 'No':
        response = append_by_substrings(initial, desired, moves)
    return response


def append_by_empty_string(initial:str, desired:str, moves:int) -> str:
    delete_moves = len(initial)
    append_moves = len(desired)
    total_moves = delete_moves + append_moves
    return 'Yes' if (total_moves <= moves) else 'No'


# TODO: Refactor function 
def matching_chars(initial:str, desired:str) -> bool:
    return (   
        initial == len(initial) * initial[0]
        and desired == len(desired) * desired[0]
        and initial[0] == desired[0]
    )


def append_by_matching_chars(initial:str, desired:str, moves:int) -> str:
    response = 'No'
    difference = abs(len(desired) - len(initial))
    if ((difference % 2) == (moves % 2)
        or initial == desired): response = 'Yes'
    return response


def append_by_substrings(initial:str, desired:str, moves:int) -> str:
    index = get_substring_index(initial, desired)
    substring_lengths = get_substring_lengths(index, initial, desired)
    response = 'Yes' if (substring_lengths == moves) else 'No'
    return response    


def get_substring_index(initial:str, desired:str) -> int:
    substring_index = 0
    for tuple in list(enumerate(zip(initial, desired))):    # Tuple format: [0, ('h', 'h')]
        chars = tuple[1]
        if chars[0] != chars[1]:
            substring_index = tuple[0] 
            break
    return substring_index


def get_substring_lengths(index:int, initial:str, desired:str) -> int:
    initial_substring = initial[index:]
    desired_substring = desired[index:]
    return len(initial_substring) + len(desired_substring)


def main() -> None:
    print('Can append and delete: ', 
            append_and_delete(initial='aba', desired='aaa', moves=7))


if __name__ == "__main__":
    main()
