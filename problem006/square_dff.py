#!/usr/bin/python


# The sum of the squares of the first ten natural numbers is,
# 1 pow 2 + 2 pow 2 + ... + 10 pow 2 = 385

# The square of the sum of the first ten natural numbers is,
# (1 + 2 + ... + 10) pow 2 = 55 pow 2 = 3025
# Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640

# Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


def sum_of_squares(n):
	"Calculates the sum of squares of all integers up to n"
	
	return n * (n + 1) * (2 * n + 1) / 6

def square_of_sum(n):
	"Calculated the square of the sum of all integers up to n (using gauss formula)"

	gauss = n * (n + 1) / 2

	return gauss * gauss


diff = square_of_sum(100) - sum_of_squares(100)

print "Difference : ", diff
