"""Problem 1."""

# If we list all the natural numbers below 10 that are multiples of 3
# or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

# Find the sum of all the multiples of 3 or 5 below 1000.


def summults(lim, *m):
    """Find the sum of all the multiples of f1 or f2 below l."""
    y = set()
    for f in m:
        y = y | set(range(0, lim, f))
    return sum(y)
