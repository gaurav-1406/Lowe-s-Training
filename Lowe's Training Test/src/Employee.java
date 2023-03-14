public class Employee {
  private int id;
  private String name;
  private double basicSalary;
  private final double hraPercent = 0.12;
  private final double taPercent = 0.08;
  private final double daPercent = 0.09;
  
  public Employee(int id, String name, double basicSalary) {
    this.id = id;
    this.name = name;
    this.basicSalary = basicSalary;
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public double getBasicSalary() {
    return basicSalary;
  }
  
  public double calculateHRA() {
    return basicSalary * hraPercent;
  }
  
  public double calculateTA() {
    return basicSalary * taPercent;
  }
  
  public double calculateDA() {
    return basicSalary * daPercent;
  }
  
  public double calculateGrossSalary() {
    return basicSalary + calculateHRA() + calculateTA() + calculateDA();
  }
  
  public String categorizeGrade() {
    double grossSalary = calculateGrossSalary();
    if (grossSalary >= 25000) {
      return "Grade A";
    } else if (grossSalary >= 10000 && grossSalary < 25000) {
      return "Grade B";
    } else {
      return "Grade C";
    }
  }
  
  public static void main(String[] args) {
    Employee employee = new Employee(1, "Employee 1", 20000);
    System.out.println("Employee ID: " + employee.getId());
    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Basic Salary: " + employee.getBasicSalary());
    System.out.println("HRA: " + employee.calculateHRA());
    System.out.println("TA: " + employee.calculateTA());
    System.out.println("DA: " + employee.calculateDA());
    System.out.println("Gross Salary: " + employee.calculateGrossSalary());
    System.out.println("Grade: " + employee.categorizeGrade());
  }
}
