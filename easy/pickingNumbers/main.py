"""
|| HackerRank
    Problem: Picking Numbers
    Level: Easy
    Author: wanbo
    Implementation: apexDev37
"""


def picking_numbers(numbers: list[int]) -> int:
    non_duplicate_numbers = remove_duplicate_numbers(sorted(numbers))
    subarray_pairs = get_subarray_pairs(non_duplicate_numbers)
    subarrays = filter_numbers_by_pair(subarray_pairs, sorted(numbers))
    subarrays += filter_numbers_by_digit(sorted(numbers))
    return max(len(subarray) for subarray in subarrays)

def remove_duplicate_numbers(numbers: list[int]) -> list[int]:
    numbers_set = {number for number in numbers}
    return list(numbers_set)

def get_subarray_pairs(numbers: list[int]) -> list[tuple]:
    pairs = []
    for n in range(len(numbers[:-1])):
        if numbers[n + 1] - numbers[n] <= 1:
            pairs.append((numbers[n], numbers[n + 1]))
    return pairs

def filter_numbers_by_pair(subarray_pairs: tuple, numbers: list[int]) -> list[int]:
    return [list(filter(lambda x: x in subarray, numbers)) 
            for subarray in subarray_pairs]

def filter_numbers_by_digit(numbers: list[int]) -> list[list[int]]:
    subsets = [list(filter(lambda x: x == number, numbers)) for number in set(numbers)]
    return [subset for subset in subsets if len(subset) > 1]

def main() -> None:
    numbers = [1, 2, 2, 3, 1, 2]
    print('Largest subarray length: ', picking_numbers(numbers))

if __name__ == "__main__":
    main()
