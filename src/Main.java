import Shapes.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ShapeCreater creater = new ShapeCreater();
        ArrayList<AbstractShape> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("1 - добавить фигуру\n2 - посчитать периметр всех фигур\n3 - посчитать площадь всех фигур" +
                    "\n4 - напечатать информацию о фигурах\n5 - выход");
            String input = bufferedReader.readLine();
            if(input.equals("5")){
                break;
            }
            switch (input){
                case "1":
                    list.add(creater.createShape());
                    break;
                case "2":
                    double sumPer = 0;
                    for(int i = 0; i < list.size(); i++){
                        sumPer += list.get(i).perimetr();
                    }
                    System.out.println("Общий периметр всех фигур: " + sumPer);
                    break;
                case "3":
                    double sumArea = 0;
                    for (int i = 0; i < list.size(); i++) {
                        sumArea += list.get(i).area();
                    }
                    System.out.println("Общая площадь всех фигур: " + sumArea);
                    break;
                case "4":
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i+1) + ": " + list.get(i).getName());
                    }
                    break;
            }
        }

    }
}
