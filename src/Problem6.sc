
/** The sum of the squares of the first ten natural numbers is,
  *     1^2 + 2^2 + ... + 10^2 = 385
  *     The square of the sum of the first ten natural numbers is,
  *     (1 + 2 + ... + 10)^2 = 55^2 = 3025
  *     Hence the difference between the sum of the squares of the first ten
  *     natural numbers and the square of the sum is 3025 − 385 = 2640.
  *     Find the difference between the sum of the squares of the first one
  *     hundred natural numbers and the square of the sum.
  */

val LIMIT = 100

def sumSquares(limit: Int, current: Int = 1, acc: Int = 0): Int = {
  if (current == limit) acc + current * current
  else  sumSquares(limit, current + 1, acc + current * current)
}

def squareSum(limit: Int, current: Int = 1, acc: Int = 0): Int = {
  if (current == limit) (acc + current) * (acc + current)
  else squareSum(limit, current + 1, acc + current)
}

squareSum(LIMIT) - sumSquares(LIMIT)