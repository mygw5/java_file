class Test {
  public static void main(String[] args){
    int number = 9;
    if (isEven(number)) {
      System.out.println("20以下です");
    } else {
      System.out.println("20より大きいです");
    }
  }

  public static boolean isEven(int number) {
    return number <= 20;
  }
}