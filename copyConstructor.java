public class copyConstructor {
  
  public static void main(String args[]){
    Student s1 = new Student( ); //created new Student object called s1
    s1.name = "Parth";
    s1.age = 19;
    s1.Password = "1234";
    s1.marks[0] = 100;  
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    Student s2 = new Student( s1 );
    s2.Password = "abcd"; //changing the password of s2
    s1.marks[2] = 100; //changing the marks of s1
    
    for(int i=0 ; i<3 ; i++){
      System.out.println(s2.marks[i]); 
    }


  }


  static class Student{
    String name ;
    int age;
    String Password;
    int marks[];

    Student (Student s1){ //copy constructor
      int marks[] = new int[3];
      this.name = s1.name;
      this.age = s1.age;
      this.marks = s1.marks;
    }

    Student(){
      int marks[] = new int[3];

    }

    
    

  }

}
