 class Circle {
    private double radius ;
    public void setRadius(double rad){ //setter method 
        radius =  rad;
    }
    public double getRadius(){//setter methods
        return radius;
    }
    public double area(){
        return Math.PI * getRadius() * getRadius() ;
    }
    public double perimeter(){
        return 2*Math.PI * radius;
    }
}
public class Circle1
{
	public static void main(String[] args) {
		Circle firstCircle = new Circle();
        firstCircle.setRadius(10);
		System.out.println(firstCircle.area());
	}
}