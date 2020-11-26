package input.nodes;

import java.util.ArrayList;

public class Node {
    public int numberOfValues;
    public int numberOfParents;
    public ArrayList<Integer> parents;
    public ArrayList<ArrayList<Double>> probOfValues;

    public Node() {
        this.parents = new ArrayList<>();
        this.probOfValues = new ArrayList<>();
    }

    public Node(int numberOfValues, int numberOfParents, ArrayList<Integer> parents, ArrayList<ArrayList<Double>> probOfValues) {
        this.numberOfValues = numberOfValues;
        this.numberOfParents = numberOfParents;
        this.parents = parents;
        this.probOfValues = probOfValues;
    }

    public void setNumberOfValues(int numberOfValues) {
        this.numberOfValues = numberOfValues;
    }

    public void setNumberOfParents(int numberOfParents) {
        this.numberOfParents = numberOfParents;
    }
}
