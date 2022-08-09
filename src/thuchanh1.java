public class thuchanh1 {
    public static void main(String[] args) {
        thuchanh1 circle1=new thuchanh1();
        System.out.println("dien tich hinh tron"+circle1.radius+":is:"+circle1.getArea());
        thuchanh1 circle2=new thuchanh1(25);
        System.out.println("dien tich 2 hinh tron"+circle2.radius+":is:"+circle2.getPerimeter());
        thuchanh1 circle3=new thuchanh1(125);
        System.out.println("dien tich hinh tron"+circle3.radius+":is:"+circle3.getArea());
        circle2.radius=100;
        System.out.println("s cua hinh tron"+circle2.radius+":is:"+circle2.getArea());
    }
    double radius;
    thuchanh1(){
        radius=1;
    }
    thuchanh1(double newRadius){
        radius=newRadius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }
    double getPerimeter(){
        return 2*radius*radius*Math.PI;
    }
}
