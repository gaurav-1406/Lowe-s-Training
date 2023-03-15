package arithmetic;

public class TestArithmetic extends ArithmeticOperations {
	
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(a + " + " + b + " = " + ArithmeticOperations.add(a, b));
        System.out.println(a + " - " + b + " = " + ArithmeticOperations.subtract(a, b));
        System.out.println(a + " * " + b + " = " + ArithmeticOperations.multiply(a, b));
        System.out.println(a + " / " + b + " = " + ArithmeticOperations.divide(a, b));
    }

}
