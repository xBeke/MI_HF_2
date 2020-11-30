import input.InputReader;
import input.readers.NumberReader;

import java.io.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Main {
    public static void main(String[] args) throws IOException {
        // InputReader.parseInput();
        teszt();
    }

    private static void teszt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        str1 = reader.readLine();
        System.out.println(str1);
        
    }

    private static void write() {
        System.out.println(InputReader.numberOfNodes);

        InputReader.nodes.forEach(node -> {
            System.out.println(node.numberOfValues);
            System.out.print("\t" + node.numberOfParents);
            node.parents.forEach(System.out::println);
            node.probOfValues.forEach(row -> {
                System.out.println(" ");
                row.forEach(System.out::println);
            });
        });

//        System.out.println(InputReader.numberOfEvidenceNodes);
//        System.out.println(InputReader.goalNode);
    }
}
