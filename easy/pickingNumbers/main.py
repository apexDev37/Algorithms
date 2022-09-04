"""
|| HackerRank
    Problem: Picking Numbers
    Level: Easy
    Author: wanbo
    Author: apexDev37
"""

def picking_numbers(array_size: int, values: list[int]) -> int:
    pass

def remove_duplicate_values(values: list[int]) -> list[int]:
    values_set = {value for value in values}
    return list(values_set)

def get_subarray_pairs(values: list[int]) -> list[tuple]:
    pairs = []
    for v in range(len(values[:-1])):
        if values[v + 1] - values[v] <= 1:
            pairs.append((values[v], values[v + 1]))
    return pairs
    
def main() -> None:
    array = []
    print(picking_numbers())


if __name__ == "__main__":
    main()
