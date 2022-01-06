"""Problem 1."""

# If we list all the natural numbers below 10 that are multiples of 3
# or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

# Find the sum of all the multiples of 3 or 5 below 1000.


def summults(f1, f2, lim):
    """Find the sum of all the multipls of f1 or f2 below lim."""
    return sum(set(range(0, lim, f1)) | set(range(0, lim, f2)))
