class Main {
  // クラス部分
  public static void main(String[] args) {
    // メソッド部分
    int[] numbers = {1, 4, 5, 16, 19};
    
    int oddSum = 0;
    int evenSum = 0;
    
    for (int number : numbers) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }
  }
}