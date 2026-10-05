public class gettersSetters{
  public static void main(String args[]){
    Pen p1 = new Pen(); //created new Pen object called p1
    p1.setColor("blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("yellow"); //directly changing the color of p1
    System.out.println(p1.getColor());
  }

  static class Pen{
    private String color;
    private int tip;

    String getColor(){ //getter method , used 'this' keyword to refer to the current object 
      return this.color;

    }

    int getTip(){
      return this.tip; //getter method
    }

    void setColor(String newColor){
      color = newColor;

    }

    void setTip(int newTip){
      tip = newTip;

    }
  }
}

