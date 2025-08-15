package exercises;

import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Can you tell me the rectangle length?");
        double length =  input.nextDouble();

        System.out.println("Can you tell me the rectangle width?");
        double width =  input.nextDouble();

        double area =  length * width;

        System.out.println("The area of rectangle is :" + area);

    }
}
