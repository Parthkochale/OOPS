public class constructor{
  public static void main(String args[]){
    Student s1 = new Student("Parth", 19); //created new Student object called s1
    System.out.println(s1.name);
    System.out.println(s1.age);
  }


  static class Student{
    String name ;
    int age;

    Student(String name, int age){ //constructor with parameters
      this.name = name;
      this.age = age;
    }

  }
}