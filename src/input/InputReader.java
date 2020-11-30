package input;

import input.nodes.EvidenceNode;
import input.nodes.Node;
import input.readers.NumberReader;

import java.util.ArrayList;

public class InputReader {
    public static int numberOfNodes;
    public static ArrayList<Node> nodes = new ArrayList<>();
    public static int numberOfEvidenceNodes;
    public static ArrayList<EvidenceNode> evidenceNodes = new ArrayList<>();
    public static int goalNode;

    public static void parseInput(){
        readNumberOfNodes();
        readNodeParameters();
//        readNumberOfEvidenceNodes();
//        readEvidenceNodes();
//        readGoalNode();
    }

    private static void readNumberOfNodes() {
        numberOfNodes = NumberReader.readInt();
    }

    private static void readNodeParameters() {
        for (int i = 0 ; i < numberOfNodes ; i++){
            Node node = new Node();

            node.setNumberOfValues(NumberReader.readInt());
            node.setNumberOfParents(NumberReader.readInt());

//            for (int j = 0 ; j < node.numberOfParents ; j ++){
//                node.parents.add(NumberReader.readInt());
//            }
//            int x = 0;
//
//            for ( int j = 0 ; j < productOfParentalPossibleValues(node) ; j++){
//                ArrayList<Double> row = new ArrayList<>();
//                for( int k = 0 ; k < node.numberOfParents + node.numberOfValues ; k++){
//                    row.add(NumberReader.readDouble());
//                }
//                node.probOfValues.add(row);
//            }

//            for (int j = 0 ; j < sumOfPossibleValues  ; j++) {
//                ArrayList<Double> row = new ArrayList<>();
//                for (int k = 0 ; k < (node.numberOfValues + node.numberOfParents) ; k++){
//                    row.add(reader.readDouble());
//                }
//                node.probOfValues.add(row);
//            }
            nodes.add(node);
        }
    }

    private static int productOfParentalPossibleValues(Node node) {
        int sum = 0;
        for (int i = 0 ; i < node.numberOfParents ;i++){
            sum += nodes.get(i).numberOfValues;
        }
        return sum;
    }

    private static void readNumberOfEvidenceNodes() {
        NumberReader reader = new NumberReader();
        numberOfEvidenceNodes = reader.readInt();
    }

    private static void readEvidenceNodes() {
        for (int i = 0 ; i < numberOfEvidenceNodes ; i++){
            NumberReader reader = new NumberReader();
            evidenceNodes.add(new EvidenceNode(reader.readInt(), reader.readInt()));
        }
    }

    private static void readGoalNode() {
        NumberReader reader = new NumberReader();
        goalNode = reader.readInt();
    }
}
