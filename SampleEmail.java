import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmail {
    public static void main(String[] args) {
        String EmailID ;
        Scanner email = new Scanner(System.in) ;
        EmailID = email.findInLine(" ") ;

        Pattern pattern= Pattern.compile("^$") ;
        Matcher matcher = pattern.matcher(EmailID);

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
