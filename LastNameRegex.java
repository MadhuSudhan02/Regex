import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameRegex {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("^[A-Z]ita$") ;
        Matcher matcher = pattern.matcher("Sita");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
