import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameRegex {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("^[A-Z]adhu$") ;
        Matcher matcher = pattern.matcher("Madhu");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
