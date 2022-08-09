import java.util.Scanner;
public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(){

    }
    public double getR1(){
        return ((-b+Math.sqrt(getDelta()))/(2*a));
    }
    public double getR2(){
        return ((-b-Math.sqrt(getDelta()))/(2*a));
    }
    public double getDelta(){
        return b*b-(4*a*c);
    }
    public String display(){
      return  "QuadraticEquation {"+"a="+a+"b="+b+"c="+c+"}";
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a=");
        int a=scanner.nextInt();
        System.out.println("enter b=");
        int b=scanner.nextInt();
        System.out.println("enter c=");
        int c=scanner.nextInt();
        QuadraticEquation huy=new QuadraticEquation(a,b,c);
        System.out.println("lay gia tri\n"+huy.display());
        System.out.println("Delta la :"+huy.getDelta());
        if (huy.getDelta()>0) {
            System.out.println("nghiem la :" + huy.getR2());
            System.out.println("nghiem la :" + huy.getR1());
        }else if (huy.getDelta()<0) {
            System.out.println("vo ngiem");
        }else {
            System.out.println("phuong trinh co 1 nghiem: "+huy.getR1());

        }
    }

}
