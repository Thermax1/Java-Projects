class TimeTest {

  public static void main(String[] args) {

     Time est = new Time(23,59,59);
     est.printTime();

     est.tick(); // tick for one second
     est.printTime();

     Time gmt = new Time(13,50,50);
     gmt.printTime();
     for (int cnt=0; cnt<60; cnt++)
        gmt.tick();

     gmt.printTime();
  }

}