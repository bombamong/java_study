package com.company;

public class ComparableListNode extends ListNode {
    private ComparableListNode left;
    private ComparableListNode right;

    public ComparableListNode(String value) {
        super(value);
    }

    @Override
    public ComparableListNode getLeft() {
        return this.left;
    }

    @Override
    public ComparableListNode getRight() {
        return this.right;
    }

    public void setLeft(ComparableListNode left) {
        this.left = left;
    }

    public void setRight(ComparableListNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(ListNode newNode) {
        return super.getValue().toString().compareTo(newNode.getValue().toString());
    }
}
