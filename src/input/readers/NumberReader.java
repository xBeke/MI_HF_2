package input.readers;

import input.nodes.EvidenceNode;
import input.nodes.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberReader {
    public static Node parseNode(String nodeAsString){
        Node node = new Node();
        node.numberOfValues = parseNumberOfValues(nodeAsString);
        nodeAsString = cutUntilNextTab(nodeAsString);
        node.numberOfParents = parseNumberOfParents(nodeAsString);
        nodeAsString = cutUntilNextTab(nodeAsString);
        node.parents = parseParents(nodeAsString, node.numberOfParents);
        nodeAsString = cutUntilNextTab(nodeAsString, node.numberOfParents);
        node.probOfValues = parseProbOfValues(nodeAsString);
        return node;
    }

    public static EvidenceNode parseEvidenceNode(String evidenceNodeAsString){
        String[] evidenceNode = evidenceNodeAsString.split("\t");
        return new EvidenceNode(Integer.parseInt(evidenceNode[0]), Integer.parseInt(evidenceNode[1]));
    }

    private static String cutUntilNextTab(String nodeAsString) {
        return cutUntilNextTab(nodeAsString , 1);
    }

    private static String cutUntilNextTab(String nodeAsString, double times) {
        for (int i = 0; i < times; i++) {
            int numberEndIndex = nodeAsString.indexOf("\t");
            nodeAsString = nodeAsString.substring(numberEndIndex+1, nodeAsString.length()-1);
        }
        return nodeAsString;
    }

    private static double parseNumberOfValues(String nodeAsString) {
        return parseOneNumberUntilTab(nodeAsString);
    }

    private static double parseNumberOfParents(String nodeAsString) {
        return parseOneNumberUntilTab(nodeAsString);
    }

    private static double parseOneNumberUntilTab(String nodeAsString){
        int numberEndIndex = nodeAsString.indexOf("\t");
        return Double.parseDouble(nodeAsString.substring(0, numberEndIndex));
    }

    private static ArrayList<Double> parseParents(String nodeAsString, double numberOfParents) {
        ArrayList<Double> parents = new ArrayList<>();
        for (int i = 0; i < numberOfParents; i++) {
            parents.add(parseOneNumberUntilTab(nodeAsString));
            nodeAsString = cutUntilNextTab(nodeAsString);
        }
        return parents;
    }

    private static ArrayList<ArrayList<Double>> parseProbOfValues(String nodeAsString) {
        ArrayList<ArrayList<Double>> table = new ArrayList<>();
        String[] stringRow = nodeAsString.split("\\s");
        for (int i = 0; i < stringRow.length; i++) {
            ArrayList<Double> row = new ArrayList<>();
            String[] stringValues = stringRow[i].split("[,:]");
            Arrays.stream(stringValues).forEach(value -> row.add(Double.parseDouble(value)));
            table.add(row);
        }
        return table;
    }
}
