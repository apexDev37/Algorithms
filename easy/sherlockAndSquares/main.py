"""
|| HackerRank
    Problem: Sherlock and Squares 
    Level: easy
    Author: darkshadows
    Implementation: apexDev37
"""

import math


def sherlock_and_squares(lower_bound:int, upper_bound:int) -> int:
    perfect_square = get_first_perfect_square(lower_bound, upper_bound)
    perfect_squares = get_perfect_squares(perfect_square, lower_bound, upper_bound)
    return perfect_squares


def get_first_perfect_square(lower_bound:int, upper_bound:int) -> int:    
    perfect_square = 0
    while perfect_square == 0:
        if is_perfect_square(lower_bound):
            perfect_square = lower_bound
        lower_bound += 1
    return perfect_square


def is_perfect_square(whole_number:int) -> bool:
    square_root = math.isqrt(whole_number)
    return whole_number == math.pow(square_root, 2)
    

def is_within_range(perfect_square:int, lower_bound:int, upper_bound:int) -> bool:
    return (lower_bound <= perfect_square <= upper_bound)


def get_perfect_squares(perfect_square:int, lower_bound:int, upper_bound:int) -> int:
    number_of_perfect_squares = 0
    while perfect_square <= upper_bound:
        if is_within_range(perfect_square, lower_bound, upper_bound):
            number_of_perfect_squares += 1
        perfect_square = next_perfect_square(perfect_square)
    return number_of_perfect_squares


def next_perfect_square(current_perfect_square:int) -> int:
    square_root = math.isqrt(current_perfect_square)
    square_root += 1
    return int(math.pow(square_root, 2))        

    
def main() -> None:
    # lbound = 1
    # ubound = 9
    lbound = 465868129
    ubound = 988379794
    print('Number of squares: ', sherlock_and_squares(lbound, ubound))


if __name__ == "__main__":
    main()
