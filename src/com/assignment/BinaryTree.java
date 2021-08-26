package com.assignment;

public class BinaryTree<K extends Comparable<K>> {

    private INode<K> root;

    public void add(K key) {
        this.root = addRecursively(root, key); // comparing the present key with the root key
    }

    private INode<K> addRecursively(INode<K> current, K key) {
        if (current == null) {
            return new INode<>(key);
        }
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }


    /**
     * getSize is a method to find the size of the BST
     * recursively finding size
     *
     * @return
     */

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(INode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }

    public void displayNode() {
        displayNode(root);
    }

    public void displayNode(INode<K> root) {
        if (root != null) {
            displayNode(root.left);
            System.out.println(root.key);
            displayNode(root.right);
        }
    }
}