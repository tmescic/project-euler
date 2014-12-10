/**
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Palindrome {

  def main(args: Array[String]): Unit = {
    
    var solution = getSolution;
    
    println("Solution : " + solution)
  }
  
  def getSolution() : Int = {
    
    def startingPoint = 999 * 999
    def endPoint = 100 * 100
    
     for (i <- startingPoint to endPoint by -1) {
      if (isPalindrome(i) && isProduct(i)) {
    	 return i;
      }
    }
    
    return -1;
  }
  
  def isProduct(i : Int) : Boolean = {
        val maxFactor = Math.sqrt(i).toInt
        for (j <- 100 to maxFactor) {
          if (i % j == 0 && (i/j) >=100 && (i/j) <= 999) {
            return true;
          }
        }
        return false;
  }
  
  def isPalindrome(number : Int) : Boolean = {
    
    val numStr = number.toString;
    return numStr.equals(numStr.reverse);
  }

}