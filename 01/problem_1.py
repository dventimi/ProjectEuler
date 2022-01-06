# If we list all the natural numbers below 10 that are multiples of 3
# or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

# Find the sum of all the multiples of 3 or 5 below 1000.


def sumargs(*args):
    """Compute the sum of the arguments."""
    return sum(args)


def multiples(limit, *args):
    sorted(args, reverse=True)
    
    


def multiples(base=1, limit=10):
    """Compute multiples of base up to limit."""
    return list(range(0, limit, base))
