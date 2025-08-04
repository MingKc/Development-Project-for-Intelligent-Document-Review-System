import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字: ");
        double num1 = scanner.nextDouble();

        System.out.print("请输入第二个数字: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("两个数字的和是: " + sum);
    }
}
