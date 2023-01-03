package Shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeCreater {
    public AbstractShape createShape() throws IOException {
        AbstractShape shape = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите фигуру для создания: 1 - квадрат, 2 - прямоугольник, 3 - треугольник, 4 - круг");
        String input = reader.readLine();
        switch (input){
            case "1":
                System.out.println("Введите сторону квадрата: ");
                 int side = Integer.parseInt(reader.readLine());
                 shape = new Square(side);
                 break;
            case "2":
                System.out.println("Введите две стороны прямоугольника: ");
                 int side1 = Integer.parseInt(reader.readLine());
                 int side2 = Integer.parseInt(reader.readLine());
                 shape = new Rectangle(side1,side2);
                 break;
            case "3":
                System.out.println("Введите три стороны треугольника: ");
                int side3_1 = Integer.parseInt(reader.readLine());
                int side3_2 = Integer.parseInt(reader.readLine());
                int side3_3 = Integer.parseInt(reader.readLine());
                shape =  new Triangle(side3_1, side3_2, side3_3);
                break;
            case "4":
                System.out.println("Введите радиус окружности: ");
                int rad =Integer.parseInt(reader.readLine());
                shape = new Round(rad);
                break;
        }
        return shape;
    }



}
