public class Student extends Person {
  private int yrLevel;

  // Constructors
  public Student(String name, int age, String gender, int yrLevel) {
    super(name, age, gender);
    this.yrLevel = yrLevel;
  }

  @Override
  public void introduce() {
    System.out.println("Hello, my name is " + name + " and I am a year " + yrLevel + " student.");
  }

  public int getYrLevel() {
    return this.yrLevel;
  }

  public void setYrLevel(int yrLevel) {
    this.yrLevel = yrLevel;
  }

}
