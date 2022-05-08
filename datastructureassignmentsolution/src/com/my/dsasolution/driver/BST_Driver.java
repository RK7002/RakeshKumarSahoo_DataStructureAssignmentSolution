package com.my.dsasolution.driver;

public class BST_Driver {

	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void flattenBSToSkewed(Node root) {

		if (root == null) {
			return;
		}
		
		flattenBSToSkewed(root.left);
		
		Node rightNode = root.right;
	//	Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		flattenBSToSkewed(rightNode);
	}
	public void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
}
