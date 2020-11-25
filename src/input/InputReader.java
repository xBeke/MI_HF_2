package input;

import input.nodes.EvidenceNode;
import input.nodes.Node;

import java.util.ArrayList;

import static input.nodes.readers.NumberReader.readInt;

public class InputReader {
    static int numberOfNodes;
    static int numberOfEvidenceNodes;
    static int goalNode;

    static ArrayList<Node> nodes;
    static ArrayList<EvidenceNode> evidenceNodes;

    public static void parseInput(){
        readNumberOfNodes();
        readNodeParameters();
        readNumberOfEvidenceNodes();
        readEvidenceNodes();
        readGoalNode();
    }

    private static void readNumberOfNodes() {
        numberOfNodes = readInt();
    }

    private static void readNodeParameters() {
    }

    private static void readNumberOfEvidenceNodes() {
    }

    private static void readEvidenceNodes() {
    }

    private static void readGoalNode() {
    }
}
