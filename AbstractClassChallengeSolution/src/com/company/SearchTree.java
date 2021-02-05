package com.company;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        System.out.print("Adding " + item.getValue() + "-> ");
        if(this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                //item is greater than currentItem.
                if(currentItem.next() == null) {
                    currentItem.setNext(item);
                    return true;
                } else {
                    currentItem = currentItem.next();
                }
            } else if(comparison > 0) {
                //current item is greater than item.
                if(currentItem.previous() == null) {
                    currentItem.setPrevious(item);
                    return true;
                } else {
                    currentItem = currentItem.previous();
                }
            } else {
                //current item and new item have equal values.
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        
    }

    @Override
    public void traverse(ListItem root) {
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
