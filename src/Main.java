import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Длина катета  a : ");
        triangle.a= scanner.nextInt();
        System.out.print(" Длина катета b : ");
        triangle.b= scanner.nextInt();
        System.out.print("Длина гипотенузы  c : ");
        triangle.c= scanner.nextInt();

        System.out.println("\n Площадь треугольника : "+triangle.area());

    }
}