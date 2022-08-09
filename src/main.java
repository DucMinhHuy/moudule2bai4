import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width:");
        double width = scanner.nextDouble();
        System.out.println("enter the height:");
        double height = scanner.nextDouble();
        thuchanh2 rectangle = new thuchanh2(width, height);
        System.out.println("thuchanh cua ban:\n"+rectangle.display());
        System.out.println("thuc hanh cua toi:"+rectangle.getPerimeter());
        System.out.println("s cua thuc hanh:"+rectangle.getArea());
    }
}
