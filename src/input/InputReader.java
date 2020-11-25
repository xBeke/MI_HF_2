package input;

import input.nodes.EvidenceNode;
import input.nodes.Node;

import java.util.ArrayList;

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

    }
}
