package com.my.dsasolution.service;

import com.my.dsasolution.driver.*;

public class BST_MNC_Service_Q2 {

	public static void main(String[] args) {
		BST_Driver tree = new BST_Driver();
		
		tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

        tree.flattenBSToSkewed(tree.node);
        tree.traverseRightSkewed(tree.headNode);
	}

}
