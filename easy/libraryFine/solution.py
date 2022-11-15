"""
|| HackerRank
    Problem: Library Fine
    Level: easy
    Author: vatsalchanana
    Implementation: apexDev37

    Status: PASSED - '17/17 test cases passed'
"""

from datetime import date


def library_fine(d1, m1, y1, d2, m2, y2):
  return_date = convert_to_date(d1, m1, y1)
  due_date = convert_to_date(d2, m2, y2)
  return get_fine(return_date, due_date)


def convert_to_date(day: int, month: int, year: int) -> date:
  converted_date = date(year, month, day)
  return converted_date


def get_fine(return_date: date, due_date: date) -> int:
  fine = 0
  if not is_returned_by_due_date(return_date, due_date):
    difference = compute_date_difference(return_date, due_date)
    fine = compute_fine_amount(difference)
  return fine


def is_returned_by_due_date(return_date: date, due_date: date) -> bool:
  difference = return_date - due_date
  return difference.days <= 0


def compute_date_difference(return_date: date, due_date: date) -> dict:
  return {
    'year': return_date.year - due_date.year,
    'month': return_date.month - due_date.month,
    'day': return_date.day - due_date.day
  }


def compute_fine_amount(difference: dict) -> None:
  for key, diff in difference.items():
    if diff > 0:
      if key == 'year':
        return 10000
      if key == 'month':
        return diff * 500
      if key == 'day':
        return diff * 15
