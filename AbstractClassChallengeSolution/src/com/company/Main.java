package com.company;

public class Main {

    public static void main(String[] args) {
	    SearchTree list = new SearchTree(null);
	    list.traverse(list.getRoot());
	    String stringData = "8 9 7 6 0 1 3 2 4 8 6 5 3 8 4 5 6 0 1 2 5";
	    String[] data = stringData.split(" ");
	    for(String s : data) {
			list.addItem(new Node(s));
        }
	    list.traverse(list.getRoot());
    }

}
