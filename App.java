import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght of side pf the hexagon: ");
        double sideLength = scanner.nextDouble();
        while (sideLength<0) {
            System.out.println("Side length cannot be negative. Please enter a valid number: ");
            sideLength = scanner.nextDouble();
        }
        double area = (6*Math.pow(sideLength, 2))/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is " + area);

        scanner.close();
    }
}