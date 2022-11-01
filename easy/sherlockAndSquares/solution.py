"""
|| HackerRank
    Problem: Sherlock and Squares
    Level: easy
    Author: darkshadows
    Implementation: apexDev37

    Status: PASSED - '10/10 test cases passed'
"""


def squares(lower_bound: int, upper_bound: int) -> int:
    perfect_square = get_first_perfect_square(lower_bound, upper_bound)
    perfect_squares = get_perfect_squares(
        perfect_square, lower_bound, upper_bound)
    return perfect_squares


def get_first_perfect_square(lower_bound: int, upper_bound: int) -> int:
    first_perfect_square = 0
    for value in range(lower_bound, upper_bound + 1):
        if is_perfect_square(value):
            first_perfect_square = value
            break
    return first_perfect_square


def is_perfect_square(whole_number: int) -> bool:
    square_root = math.isqrt(whole_number)
    return whole_number == math.pow(square_root, 2)


def get_perfect_squares(
        perfect_square: int,
        lower_bound: int,
        upper_bound: int) -> int:
    number_of_perfect_squares = 0
    while perfect_square <= upper_bound:
        if is_within_range(perfect_square, lower_bound, upper_bound):
            number_of_perfect_squares += 1
        perfect_square = next_perfect_square(perfect_square)
    return number_of_perfect_squares


def is_within_range(
        perfect_square: int,
        lower_bound: int,
        upper_bound: int) -> bool:
    return (lower_bound <= perfect_square <= upper_bound)


def next_perfect_square(current_perfect_square: int) -> int:
    square_root = math.isqrt(current_perfect_square)
    square_root += 1
    return int(math.pow(square_root, 2))
