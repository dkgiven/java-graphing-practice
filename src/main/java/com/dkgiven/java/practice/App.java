package com.dkgiven.java.practice;

import static java.lang.String.format;

import com.dkgiven.java.practice.graphs.domain.Node;
import com.dkgiven.java.practice.graphs.searches.DepthFirstSearch;

public class App {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        
        Node targetNode = i;

        // Add paths
        a.addAdjacentNode(b);
        a.addAdjacentNode(c);
        a.addAdjacentNode(d);

        b.addAdjacentNode(e);
        b.addAdjacentNode(f);

        c.addAdjacentNode(g);

        e.addAdjacentNode(h);

        f.addAdjacentNode(i);

        System.out.println("Running depth first search...");
        DepthFirstSearch dfs = new DepthFirstSearch();
        Node node = dfs.searchForNode(a, targetNode);
        if (node == null) {
            System.out.println(
                    format("Depth first search completed without finding destination node [%s]...", targetNode));
        }
        // System.out.println("Running breadth first search...");
        // BreadthFirstSearch bfs = new BreadthFirstSearch();
        // bfs.searchForNode(a, f);

    }
}
