public class Calculator {

    static int count = 0;

    int sum(int a , int b) {
        count++;
        return a+b;
    }

    float sum(float a , float b) {
        count++;
        return a+b;
    }

    int sum(int a , int b , int c) {
        count++;
        return a+b+c;
    }

     static void displaycount() {
        System.out.println("Total calculations: " +count);
    }


public static void main(String[] args) {
        
    Calculator c1 = new Calculator();
    System.out.println("Integer Calculation: "+c1.sum(1,2));
    System.out.println("Decimal Calculation: "+c1.sum((float)1.5,(float)2.5));
    Calculator.displaycount();
   
}
}