package Shapes;

public class Round extends AbstractShape{
    public String name = "Round";
    int radius = 0;
    public Round(int radius){
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2*3.14*radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
    @Override
    public String getName() {
        return name;
    }
}
