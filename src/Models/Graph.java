package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    int[][] adajacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adajacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j){
        adajacencyMatrix[i][j] = 1;
        adajacencyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for(int i = 0; i < nodeList.size(); i++){
            s.append(nodeList.get(i).getData() + " ");
        }
        s.append("\n");
        for(int i = 0; i < nodeList.size(); i++){
            s.append(nodeList.get(i).getData() + ": ");
            for(int j : adajacencyMatrix[i]){
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}