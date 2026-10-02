public class accessModifiers {
  public static void main(String args[]){
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Parth Kochale";
    myAcc.password = "12345";//this will throw an error because password is private and cannot be accessed outside the class
    myAcc.setPassword("12345"); //this will work because setPassword is public and can be accessed outside the class

  }

  static class BankAccount{

    public String username;
    private String password;

    public void setPassword(String pwd){
      password= pwd ;

    }
  }
}
