import java.util.Scanner;

class Employee {
  private int id;
  private String name;
  private String designation;
  private int salary;

  public void setData(int id, String name, String designation, int salary) {
    this.id = id;
    this.name = name;
    this.designation = designation;
    this.salary = salary;
  }

  public void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter ID: ");
    id = sc.nextInt();
    System.out.print("Enter Name: ");
    name = sc.next();
    System.out.print("Enter Designation: ");
    designation = sc.next();
    System.out.print("Enter Salary: ");
    salary = sc.nextInt();
    sc.close();
  }

  public void displayData() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
  }

  public void incrementSalary() {
    if (designation.equals("Manager")) {
      salary += 5000;
    } else if (designation.equals("General Manager")) {
      salary += 10000;
    } else if (designation.equals("CEO")) {
      salary += 20000;
    } else if (designation.equals("Worker")) {
      salary += 2000;
    }
  }
}

public class EmployeeM {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.getData();
    employee.displayData();
    employee.incrementSalary();
    System.out.println("\nAfter Incrementing Salary: ");
    employee.displayData();
  }
}
