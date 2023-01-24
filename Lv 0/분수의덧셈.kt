class Solution {
    fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a%b) else a
    fun min(a: Int, b: Int) = if (a > b) b else a
    fun max(a: Int, b: Int) = if (a > b) a else b
    
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        
        val child = numer1 * denom2 + numer2 * denom1
        val parent = denom1 * denom2
        val gcd = gcd(min(child, parent), max(child, parent))
        
        val answer = intArrayOf(child / gcd, parent / gcd)
        return answer
    }
}
