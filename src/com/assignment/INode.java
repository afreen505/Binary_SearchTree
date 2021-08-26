package com.assignment;

public class INode<K extends Comparable<K>> {
    K key;
    public INode<K> left;// left pointer
    public INode<K> right;// for right pointer

    public INode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}