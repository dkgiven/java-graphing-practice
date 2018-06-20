package com.dkgiven.java.practice.graphs.searches;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;

import com.dkgiven.java.practice.graphs.domain.Node;

/**
 * @author dkgiven
 * 
 *         Breadth first search: - We go broad (to neighbors) before going deep
 *         (to children) - Need to use a queue
 *
 */
public class BreadthFirstSearch implements GraphSearch {
    @Override
    public Node searchForNode(Node currentNode, Node destinationNode) {
        return searchForNode(currentNode, destinationNode, new ArrayList<Node>());
    }

    private Node searchForNode(Node currentNode, Node destinationNode, List<Node> queue) {
        System.out.println(String.format("Evaluating node %s", currentNode));
        if (currentNode == destinationNode) {
            System.out.println(format("We found our destination node %s!", currentNode));
            return currentNode;
        }
        queue.addAll(currentNode.getAdjacents());
        if (queue.size() == 0) {
            // Queue is drained!
            return null;
        } else {
            Node nextNode = queue.remove(0);
            return searchForNode(nextNode, destinationNode, queue);
        }
    }
}
