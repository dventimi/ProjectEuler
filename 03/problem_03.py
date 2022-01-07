"""Problem 03."""

# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?


import math


def primeFactors(n):
    """Find the prime factors of n."""
    factors = []
    while n % 2 == 0:
        factors.append(2)
        n = int(n / 2)
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            factors.append(i)
            n = int(n / i)
    if n > 2:
        factors.append(n)
    return factors
