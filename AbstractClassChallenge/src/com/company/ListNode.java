package com.company;
public abstract class ListNode {
    private Object value;
    private ListNode left;
    private ListNode right;

    public ListNode(Object value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Object getValue() {
        return value;
    }

    public ListNode getLeft() {
        return left;
    }

    public ListNode getRight() {
        return right;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setLeft(ListNode left) {
        this.left = left;
    }

    public void setRight(ListNode right) {
        this.right = right;
    }
    public abstract int compareTo(ListNode newNode);
}


