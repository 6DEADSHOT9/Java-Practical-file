public final class ImmutableClass {
    private final int id;
    private final String name;
  
    public ImmutableClass(int id, String name) {
      this.id = id;
      this.name = name;
    }
  
    public int getId() {
      return id;
    }
  
    public String getName() {
      return name;
    }
  
    public static void main(String[] args) {
      ImmutableClass obj = new ImmutableClass(1, "John Doe");
      System.out.println("ID: " + obj.getId());
      System.out.println("Name: " + obj.getName());
    }
  }
