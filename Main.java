class Main {
  // クラス部分
  public static void main(String[] args) {
    // メソッド部分
    String name = "Kana";
    int age = 10;
    double height = 1.45;
    double weight = 40;
    double bmi = weight / height / height;

    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");
   }
}