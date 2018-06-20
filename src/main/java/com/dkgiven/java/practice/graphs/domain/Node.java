package com.dkgiven.java.practice.graphs.domain;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String data;
    private boolean visited;
    List<Node> adjacents = new ArrayList<Node>();

    public Node(String data) {
        this.data = data;
    }

    public void addAdjacentNode(Node node) {
        this.adjacents.add(node);
    }

    public List<Node> getAdjacents() {
        return this.adjacents;
    }

    public String getData() {
        return this.data;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setAdjacentNodes(List<Node> nodes) {
        this.adjacents = nodes;
    }

    @Override
    public String toString() {
        return format("Node = [%s]", this.data);
    }
}
