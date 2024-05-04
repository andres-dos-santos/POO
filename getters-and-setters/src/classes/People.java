package classes;

public class People {
  private String name = "Andres";
  private int age = 23;
  private double height = 1.75;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getHeight() {
    return height;
  }

  public void changeName(String name) {
    this.name = name;
  }

  public void changeAge(int age) {
    this.age = age;
  }

  public void changeHeight(double height) {
    this.height = height;
  }
}
