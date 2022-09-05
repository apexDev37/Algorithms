"""
|| HackerRank
    Problem: Picking Numbers
    Level: Easy
    Author: wanbo
    Author: apexDev37
"""


def picking_numbers(values: list[int]) -> int:
    non_duplicate_values = remove_duplicate_values(sorted(values))
    subarray_pairs = get_subarray_pairs(non_duplicate_values)
    subarrays = filter_values_by_pair(subarray_pairs, sorted(values))
    subarrays += filter_values_by_digit(sorted(values))
    return max(len(subarray) for subarray in subarrays)

def remove_duplicate_values(values: list[int]) -> list[int]:
    values_set = {value for value in values}
    return list(values_set)

def get_subarray_pairs(values: list[int]) -> list[tuple]:
    pairs = []
    for v in range(len(values[:-1])):
        if values[v + 1] - values[v] <= 1:
            pairs.append((values[v], values[v + 1]))
    return pairs

def filter_values_by_pair(subarray_pairs: tuple, values: list[int]) -> list[int]:
    return [list(filter(lambda x: x in subarray, values)) 
            for subarray in subarray_pairs]

def filter_values_by_digit(values: list[int]) -> list[list[int]]:
    subsets = [list(filter(lambda x: x == g, values)) for g in set(values)]
    return [subset for subset in subsets if len(subset) > 1]

def main() -> None:
    numbers = [1, 2, 2, 3, 1, 2]
    print('Largest subarray lenght: ', picking_numbers(numbers))

if __name__ == "__main__":
    main()
