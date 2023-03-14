public class Control_Statements {
  public static void main(String[] args) {
    // If statement
    int x = 10;
    if (x == 10) {
      System.out.println("x is 10");
    }
    
    // If-else statement
    int y = 20;
    if (y == 10) {
      System.out.println("y is 10");
    } else {
      System.out.println("y is not 10");
    }
    
    // Switch statement
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      default:
        System.out.println("Invalid day");
        break;
    }
    
    // For loop
    for (int i = 1; i <= 5; i++) {
      System.out.println("i: " + i);
    }
    
    // While loop
    int j = 1;
    while (j <= 5) {
      System.out.println("j: " + j);
      j++;
    }
    
    // Do-while loop
    int k = 1;
    do {
      System.out.println("k: " + k);
      k++;
    } while (k <= 5);
  }
}
