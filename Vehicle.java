interface MotorBike {
    void speed(int s);
    void distance(int d);
  }
  
  interface Cycle {
    void speed(int s);
    void distance(int d);
  }
  
  class TwoWheeler implements MotorBike, Cycle {
    int speed;
    int distance;
  
    public void speed(int s) {
      speed = s;
    }
  
    public void distance(int d) {
      distance = d;
    }
  
    void display() {
      System.out.println("Speed: " + speed + " km/h");
      System.out.println("Distance: " + distance + " km");
    }
  }
  
  class Vehicle {
    public static void main(String[] args) {
      TwoWheeler t = new TwoWheeler();
      t.speed(50);
      t.distance(100);
      t.display();
    }
  }
  