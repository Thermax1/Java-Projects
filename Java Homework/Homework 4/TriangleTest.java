class TriangleTest {

  public static void main(String[] args) {

     Triangle t1 = new Triangle();

     if (t1.isIsosceles())
        System.out.println("isosceles triangle");
     else
        System.out.println("not an isosceles triangle");

     Triangle t2 = new Triangle(3,3,5);
     if (t2.isIsosceles())
        System.out.println("isosceles triangle");
     else
        System.out.println("not an isosceles triangle");
  }

}