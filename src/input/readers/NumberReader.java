package input.readers;

import java.util.Scanner;

public class NumberReader {
    public static final Scanner consoleScanner = new Scanner(System.in);

    public static int readInt(){
        return consoleScanner.nextInt();
    }

    public static double readDouble(){
        return consoleScanner.nextDouble();
    }
}
