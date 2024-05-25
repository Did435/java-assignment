def findUnion(a, b):
    union_set = set()
    
    for num in a:
        union_set.add(num)
        
    for num in b:
        union_set.add(num)
        
    return len(union_set)

# Example
a = [1, 2, 3, 4, 5 ,4]
b = [3, 4, 5, 6, 7]
print(findUnion(a, b))  # Output: 7
