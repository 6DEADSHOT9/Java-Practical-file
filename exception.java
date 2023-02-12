public class exception {
    public static void main(String[] args) {
      try {
        int[] arr = new int[5];
        int i = 10 / 0;
        System.out.println(arr[6]);
      } catch (ArithmeticException e) {
        System.out.println("ArithmeticException caught: " + e.getMessage());
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Exception caught: " + e.getMessage());
      } finally {
        System.out.println("Finally block executed");
      }
    }
  }
  