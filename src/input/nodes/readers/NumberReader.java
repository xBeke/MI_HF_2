package input.nodes.readers;

import java.util.Scanner;

public class NumberReader {
    private static Scanner consoleScanner = new Scanner(System.in);

    public static int readInt(){
        Scanner myInput = new Scanner( consoleScanner.nextLine() );
        int number = myInput.nextInt();
        myInput.close();
        return number;
    }

    public static double readDouble(){
        Scanner myInput = new Scanner( consoleScanner.nextLine() );
        double number = myInput.nextDouble();
        myInput.close();
        return number;
    }
}
