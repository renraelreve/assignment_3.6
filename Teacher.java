public class Teacher extends Person {
  private String subject;

  public Teacher(String name, int age, String gender, String subject) {
    super(name, age, gender);
    this.subject = subject;
  }

  @Override
  public void introduce() {
    System.out.println("Hello, my name is " + name + " and I will be teaching you " + subject + ".");
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

}
