package javaChallenges;

import javaChallenges.tree.BinarySearchTree;
import javaChallenges.tree.BinaryTree;
import javaChallenges.tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
  @Test
  public void testCreateTree(){
    BinaryTree<Integer> test = new BinaryTree<Integer>();
    test.root = new Node<>(null,null,5);
    test.root.left = new Node<>(null,null,2);
    test.root.left.left = new Node<>(null,null,1);
    test.root.left.right = new Node<>(null,null,3);
    test.root.right = new Node<>(null,null,9);
    test.root.right.right = new Node<>(null,null,12);
    int expected = 1;
    int actual = (int)test.preOrder().get(2);
    assertEquals("Should return 3rd Node: 1", expected,actual);
  }

  @Test
  public void testPreOrderRecursive(){
    BinaryTree<String> test = new BinaryTree<>();
    test.root = new Node<>(null,null,"Superman");
    test.root.left = new Node<>(null,null,"Batman");
    test.root.left.left = new Node<>(null,null,"Wonder Woman");
    test.root.left.right = new Node<>(null,null,"Green Lantern");
    test.root.right = new Node<>(null,null,"Flash");
    test.root.right.right = new Node<>(null,null,"Chuck Norris");
    ArrayList<Object> expected = new ArrayList<>();
    expected.add("Superman");
    expected.add("Batman");
    expected.add("Wonder Woman");
    expected.add("Green Lantern");
    expected.add("Flash");
    expected.add("Chuck Norris");
    ArrayList<Object> actual = test.preOrderRecursive();
    System.out.println(actual);
    assertEquals("Should return an Array List of the Objects: ",expected,actual);
  }

  @Test
  public void testInOrder(){
    BinaryTree<String> test = new BinaryTree<>();
    test.root = new Node<>(null,null,"Batman");
    test.root.left = new Node<>(null,null,"Chuck Norris");
    test.root.left.right = new Node<>(null,null,"Green Lantern");
    test.root.left.left = new Node<>(null,null,"Flash");
    test.root.right = new Node<>(null,null,"Superman");
    test.root.right.right = new Node<>(null,null,"Wonder Woman");
    ArrayList<Object> expected = new ArrayList<>();
    expected.add("Batman");
    expected.add("Chuck Norris");
    expected.add("Flash");
    expected.add("Green Lantern");
    expected.add("Superman");
    expected.add("Wonder Woman");
    ArrayList<Object> actual = test.inOrder();
    ArrayList<Object> actualRecursive = test.inOrderRecursive();
    System.out.println(actualRecursive);
    assertEquals("Should return values starting from the root to the leftmost", expected.toString(),actualRecursive.toString());
  }
  @Test
  public void testPostOrder(){
    BinaryTree<String> test = new BinaryTree<>();
    test.root = new Node<>(null,null,"Batman");
    test.root.left = new Node<>(null,null,"Chuck Norris");
    test.root.left.right = new Node<>(null,null,"Green Lantern");
    test.root.left.left = new Node<>(null,null,"Flash");
    test.root.right = new Node<>(null,null,"Superman");
    test.root.right.right = new Node<>(null,null,"Wonder Woman");
    ArrayList<Object> expected = new ArrayList<>();
    expected.add("Flash");
    expected.add("Green Lantern");
    expected.add("Chuck Norris");
    expected.add("Wonder Woman");
    expected.add("Superman");
    expected.add("Batman");
    ArrayList<Object> actual = test.postOrder();
    assertEquals("Should return same array starting furthest to the left",expected.toString(),
      actual.toString());
  }
  @Test
  public void testAdd(){
    BinarySearchTree<String> test = new BinarySearchTree<>();
    test.add("Flash");
    test.add("Green Lantern");
    test.add("Chuck Norris");
    test.add("Wonder Woman");
    test.add("Superman");
    test.add("Batman");
    String actual = test.root.right.right.value;
    String expected = "Wonder Woman";
    assertEquals("Should return the right.right value: Wonder Woman",expected,actual);
  }
      @Test
      public void testContains(){
        BinarySearchTree<String> test = new BinarySearchTree<>();
        test.add("Flash");
        test.add("Green Lantern");
        test.add("Chuck Norris");
        test.add("Wonder Woman");
        test.add("Superman");
        test.add("Batman");
        boolean actual = test.contains("Flash");
        assertTrue(actual);
      }

    @Test
    public void testFindMax(){
      BinarySearchTree<Integer> test = new BinarySearchTree<>();
      test.add(3);
      test.add(4);
      test.add(8);
      test.add(1);
      test.add(12);
      test.add(52);
      test.add(7);
      int expected = 52;
      int actual = test.findMax();
      assertEquals("Should return 52",expected,actual);
      }

      @Test
      public void testBreadthFirst(){
        BinaryTree<Integer> test = new BinaryTree<>();
        test.root = new Node<>(null,null,2);
        test.root.left = new Node<>(null,null,7);
        test.root.left.left = new Node<>(null,null,2);
        test.root.left.right = new Node<>(null,null,6);
        test.root.left.right.left = new Node<>(null,null,5);
        test.root.left.right.right = new Node<>(null,null,11);
        test.root.right = new Node<>(null,null,5);
        test.root.right.right = new Node<>(null,null,9);
        test.root.right.right.left = new Node<>(null,null,4);
//        System.out.println(test.postOrder());
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(7);
        expected.add(5);
        expected.add(2);
        expected.add(6);
        expected.add(9);
        expected.add(5);
        expected.add(11);
        expected.add(4);
        ArrayList<Object> actual = test.breadth_first_traversal();
        assertEquals( "Should return elements based on their level",expected,actual);

      }
}
