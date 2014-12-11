
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?


function isPrime(n) {

	var isPrime = true;
	var maxFactor = Math.sqrt(n);
	for (var i = 2; i <= maxFactor; i++) {
		if (n % i === 0) {
			isPrime = false; 
			break;
		}
	}

	return isPrime;
}


for (var i = 2, count = 0; count < 10001; i++) {
	if (isPrime(i)) {
		count++;
	}
}

console.log("10001th prime is : " + (i-1));

