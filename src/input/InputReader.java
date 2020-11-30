package input;

import input.nodes.EvidenceNode;
import input.nodes.Node;
import input.readers.NumberReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

    // static variable single_instance of type Singleton
    private static InputReader instance = null;
    BufferedReader reader;
    private Integer numberOfNodes;
    private Integer numberOfEvidenceNodes;
    private List<Node> allNodes;


    private InputReader() {
        reader = null;
        allNodes = new ArrayList<>();
    }

    public static InputReader getInstance()
    {
        if (instance == null) {
            instance = new InputReader();
        }

        return instance;
    }

    public void parseInput() {
        try {
            initReader();
            numberOfNodes = readSingleIntegerFromLine();

            readNodes(numberOfNodes);

            numberOfEvidenceNodes = readSingleIntegerFromLine();

            readEvidenceNodes(numberOfEvidenceNodes);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            closeReader();
        }
    }

    private void readEvidenceNodes(Integer numberOfEvidenceNodes) throws IOException {
        for (int i = 0; i < numberOfEvidenceNodes; i++) {
            EvidenceNode evidenceNode = NumberReader.parseEvidenceNode(reader.readLine());
            this.getAllNodes().get(evidenceNode.getIndex()).setValue(evidenceNode.getValue());
        }
    }

    private void readNodes(Integer numberOfNodes) throws IOException {
        for (int i = 0; i < numberOfNodes; i++) {
            this.getAllNodes().add(NumberReader.parseNode(reader.readLine()));
        }
    }

    private Integer readSingleIntegerFromLine() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public void initReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void closeReader() {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    public List<Node> getAllNodes() {
        return allNodes;
    }
}
