"""
|| HackerRank
    Problem: Picking Numbers
    Level: Easy
    Author: wanbo
    Author: apexDev37
"""

def picking_numbers(array_size: int, values: list[int]) -> int:
    non_duplicate_values = remove_duplicate_values(sorted(values))
    subarray_pairs = get_subarray_pairs(non_duplicate_values)
    subarrays = filter_values_by_pair(subarray_pairs, sorted(values))
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


def main() -> None:
    array = []
    print(picking_numbers())

if __name__ == "__main__":
    main()
