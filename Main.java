public class Main {
  public static void main(String[] args) {

    School school = new School("Star Class", 4, "Hougang St 11");

    Teacher teacher = new Teacher("Molly", 23, "female", "English");

    Student student1 = new Student("Ah Boy", 9, "male", 3);
    Student student2 = new Student("Ah Girl", 8, "female", 2);
    System.out.println("-------------------");
    school.addFloor(1);
    school.desribe();
    System.out.println("-------------------");
    teacher.greet();
    teacher.introduce();
    teacher.haveBirthday();
    System.out.println("-------------------");
    student1.greet();
    student1.introduce();
    student1.haveBirthday();
    System.out.println("-------------------");
    student2.greet();
    student2.introduce();
    student2.haveBirthday();
    System.out.println("-------------------");
  }
}
