package javaChallenges.doublyLinkedListTest;

import javaChallenges.doublyLinkedList.DoublyLinkedList;
import javaChallenges.doublyLinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublyLinkedListTest {
  @Test public void testCreateDoublyLinkedList(){
    DoublyLinkedList test1 = new DoublyLinkedList();
    String expected1 = "class javaChallenges.doublyLinkedList.DoublyLinkedList";
    String actual1 = test1.getClass().toString();
    assertEquals("Should create a doubly Linked List: ",expected1,actual1);
  }
  @Test public void testInsert(){
    DoublyLinkedList test2 = new DoublyLinkedList();
    test2.insert(5);
    int expected2 = 5;
    int actual2 = test2.head.value;
    assertEquals("Should be able to insert a value: ", expected2,actual2);
  }
  @Test public void testPrev(){
    DoublyLinkedList test2b = new DoublyLinkedList();
    test2b.insert(3);
    test2b.insert(4);
    test2b.insert(5);
    test2b.insert(6);
    test2b.insert(7);
    Node current = test2b.head;
    int expected2b = 5;
    int target = 4;
    int actual2b = -1;
    while(current != null){
      if(current.value == target){
        actual2b = current.prev.value;
      }
      current = current.next;
    }
    System.out.println("Prev value of Node 4 is " + actual2b);
    assertEquals("The prev to Node 4 should return 5: ",expected2b,actual2b);

  }

  @Test public void testIncludes(){
    DoublyLinkedList test3 = new DoublyLinkedList();
    test3.insert(4);
    test3.insert(2);
    test3.insert(3);
    test3.insert(1);
    boolean expected3 = true;
    int check = 1;
    boolean actual3 = test3.includes(check);
    assertEquals("Should return true if 1 was inserted: ",expected3,actual3);
  }

  @Test public void testToString(){
    DoublyLinkedList test4 = new DoublyLinkedList();
    test4.insert(9);
    test4.insert(7);
    test4.insert(4);
    test4.insert(8);
    test4.insert(2);
    String expected4 = "2 -> 8 -> 4 -> 7 -> 9 -> NULL";
    String actual4 = test4.iterativeToString();
    String actual4b = test4.toString();
    assertEquals("Should display '2 -> 8 -> 4 -> 7 -> 9 -> NULL'", expected4,actual4);
    assertEquals("Should display '2 -> 8 -> 4 -> 7 -> 9 -> NULL'", expected4,actual4b);

  }

  @Test public void testCount(){
    DoublyLinkedList test5 = new DoublyLinkedList();
    test5.insert(23);
    test5.insert(32);
    test5.insert(54);
    test5.insert(78);
    test5.insert(53);
    test5.insert(90);
    test5.insert(13);
    test5.insert(45);
    test5.insert(75);
    test5.insert(99);
    int expected5 = 10;
    int actual5 = test5.countNodes();
    assertEquals("Should contain 10 nodes: ",expected5, actual5);
  }

}
