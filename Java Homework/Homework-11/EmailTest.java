import java.io.File;
import java.util.*;
public class EmailTest {

    public static void Histogram(ArrayList<EmailSub>list) {
        System.out.println("Below is the histogram!");
        System.out.println("-------------------------------");

        String star= ""; //needed initialization

        for(int i = 0;i<list.size();i++) {
            if(star.equals(list.get(i).getCompany())) { 
                System.out.print("*");
            } else {
                System.out.print("\n" + list.get(i).getCompany() + "\t");
                System.out.print("*");
            }
            star = list.get(i).getCompany();
        }

        System.out.println("\n");
    }

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(new File("attendance.txt"));

        ArrayList<EmailSub> list = new ArrayList<EmailSub>();

        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            Email email = new Email(s);
            EmailSub sub = new EmailSub(email.parseCompanyName(),email.parseEmailName()); //takes the String returns of parse company and parse email
            list.add(sub); //adds the company name and person name of email to arraylist
        }
        Histogram(list);

        for(int i = 0;i<list.size();i++) {
            System.out.println(list.get(i).getCompany() + "\t" + list.get(i).getPerson());

            if(list.get(i).getPerson() == "bill.gates") {
                System.out.println("\n" + "Bill Gates was here!");
            }
        }
    }
}
