package input.nodes;

import java.util.ArrayList;

public class Node {
    public double numberOfValues;
    public double numberOfParents;
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

    public void setNumberOfValues(Double numberOfValues) {
        this.numberOfValues = numberOfValues;
    }

    public void setNumberOfParents(double numberOfParents) {
        this.numberOfParents = numberOfParents;
    }
}
