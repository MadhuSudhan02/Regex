import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleOne {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("^[a-zA-Z]{8,}+$") ;
        Matcher matcher = pattern.matcher("MadhuSudhan");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
