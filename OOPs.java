public class OOPs{
  public static void main(String args[]){
    Pen p1 = new Pen(); //created new Pen object called p1
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color = "yellow"; //directly changing the color of p1
    System.out.println(p1.color);
  }

  static class Pen{
    String color;
    int tip;

    void setColor(String newColor){
      color = newColor;

    }

    void setTip(int newTip){
      tip = newTip;

    }
  }
}

