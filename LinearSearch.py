def linear_search(arr, target):
    """
    Searches for a target value within a list.
    Returns the index of the target if found, otherwise returns -1.
    """
    # Loop through the list using enumerate to track both index and value
    for index, element in enumerate(arr)
        if element == target:
            return index  # Match found! Return the index immediately
            
    return -1  # Element was not in the list

# --- Example Usage ---
if __name__ == "__main__":
    my_list = [23, 45, 12, 78, 56, 90]
    target = 78

    print(f"Searching for {target} in {my_list}...")
    result = linear_search(my_list, target)

    if result != -1:
        print(f"Success: Element found at index {result}.")
    else:
        print("Result: Element not found in the list.")
