import scala.annotation.tailrec

/**
  * Each new term in the Fibonacci sequence is generated by adding the
  * previous two terms. By starting with 1 and 2, the first 10 terms will be:
  *  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  *  By considering the terms in the Fibonacci sequence whose values
  *  do not exceed four million, find the sum of the even-valued terms.
  */

val LIMIT = 4000000

@tailrec
def fib(limit: Int, acc: List[Int] = 2 :: 1 :: Nil): List[Int] =
  if (acc.head > limit) acc
  else fib(limit, acc.head + acc.tail.head :: acc)


fib(LIMIT).filter { _ % 2 == 0 }.sum
