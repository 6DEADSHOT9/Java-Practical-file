class MyException extends Exception {
    private static final long serialVersionUID = 1L;
    private String message;
  
    public MyException(String message) {
      super(message);
      this.message = message;
    }
  
    public String getMessage() {
      return message;
    }
  }
  
  class testexc {
    public static void main(String[] args) {
      try {
        int age = -10;
        if (age < 0) {
          throw new MyException("Invalid age");
        }
      } catch (MyException e) {
        System.out.println(e.getMessage());
      }
    }
  }
  