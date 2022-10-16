import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailRegex {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("^(.+).(.+)@(.+).(.+).(.+)$") ;
        Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");

        boolean found = matcher.find();
        System.out.println("found : " + found);
    }
}
