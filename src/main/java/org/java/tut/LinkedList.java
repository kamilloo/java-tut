package org.java.tut;

public class LinkedList {
    private int length = 0;
    private ListItem head = null;

    public ListItem getHead() {
        return head;
    }

    public void reset(int i) {
        head = new ListItem(i);
        length = 1;
    }

    public int isLength() {
        return length;
    }

    public void addFirst(int i) {
        ListItem first = new ListItem(i);
        first.setNext(head);
        length++;
        head = first;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public ListItem get(int i) {
        if ((length == 0)) {
            return null;
        }
        ListItem listItem = head.get(i);
        if (listItem == null){
            return null;
        }
        remove(listItem);
        return listItem;
    }

    private void remove(ListItem listItem) {
        boolean removed = head.remove(listItem);
        if (removed) {
            length--;
        }
    }
}
