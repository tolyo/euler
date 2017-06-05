import scala.annotation.tailrec

/**
  * 2520 is the smallest number that can be divided by
  * each of the numbers from 1 to 10 without any remainder.
  * What is the smallest positive number that is evenly
  * divisible by all of the numbers from 1 to 20?
  */
val target = 20

def hasRemainder(limit: Int, target: Int): Boolean = (2 to limit).map { x => target % x }.sum > 0

@tailrec
def findRemainder(limit: Int): Int = {
  if (!hasRemainder(target, limit)) limit
  else findRemainder(limit + target)
}



val startTime: Long  = System.currentTimeMillis()
println(findRemainder(target))
val endTime: Long  = System.currentTimeMillis()

endTime - startTime