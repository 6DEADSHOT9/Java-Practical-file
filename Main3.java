interface Shape {
    void draw();
  }
  
  interface Color {
    void fill();
  }
  
  class Circle implements Shape, Color {
    @Override
    public void draw() {
      System.out.println("Drawing Circle");
    }
  
    @Override
    public void fill() {
      System.out.println("Filling Circle");
    }
  }
  
  class Square implements Shape, Color {
    @Override
    public void draw() {
      System.out.println("Drawing Square");
    }
  
    @Override
    public void fill() {
      System.out.println("Filling Square");
    }
  }
public class Main3 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Color circleColor = new Circle();
        circleColor.fill();
        Shape square = new Square();
        square.draw();
        Color squareColor = new Square();
        squareColor.fill();
    }
}  