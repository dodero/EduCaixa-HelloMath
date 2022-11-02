/* check if a number is prime */
function isPrime(n) {
  if (n < 2) return false;
  for (var i = 2; i < n; i++) {
    if (n % i == 0) return false;
  }
  return true;
}

/* Erathostenes siege */
function eratosthenes(n) {
  var primes = [];
  for (var i = 2; i <= n; i++) {
    if (isPrime(i)) primes.push(i);
  }
  return primes;
}

/* Eratosthenes sieve with a bit array */
function eratosthenesBit(n) {
  var primes = [];
  var bits = new Array(n + 1);
  for (var i = 2; i <= n; i++) {
    if (!bits[i]) {
      primes.push(i);
      for (var j = i; j <= n; j += i) {
        bits[j] = true;
      }
    }
  }
  return primes;
}