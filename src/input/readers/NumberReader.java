package input.readers;

import java.util.Scanner;

public class NumberReader {
    public final Scanner consoleScanner = new Scanner(System.in);
    private final Scanner myInput = new Scanner( consoleScanner.nextLine() );

    public int readInt(){
        int number = myInput.nextInt();
        myInput.close();
        return number;
    }

    public double readDouble(){
        double number = myInput.nextDouble();
        myInput.close();
        return number;
    }
}
