import input.InputReader;

public class Main {
    public static void main(String[] args) {
        InputReader.parseInput();
        write();
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
