package com.company;

import java.util.LinkedList;

public class OrderedLinkedList {
    private ComparableListNode head;

    public OrderedLinkedList() {
        this.head = null;
    }

    public void add(ComparableListNode newNode) {
        if(this.head == null){
            this.head = newNode;
            return;
        }
        else {
            ComparableListNode node = this.head;
            while(node != null) {
                int comparison = node.compareTo(newNode);
//                System.out.println(
//                        "Compare "
//                        + node.getValue()
//                        + " and "
//                        + newNode.getValue()
//                        + " is " + comparison);
                if(comparison >= 1) {
                    if(node == this.head) changeHead(newNode);
                    // if the new node value is alphabetically smaller
                    // set node left list to newNodes left
                    newNode.setLeft(node.getLeft());
                    // set right of left side to newNode if not null
                    if(node.getLeft() != null){
                        node.getLeft().setRight(newNode);
                    }
                    // lock newNode and node
                    newNode.setRight(node);
                    node.setLeft(newNode);
                    return;
                } else if (comparison == 0) return;
                if(node.getRight() == null) break;
                node = node.getRight();
            }
            node.setRight(newNode);
            newNode.setLeft(node);
        }

//        System.out.println("======\n" +
//                            "newNode: " + newNode.getValue() + "\n"
//                            + "left: " + (newNode.getLeft() != null ? newNode.getLeft().getValue() : null) + "\n"
//                            + "right: " + (newNode.getRight() != null ? newNode.getRight().getValue() : null) + "\n"
//                            + "=====");
    }

    private void changeHead(ComparableListNode newNode) {
        this.head = newNode;
    }

    public ComparableListNode getHead() {
        return this.head;
    }

    public void remove(ComparableListNode deleteNode) {
        if(deleteNode == null) return;
        System.out.println("removing " + deleteNode.getValue() + "...");
        if(deleteNode == this.head) {
            changeHead(deleteNode.getRight());
            if(this.head != null) {
                this.head.setLeft(null);
            }
        } else {
            deleteNode.getLeft().setRight(deleteNode.getRight());
        }
    }

    public void remove(String deleteNodeValue) {
        ComparableListNode node = this.head;
        while(node != null) {
            if(node.getValue().equals(deleteNodeValue)) {
                remove(node);
                break;
            }
            node = node.getRight();
        }
    }

    public void printList() {
        ComparableListNode node = this.head;
        int counter = 1;
        System.out.println("===Start List of Nodes===");
        while(node != null) {
            System.out.println("Node " + counter + ": " + node.getValue());
            node = node.getRight();
            counter++;
        }
        System.out.println("===End List of Nodes===");
    }

}
