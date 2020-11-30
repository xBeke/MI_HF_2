import input.InputReader;
import input.readers.NumberReader;

public class Main {
    public static void main(String[] args) {
        double a = NumberReader.readDouble();
        double b = NumberReader.readDouble();
        double c = NumberReader.readDouble();
        double d = NumberReader.readDouble();

        System.out.println(a + " " + b + " " + c + " " + d);
//        InputReader.parseInput();
//        write();

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
