package com.dkgiven.java.practice.graphs.searches;

import com.dkgiven.java.practice.graphs.domain.Node;

@FunctionalInterface
public interface GraphSearch {
    public abstract Node searchForNode(Node currentNode, Node destinatioNode);
}
