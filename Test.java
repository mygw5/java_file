import java.util.Scanner;

class Test {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前：");
    String firstName = scanner.next();

    System.out.print("名字：");
    String lastName = scanner.next();


    String name = firstName + " " + lastName;
    System.out.println("私は" + name + "です");
  }
}