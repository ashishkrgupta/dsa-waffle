def contains_duplicate(numbers):
    for i in range(len(numbers)):
        j = i + 1
        while j < len(numbers):
            if numbers[i] == numbers[j]:
                return True
            j += 1
    return False

# with O(n) complexity


def contains_duplicate_with_set(numbers):
    my_set = []
    for i in range(len(numbers)):
        if numbers[i] in my_set:
            return True
        else:
            my_set.append(numbers[i])
    return False


if __name__ == "__main__":
    numbs = [1, 2, 3, 1]
    print(contains_duplicate(numbs))
    print(contains_duplicate_with_set(numbs))

    numbs = [1, 2, 3, 4]
    print(contains_duplicate(numbs))
    print(contains_duplicate_with_set(numbs))

    numbs = [1, 2, 3, 4, 4]
    print(contains_duplicate(numbs))
    print(contains_duplicate_with_set(numbs))
