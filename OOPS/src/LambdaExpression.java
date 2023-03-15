import java.util.function.*;

public class LambdaExpression {
    
    public static void main(String[] args) {
        // Calculate area of rectangle
        BiFunction<Integer, Integer, Integer> rectangleArea = (length, width) -> length * width;
        int length = 5;
        int width = 10;
        int area = rectangleArea.apply(length, width);
        System.out.println("Area of rectangle: " + area);
        
        // Calculate area of circle
        Function<Double, Double> circleArea = radius -> Math.PI * radius * radius;
        double radius = 3.5;
        double circleAreaResult = circleArea.apply(radius);
        System.out.println("Area of circle: " + circleAreaResult);
        
        // Calculate simple interest
        BiFunction<Double, Double, Double> simpleInterest = (principal, rate) -> (principal * rate) / 100;
        double principal = 10000;
        double rate = 8;
        double simpleInterestResult = simpleInterest.apply(principal, rate);
        System.out.println("Simple interest: " + simpleInterestResult);
    }
}
