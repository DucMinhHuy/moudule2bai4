public class thuchanh2 {
    double width,height;
public thuchanh2(){

}
    public thuchanh2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
    return this.width*this.height;
    }
    public double getPerimeter(){
    return (this.width+this.height)*2;
    }
    public String display(){
    return "thuchanh2{"+"width="+width+",height"+height+"}";
    }

}
