package Shapes;

public class Triangle extends AbstractShape{
   public String name = "Triangle";
    int side1 = 0;
   int side2 = 0;
   int side3 = 0;
   public Triangle(int side1,int side2,int side3){
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
   }

    @Override
    public double perimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
       double p = this.perimetr() / 2;
       double result =  Math.sqrt(p * (p-side1) * (p - side2) * (p - side3));
       return result;
    }
    @Override
    public String getName() {
        return name;
    }
}
