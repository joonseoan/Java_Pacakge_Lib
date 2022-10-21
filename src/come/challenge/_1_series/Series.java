package come.challenge._1_series;

public class Series {
  static public int nSum(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  static public int factorial(int n) {
    int product = 1;

    for (int i = 1; i <= n; i++) {
      product *= i;
    }

    return product;
  }

  static public int fibonacci(int n) {
    int prePreNum = 0;
    int preNum = 1;

    for (int i = 0; i < n - 1; i++) {
      int temNum = preNum;
      preNum = prePreNum + preNum;
      prePreNum = temNum;
    }

    return preNum;
  }
}
