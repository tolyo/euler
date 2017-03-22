import scala.annotation.tailrec

/**
  * The prime factors of 13195 are 5, 7, 13 and 29.
  * What is the largest prime factor of the number 600851475143 ?
  */

val TARGET = 600851475143L

@tailrec
def largestPrime(primes: List[Int], range: List[Int]): Int = {
  val result = sieve(primes, range)
  if (result._2.isEmpty) result._1.head
  else largestPrime(result._1, result._2)
}

def sieve(primes: List[Int], range: List[Int]): Tuple2[List[Int], List[Int]] = {
  assert(!range.isEmpty)
  if (isFactor(TARGET, range.head)) (range.head :: primes, range.tail.filter(_ % range.head != 0))
  else (primes, range.tail.filter(_ % range.head != 0))
}

def isFactor(target: Long, n: Long): Boolean = target % n == 0

println(largestPrime(Nil, (2 until Math.sqrt(TARGET).toLong.toInt).toList))

