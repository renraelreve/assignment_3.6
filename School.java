public class School implements Building {
  private String name;
  private int numberOfFloors;
  private String address;

  // Constructor

  public School(String name, int numberOfFloors, String address) {
    this.name = name;
    this.numberOfFloors = numberOfFloors;
    this.address = address;
  }

  @Override
  public int addFloor(int floors) {
    numberOfFloors += floors;
    System.out.println("Total number of floors is now " + numberOfFloors);
    return numberOfFloors;
  }

  @Override
  public void desribe() {
    System.out.println("The name of the building is " + name + ", it is situated at " + address);
  }

}
