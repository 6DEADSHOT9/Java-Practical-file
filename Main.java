import java.util.Scanner;

class Student {
  private int rollNumber;
  private String name;
  private int marks1;
  private int marks2;
  private int marks3;

  public void setData(int rollNumber, String name, int marks1, int marks2, int marks3) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
  }

  public void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Roll Number: ");
    rollNumber = sc.nextInt();
    System.out.print("Enter Name: ");
    name = sc.next();
    System.out.print("Enter Marks1: ");
    marks1 = sc.nextInt();
    System.out.print("Enter Marks2: ");
    marks2 = sc.nextInt();
    System.out.print("Enter Marks3: ");
    marks3 = sc.nextInt();
    sc.close();
  }

  public void displayData() {
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Name: " + name);
    System.out.println("Marks1: " + marks1);
    System.out.println("Marks2: " + marks2);
    System.out.println("Marks3: " + marks3);
  }
}

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    student.getData();
    student.displayData();
  }
}
