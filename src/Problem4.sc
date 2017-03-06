/**
  * A palindromic number reads the same both ways. The largest palindrome made
  * from the product of two 2-digit numbers is 9009 = 91 × 99.
  * Find the largest palindrome made from the product of two 3-digit numbers.
  */
def isPalindrome(number: Long): Boolean = number.toString == number.toString.reverse

assert(isPalindrome(906609))
assert(!isPalindrome(9901))

var result: Long = 0

(10 to 999).foreach(x => {
  (10 to 999).foreach(y => {
    val guess = y * x
    if (isPalindrome(guess) && guess > result) {
      result = guess
    }
  })
})

println(result)



