class Employee {
    private String name;
    private int id;
    private int experience;
  
    public void assignInitialValues(String name, int id, int experience) {
      this.name = name;
      this.id = id;
      this.experience = experience;
    }
  
    public void displayData() {
      System.out.println("Name: " + name);
      System.out.println("ID: " + id);
      System.out.println("Experience: " + experience);
    }
  }
  
  class Programmer extends Employee {
    private int programmingSkills;
  
    public void assignProgrammingSkills(int programmingSkills) {
      this.programmingSkills = programmingSkills;
    }
  
    public void displayData() {
      super.displayData();
      System.out.println("Programming Skills: " + programmingSkills);
    }
  }
  
  class Analyst extends Employee {
    private int analysisSkills;
  
    public void assignAnalysisSkills(int analysisSkills) {
      this.analysisSkills = analysisSkills;
    }
  
    public void displayData() {
      super.displayData();
      System.out.println("Analysis Skills: " + analysisSkills);
    }
  }
  
  class ProjectLeader extends Employee {
    private int leadershipSkills;
  
    public void assignLeadershipSkills(int leadershipSkills) {
      this.leadershipSkills = leadershipSkills;
    }
  
    public void displayData() {
      super.displayData();
      System.out.println("Leadership Skills: " + leadershipSkills);
    }
  }
  
  public class employeee {
    public static void main(String[] args) {
      Programmer programmer = new Programmer();
      programmer.assignInitialValues("John Doe", 1, 5);
      programmer.assignProgrammingSkills(8);
      programmer.displayData();
  
      Analyst analyst = new Analyst();
      analyst.assignInitialValues("Jane Doe", 2, 3);
      analyst.assignAnalysisSkills(9);
      analyst.displayData();
  
      ProjectLeader projectLeader = new ProjectLeader();
      projectLeader.assignInitialValues("Jim Doe", 3, 7);
      projectLeader.assignLeadershipSkills(7);
      projectLeader.displayData();
    }
  }
  