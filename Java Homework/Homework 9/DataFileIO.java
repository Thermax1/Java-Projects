import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

class DataFileIO {

  public static void main(String[] args) throws Exception {

     if (args.length < 1) {
       System.out.println("Enter a filename as argument");
       return;
     }

     File f = new File(args[0]);
     Scanner scan = new Scanner(f);

     ArrayList<Data> d = new ArrayList<Data>();

     while (scan.hasNextLine()) {

        String s = scan.nextLine();
        System.out.println(s);

        String[] arr = s.split("\t");
        d.add(new Data(arr[0],arr[1],Integer.parseInt(arr[2])));
                
     } 

     for (int i=0; i<d.size(); i++) {
        Data info = d.get(i);
        // System.out.println("first=" + info.first + "  last=" + info.last + "  zip=" + info.zip);
        System.out.println(info);
        
     }

  }

}