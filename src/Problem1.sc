/**
  If we list all the natural numbers below 10 that are multiples of 3 or 5,
  we get 3, 5, 6 and 9. The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.
  */

val target = 999

val sum = (1 to target)
  .filter({p => p % 3 == 0 || p % 5 == 0 })
  .foldLeft(0)((b,a) => b+a)


def sumDivisibleBy(n: Int): Int = {
  val p = target / n
  return n * p * (p + 1) / 2
}

val sumOptimized = sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15)

assert(sum == sumOptimized)
