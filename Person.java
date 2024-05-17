public class Person {
  protected String name;
  private int age;
  private String gender;

  // Constructor

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void greet() {
    String userName = System.console().readLine("What is your name: ");
    System.out.println("Nice to meet you, " + userName);
  }

  public void introduce() {
    System.out.println("Hello, my name is " + name);
  }

  public int haveBirthday() {
    return age += 1;
  }

  // Getters and Setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

}
