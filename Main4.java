interface A {
    void methodA();
  }
  
  interface B {
    void methodB();
  }
  
  class C implements A, B {
    public void methodA() {
      System.out.println("method A");
    }
  
    public void methodB() {
      System.out.println("method B");
    }
  }
  
  public class Main4 {
    public static void main(String[] args) {
      C c = new C();
      c.methodA();
      c.methodB();
    }
  }
  