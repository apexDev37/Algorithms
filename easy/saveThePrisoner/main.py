"""
|| HackerRank
    Problem: Save The Prisoner
    Level: Easy
    Author: sd5869 
    Implementation: apexDev37
"""


def save_the_prisoner(chair_position: int, prisoners: int, sweets: int) -> int:
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


def main() -> None:
    print('Save Prisoner in chair no: ', 
            save_the_prisoner(chair_position=3, prisoners=3, sweets=7))


if __name__ == "__main__":
    main()
