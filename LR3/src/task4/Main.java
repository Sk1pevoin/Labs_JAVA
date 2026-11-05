package task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "aeeea aeea aea axa axxa axxxa";

        Pattern pattern = Pattern.compile("\\ba(ee|ee++|x*)\\ba");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные совпадения:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}