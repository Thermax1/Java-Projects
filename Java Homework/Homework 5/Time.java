class Time {

   private int hour;
   private int minute;
   private int second;

   Time() {

   }

   Time(int hr, int min, int sec) {
     hour = hr;
     minute = min;
     second = sec;
   }

   public void printTime() {
      System.out.println(hour + ":" + minute + ":" + second);
   }

   public void tick() {
      second++;
      if (second == 60) {
         second = 0;
         minute++;
      }

      if (minute == 60) {
         minute = 0;
         hour++;
      }

     if (hour == 24) {
        hour = 0;
     }
   }
}