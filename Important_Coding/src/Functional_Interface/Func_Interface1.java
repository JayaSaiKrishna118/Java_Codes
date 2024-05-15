package Functional_Interface;
//Functional Interface - single abstract method
public class Func_Interface1 {
    public static void main(String[] args) {
    Square square = (int x) -> x*x;
    int value = square.calculate(5);
        System.out.println("Square of the 5 : "+value);
        Rectangle rectangle = (int y, int z)-> y*z;
        int value1 = rectangle.calculate1(5,6);
        System.out.println("Rectangle of the two numbers: "+value1);
    }
}
