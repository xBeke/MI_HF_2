import input.InputReader;
import input.readers.NumberReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InputReader.parseInput();
    }

    private static void teszt() {
        ArrayList<Double> list = new ArrayList<>();
        int size = 7;
            list.add(NumberReader.readDouble());
        for (int i = 0 ; i < size ;i++){
            System.out.println(list.get(i));
        }
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
