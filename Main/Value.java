public class Value{
  int age = 14;
  public static void main(String[] args) {
    Main myObj = new Main();

    System.out.println(myObj.age);
    FirstMain myObj2 = new FirstMain();

    myObj2.x = 9;
    int y = myObj2.y = 12;
    myObj2.Add(myObj2.x, y);
  }
}