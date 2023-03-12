package org.java.tut;

public class ListItem {
    private ListItem next;
    private int value;

    public ListItem(int value) {
        this.value = value;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public ListItem getNext() {
        return next;
    }

    public ListItem get(int i) {
        if (value == i){
            return this;
        }
        if (next != null){
            return next.get(i);
        }
        return null;
    }

    public boolean remove(ListItem listItem) {
        if (next == null){
            return false;
        }
        if (next.getValue() == listItem.getValue()){
            next = listItem.getNext();
            return true;
        }
        return next.remove(listItem);
    }
}
