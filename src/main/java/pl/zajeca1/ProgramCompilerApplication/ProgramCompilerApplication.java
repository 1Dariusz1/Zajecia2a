package pl.zajeca1.ProgramCompilerApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramCompilerApplication {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(\\d+)\\s+(\\S+)\\s+(.*)");
        Matcher matcher = compile.matcher("12 PRINT Helo World");
        if (matcher.find()) {
            String group = matcher.group(0);
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(2);

            System.out.println(group);
            System.out.println(group1);
            System.out.println(group2);
            System.out.println(group3);

        }
    }
}
