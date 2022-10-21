package come.challenge._1_series;

public class Series {
  static public int nSum(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  static public long factorial(int n) {
    if (n == 0) {
      return n;
    }

    long product = 1;

    for (int i = 1; i <= n; i++) {
      product *= i;
    }

    return product;
  }

  static public long fibonacci(int n) {
    long prePreNum = 0;
    long preNum = 1;

    if (n == 0) {
      return prePreNum;
    }

    if (n == 1) {
      return preNum;
    }

    for (int i = 1; i < n; i++) {
      long temNum = preNum;
      preNum = prePreNum + preNum;
      prePreNum = temNum;
    }

    return preNum;
  }
}
