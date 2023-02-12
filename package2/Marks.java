package package2;

import package1.Student;

public class Marks extends Student {
  private int marks1;
  private int marks2;
  private int marks3;

  public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
    super(rollNo, name);
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
  }

  public int getMarks1() {
    return marks1;
  }

  public int getMarks2() {
    return marks2;
  }

  public int getMarks3() {
    return marks3;
  }
}