package com.dkgiven.java.practice.graphs.searches;

import static java.lang.String.format;

import java.util.List;
import java.util.Objects;

import com.dkgiven.java.practice.graphs.domain.Node;

/**
 * @author dkgiven
 * 
 *         Depth first search: - We go deep down to a node (children) before
 *         going broad (to neighbors) - Implemented recursively - You need to
 *         implement an isVisited flag to ensure you don't run into cycles
 *
 */
public class DepthFirstSearch implements GraphSearch {
    @Override
    public Node searchForNode(Node currentNode, Node destinationNode) {
        System.out.println(String.format("Evaluating node %s", currentNode));
        if (currentNode.isVisited()) {
            System.out.println(format("We already visited this node %s!", currentNode));
            return null;
        }
        if (currentNode == destinationNode) {
            System.out.println(format("We found our destination node %s!", currentNode));
            return currentNode;
        }
        List<Node> adjacents = currentNode.getAdjacents();
        return adjacents.stream().map((adjacentNode) -> searchForNode(adjacentNode, destinationNode))
                .filter(Objects::nonNull).findFirst().orElseGet(() -> null);
    }

}
