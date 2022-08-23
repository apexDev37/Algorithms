"""
|| HackerRank
    Problem: FindDigits
    Level: Easy
    Author: apexDev37
"""

from typing import Any


def find_digits(dividened: int) -> int:
    if valid_dividened_arg(dividened):
        digits = [int(digit) for digit in str(dividened)]
        filtered_digits = filter_zero_digits(digits)
        divisors = get_divisible_digits(dividened, filtered_digits)
        return len(divisors)


def valid_dividened_arg(dividened: Any) -> bool:
    if type(dividened) is not int:
        raise TypeError('Required type (int) for argument: dividened')
    return True

def filter_zero_digits(digits: list[int]) -> list[int]:
    non_zero_digits = list(filter(lambda x: x != 0, digits))
    return non_zero_digits


def get_divisible_digits(dividened: int, digits: list[int]) -> list[int]:
    divisors = [divisor for divisor in digits 
                if (dividened % divisor == 0)]
    return divisors


def main() -> None:
    print(find_digits(1024))


if __name__ == "__main__":
    main()
