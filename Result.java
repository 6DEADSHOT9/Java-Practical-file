import package2.Marks;

public class Result {
  public static void main(String[] args) {
    Marks marks = new Marks(1, "John", 80, 90, 85);
    int total = marks.getMarks1() + marks.getMarks2() + marks.getMarks3();
    double average = total / 3.0;
    System.out.println("Roll No: " + marks.getRollNo());
    System.out.println("Name: " + marks.getName());
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);
  }
}
