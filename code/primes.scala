// compute first n primes
def primes(n: Int): List[Int] = {
  def isPrime(n: Int, primes: List[Int]): Boolean = {
    primes.forall(n % _ != 0)
  }
  def loop(n: Int, primes: List[Int]): List[Int] = {
    if (primes.length == n) primes
    else if (isPrime(primes.length + 1, primes)) loop(n, primes :+ (primes.length + 1))
    else loop(n, primes)
  }
  loop(n, List(2))
}

// eratosthenes siege to compute first n primes using functional programming
def eratosthenes(n: Int): List[Int] = {
  def sieve(n: Int, primes: List[Int]): List[Int] = {
    if (primes.length == n) primes
    else sieve(n, primes.filter(_ % primes.length != 0))
  }
  sieve(n, List.range(1, n))
}