package input.nodes;

import java.util.ArrayList;

public class Node {
    public double numberOfValues;
    public double numberOfParents;
    public ArrayList<Double> parents;
    public ArrayList<ArrayList<Double>> probOfValues;
    private Integer value = null;

    public Node() {
        this.parents = new ArrayList<>();
        this.probOfValues = new ArrayList<>();
    }

    public Node(int numberOfValues, int numberOfParents, ArrayList<Double> parents, ArrayList<ArrayList<Double>> probOfValues) {
        this.numberOfValues = numberOfValues;
        this.numberOfParents = numberOfParents;
        this.parents = parents;
        this.probOfValues = probOfValues;
    }

    public void setNumberOfValues(double numberOfValues) {
        this.numberOfValues = numberOfValues;
    }

    public void setNumberOfParents(double numberOfParents) {
        this.numberOfParents = numberOfParents;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
