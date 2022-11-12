"""
|| HackerRank
    Problem: Library Fine 
    Level: easy
    Author: vatsalchanana
    Implementation: apexDev37
"""

from datetime import date


def library_fine():    
    pass


def is_returned_by_due_date(return_date: date, due_date: date) -> bool:
    difference = return_date - due_date
    return difference.days <= 0


def main() -> None:
    print('Library fine charged: ', library_fine())


if __name__ == "__main__":
    main()
