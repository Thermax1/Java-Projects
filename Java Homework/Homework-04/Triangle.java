class Triangle {

  private int s1;
  private int s2;
  private int s3;
  
  Triangle() {
    System.out.println("in constructor: Triangle()"); 
    s1=0;
    s2=0;
    s3=0;
  }

  Triangle(int s1, int s2, int s3) {
    System.out.println("in constructor: Triangle(int s1, int s2, int s3)");
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public boolean isIsosceles() {
    boolean b = false;

    if (s1 == s2 && s1 != s3)
      b = true;
    else if (s2 == s3 && s2 != s1)
      b = true;
    else if (s1 == s3 && s1 != s2)
      b = true;

   return b;      

  }

}