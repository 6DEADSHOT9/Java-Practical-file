class Student {
    private int rollNo;
    private String name;
  
    public void assignInitialValues(int rollNo, String name) {
      this.rollNo = rollNo;
      this.name = name;
    }
  
    public void displayData() {
      System.out.println("Roll No: " + rollNo);
      System.out.println("Name: " + name);
    }
  }
  
  class Exam extends Student {
    protected int marks1;
    protected int marks2;
    protected int marks3;
    protected int marks4;
    protected int marks5;
    protected int marks6;
  
    public void assignMarks(int marks1, int marks2, int marks3, int marks4, int marks5, int marks6) {
      this.marks1 = marks1;
      this.marks2 = marks2;
      this.marks3 = marks3;
      this.marks4 = marks4;
      this.marks5 = marks5;
      this.marks6 = marks6;
    }
  
    public void displayData() {
      super.displayData();
      System.out.println("Marks 1: " + marks1);
      System.out.println("Marks 2: " + marks2);
      System.out.println("Marks 3: " + marks3);
      System.out.println("Marks 4: " + marks4);
      System.out.println("Marks 5: " + marks5);
      System.out.println("Marks 6: " + marks6);
    }
  }
  
  class Result extends Exam {
    private int totalMarks;
    private double average;
  
    public void calculateResult() {
      totalMarks = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
      average = (double)totalMarks / 6;
    }
  
    public void displayData() {
      super.displayData();
      System.out.println("Total Marks: " + totalMarks);
      System.out.println("Average: " + average);
    }
  }
  
  public class Main1 {
    public static void main(String[] args) {
      Result studentResult = new Result();
      studentResult.assignInitialValues(1, "John Doe");
      studentResult.assignMarks(85, 90, 95, 80, 85, 90);
      studentResult.calculateResult();
      studentResult.displayData();
    }
  }
  