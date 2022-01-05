package Jan5;
import java.util.Scanner;

public class WebsiteURL {
    public static void main(String[] args) {
        //CWH JAVA Chapter3 question 6
        //Write a program to find out the type of website from the URL:
        //
        //.com – commercial website
        //.org – organization website
        //.in – Indian website

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //variable
        String websiteURL;

        //input
        System.out.println("Enter website url : ");
        websiteURL = sc.nextLine();

        if(websiteURL.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if (websiteURL.endsWith(".org")){
            System.out.println("organization website");
        }
        else if(websiteURL.endsWith("in")){
            System.out.println("Indian website");
        }

    }
}
