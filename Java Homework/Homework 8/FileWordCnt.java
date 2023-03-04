import java.util.Scanner;
import java.io.File;

class FileWordCnt {

   public static void main(String[] args) throws Exception {

      File f = new File("textfile.txt");
      Scanner scan = new Scanner(f);

      int lineCnt=0;
      int wordCnt=0;
      while (scan.hasNextLine()) {

         String s = scan.nextLine();
         System.out.println(s);

         lineCnt++;

         String[] strarr = s.split(" ");
         for (int i=0; i<strarr.length; i++) {
            System.out.println("  index=" + i + "  word=" + strarr[i]);    

            if (strarr[i].trim().length()>0)
               wordCnt++; 
         }

         // wordCnt = wordCnt + strarr.length;

      }

      System.out.println("line cnt=" + lineCnt);
      System.out.println("word cnt=" + wordCnt);


   }

}