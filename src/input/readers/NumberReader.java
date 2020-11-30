package input.readers;

import java.util.Locale;
import java.util.Scanner;

public class NumberReader {
    public static final Scanner consoleScanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\\s*:*,*\\n*");

    public static double readDouble(){
        return consoleScanner.nextDouble();
    }

    public static void parseNode(){
        System.out.println("Parse node");
    }
}
