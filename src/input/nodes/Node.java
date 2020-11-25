package input.nodes;

public class Node {
    int numberOfValues;
    int numberOfParents;
    int[] parents;
    double[][] probOfValues;


    public Node (int numberOfValues, int numberOfParents, int[] parents, double[][] probOfValues){
        this.numberOfValues = numberOfValues;
        this.numberOfParents = numberOfParents;
        this.parents = parents;
        this.probOfValues = probOfValues;
    }
}
