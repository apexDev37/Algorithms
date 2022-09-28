"""
|| HackerRank
    Problem: Save The Prisoner
    Level: Easy
    Author: sd5869
    Implementation: apexDev37

    Status: PASSED - 11 test cases passed
"""


def saveThePrisoner(chair_position: int, prisoners: int, sweets: int) -> int:
    sweets = get_remainder_sweets(prisoners, sweets)
    new_position = chair_position + sweets
    prisoner = get_chair_position(new_position, prisoners)
    return prisoner


def get_remainder_sweets(prisoners: int, sweets: int) -> int:
    return (sweets % prisoners if sweets > prisoners
            else sweets)


def get_chair_position(new_position: int, prisoners: int) -> int:
    if new_position > prisoners:
        new_position -= prisoners
    return (prisoners if new_position == 1
            else new_position - 1)
