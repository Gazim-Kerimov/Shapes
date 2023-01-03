package Shapes;

public class Rectangle extends AbstractShape{
    public String name = "Rectangle";
    int side1 = 0;
    int side2 = 0;
    public Rectangle(int side1, int side2){
        this.side1=side1;
        this.side2=side2;
    }

    @Override
    public double perimetr() {
        return (side1 *2) + (side2 *2);
    }

    @Override
    public double area() {
        return side1 * side2;
    }
    @Override
    public String getName() {
        return name;
    }
}
