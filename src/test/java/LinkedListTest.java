import org.java.tut.LinkedList;
import org.java.tut.ListItem;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {

    @Test
    public void getHead(){

        //GIVEN
        LinkedList stack = new LinkedList();

        //When
        stack.reset(1);

        //Then
        Assertions.assertEquals(1, stack.isLength());
        Assertions.assertEquals(1, stack.getHead().getValue());
    }

    @Test
    public void addFirst(){
        LinkedList stack = new LinkedList();

        stack.addFirst(0);

        //Then
        Assertions.assertEquals(1, stack.isLength());
        Assertions.assertEquals(0, stack.getHead().getValue());
    }

    @Test
    public void addFirst_moveOldHeadToSecondItem(){
        LinkedList list = new LinkedList();
        list.reset(10);

        //When
        list.addFirst(9);

        //Then
        Assertions.assertEquals(2, list.isLength());
        Assertions.assertEquals(10, list.getHead().getNext().getValue());
    }

    @Test
    public void getAndRemoveHead(){

        LinkedList list = new LinkedList();
        list.reset(10);

        //When
        ListItem listItem = list.get(10);
        //Then
        Assertions.assertEquals(1, list.isLength());
        Assertions.assertEquals(10, listItem.getValue());
    }

    @Test
    public void getAndRemoveAfterHaed(){

        LinkedList list = new LinkedList();
        list.reset(10);
        list.addFirst(12);

        //When
        ListItem listItem = list.get(10);
        //Then
        Assertions.assertEquals(1, list.isLength());
        Assertions.assertEquals(10, listItem.getValue());
    }


    public void insertOnEnd(){}
    public void insertAfter(){}
    public void insertBefore(){}
}
