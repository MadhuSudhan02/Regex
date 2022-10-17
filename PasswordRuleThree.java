import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleThree {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("^[a-zA-Z0-9]{8,}+$") ;
        Matcher matcher = pattern.matcher("MadhuSudhan02");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
