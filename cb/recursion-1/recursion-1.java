public class recursion-1 {
	public int factorial(int n) {
  		if (n == 0) {
    			return 1;
  		}
  		return n * factorial(n - 1);
	}
	public int bunnyEars(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  return 2 + bunnyEars(bunnies - 1);
}
public int fibonacci(int n) {
  if (n == 0) {
    return 0;
  }
  else if (n == 1) {
    return 1;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}public int bunnyEars2(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  if (bunnies % 2 == 0) {
    return 3 + bunnyEars2(bunnies - 1);
  }
  return 2 + bunnyEars2(bunnies - 1);
}public int triangle(int rows) {
  if (rows == 0) {
    return 0;
  }
  return rows + triangle(rows - 1);
}
public int sumDigits(int n) {
  if (n < 10) {
    return n;
  }
  return n % 10 + sumDigits(n / 10);
}
}
