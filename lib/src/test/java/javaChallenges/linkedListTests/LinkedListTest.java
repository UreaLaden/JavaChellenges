package javaChallenges.linkedListTests;

import javaChallenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest{

  @Test public void createLinkedList(){
    LinkedList emptyList = new LinkedList();
    String expected0 = "class javaChallenges.linkedList.LinkedList";
    String actual0 = emptyList.getClass().toString();
    assertEquals("Should create a Linked List: ",expected0,actual0);
  }
  @Test public void testInsert(){
    LinkedList test1 = new LinkedList();
    boolean expecteda = false;
    test1.insert(1);
    boolean actualb = test1.head == null;
    assertEquals("Should return false if head is not null: ", expecteda,actualb);
    test1.insert(3);
    test1.insert(8);
    test1.insert(9);
    test1.append(6);
    int expectedA2 = 6;
    int actualB2 = test1.tail.value;
    assertEquals("Should append a value to the end: ",expectedA2,actualB2);
    System.out.println(test1.toString());
    test1.insertBefore(8,7);
    System.out.println(test1.toString());
    test1.insertAfter(3,14);
    System.out.println(test1.toString());
    test1.delete(8);
    System.out.println(test1.toString());
    test1.delete(9);
    System.out.println(test1.toString());
    test1.delete(6);
    System.out.println(test1.toString());

  }

  @Test public void testIncludes(){
    LinkedList list = new LinkedList();
    int val = 3;
    list.insert(3);
    list.insert(5);
    list.insert(4);
    list.includes(3);
    boolean expected = true;
    boolean actual = list.includes(val);
    System.out.println("Value is included: " + actual);
    assertEquals("Should return true if value is in linked list",expected,actual);

    boolean expectedc = false;
    boolean actualc = list.includes(7);
    assertEquals("Should return false if value is not in the linked list ",expectedc,actualc);
  }
  @Test public void testToString(){
    LinkedList newList = new LinkedList();
    String expected2 = "{15} -> {43} -> {24} -> {57} -> {8} -> NULL";
    newList.insert(8);
    newList.insert(57);
    newList.insert(24);
    newList.insert(43);
    newList.insert(15);
    String actual2 = newList.toString();
    assertEquals("Should return a string representation of the linked list: ",expected2,actual2);
  }

  @Test public void testKthValue() throws Exception {
    LinkedList test = new LinkedList();
    test.insert(4);
    test.insert(7);
    test.insert(9);
    test.insert(10);
    test.insert(2);
    test.insert(3);
    int expected = 10;
    int actual = test.kthFromEnd(3); // 10
    assertEquals("Should return the value at the 3rd index from the end:",expected,actual);
    boolean e2 = true;
    int expectedAmount = 0;
    int actualAmount = test.kthFromEnd(-1);
    boolean invalidArgument = actualAmount < expectedAmount;
    assertTrue("Input must be positive and within the length of the list", invalidArgument);
  }

  @Test public void testLength(){
    LinkedList test = new LinkedList();
    test.insert(5);
    test.insert(2);
    int expected = 0;
    int actual = test.kthFromEnd(2);
    boolean invalidArgument = actual < expected;
    assertTrue("Input should be smaller than the length", invalidArgument);

    LinkedList test2 = new LinkedList();
    test2.insert(1);
    int expected2 = 1;
    int actual2 = test2.kthFromEnd(0);
    assertEquals("Should account for a list with 1 variable",expected2,actual2);
  }

  @Test public void testZipList(){
    LinkedList a = new LinkedList(); // 5 ->  4 -> 3
    LinkedList b = new LinkedList(); // 10 ->  9 -> 8
    a.insert(3);
    a.insert(4);
    a.insert(5);
    b.insert(8);
    b.insert(9);
    b.insert(10);
    String expected = "{5} -> {10} -> {4} -> {9} -> {3} -> NULL";
    String actual = a.zipLists(b).toString(); // 5 -> 10 -> 4 -> 9 -> 3 -> 8
    assertEquals("Should combine both two linked lists",expected,actual);
  }

  @Test public void testAgainstNullList(){
    LinkedList a = new LinkedList();
    LinkedList b = new LinkedList();
    b.insert(3);
    b.insert(2);
    b.insert(1);
    String expected = "{1} -> {2} -> {3} -> NULL";
    String actual = a.zipLists(b).toString();
    assertEquals("Should return remaining list if a list is empty", expected,actual);
    LinkedList c = new LinkedList();
    a.insert(5);
    a.insert(6);
    a.insert(7);
    String expected2 = "{7} -> {6} -> {5} -> NULL";
    String actual2 = a.zipLists(c).toString();
    assertEquals("Should return remaining list if a list is empty", expected,actual);
  }


}
