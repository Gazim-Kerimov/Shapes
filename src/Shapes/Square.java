package Shapes;

public class Square extends AbstractShape{
    public String name = "Square";
    int side = 0;
   public Square(int side){
       this.side = side;
   }
    @Override
    public double perimetr() {
        return side*4;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String getName() {
        return name;
    }
}
