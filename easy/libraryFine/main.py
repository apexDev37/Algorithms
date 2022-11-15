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


def convert_to_date(day: int, month: int, year: int) -> date:
    converted_date = date(year, month, day)
    return converted_date


def compute_difference(return_date: date, due_date: date) -> dict:
    return {
        'year': return_date.year - due_date.year,
        'month': return_date.month - due_date.month,
        'day': return_date.day - due_date.day 
    }


def get_fine(return_date: date, due_date: date) -> int:
    fine = 0
    if is_returned_by_due_date(return_date, due_date):
        fine = 0
    return fine


def is_returned_by_due_date(return_date: date, due_date: date) -> bool:
    difference = return_date - due_date
    return difference.days <= 0


def compute_fine_amount(difference: dict) -> None:
    for key, diff in difference.items():
        if diff > 0:
            if key == 'year':
                return 10000
            if key == 'month':
                return diff * 500
            if key == 'day':
                return diff * 15


def main() -> None:
    print('Library fine charged: ', library_fine())


if __name__ == "__main__":
    main()
