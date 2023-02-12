public final class FinalClass {
    // final variable
    private final int id;
  
    // final method
    public final void showMessage() {
      System.out.println("This is a final method.");
    }
  
    // constructor to initialize final variable
    public FinalClass(int id) {
      this.id = id;
    }
  
    // getter method for final variable
    public int getId() {
      return id;
    }
  
    public static void main(String[] args) {
      FinalClass obj = new FinalClass(10);
      System.out.println("Final variable id: " + obj.getId());
      obj.showMessage();
    }
  }
