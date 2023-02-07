# Recursion

## When to Use/Avoid Recursion

- **Use**
    1. Break a problem into similar sub-problems
    2. Be okay with extra overhead (time and space) that comes with it
    3. You want a QUICK solution, not an EFFICIENT one
    4. Traversing a tree
    5. When we use memorization in recursion

- **Avoid**
    1. Time and space complexity ACTUALLY matters
    2. When memory is IMPORTANT. Recursion takes up more
    3. Recursion can be SLOW

## Recursion in 3 Steps using Factorial

1. Recursive Case - The Flow
    - n! = n *( n - 1 )* (n-2) *...* 2 * 1
2. Base Case - The stopping criterion
    - 0! = 1
    - 1! = 1
3. Unintentional case - the constraint
    - Negative numbers

## Fibonacci and Recursion

- Each number is the sum of the two preceding ones and the sequence starts from 0 and 1
