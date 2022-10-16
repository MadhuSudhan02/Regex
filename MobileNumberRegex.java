import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberRegex {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("^[0-9]{2} [0-9]{10}$") ;
        Matcher matcher = pattern.matcher("91 9739300663");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
