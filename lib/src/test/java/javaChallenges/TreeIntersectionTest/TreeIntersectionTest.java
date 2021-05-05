package javaChallenges.TreeIntersectionTest;

import javaChallenges.TreeIntersection.TreeIntersection;
import javaChallenges.tree.BinaryTree;
import javaChallenges.tree.Node;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {
  @Test
  public void testFindIntersection(){
    BinaryTree a = new BinaryTree();
    BinaryTree b = new BinaryTree();
    a.root = new Node(null,null,150);
    a.root.left = new Node(null,null,100);
    a.root.left.left = new Node(null,null,75);
    a.root.left.right = new Node(null,null,160);
    a.root.left.right.right = new Node(null,null,175);
    a.root.left.right.left = new Node(null,null,125);

    a.root.right = new Node(null,null,250);
    a.root.right.left = new Node(null,null,200);
    a.root.right.right = new Node(null,null,350);
    a.root.right.right.left = new Node(null,null,300);
    a.root.right.right.right = new Node(null,null,500);

    b.root = new Node(null,null,42);
    b.root.left = new Node(null,null,100);
    b.root.left.left = new Node(null,null,15);
    b.root.left.right = new Node(null,null,160);
    b.root.left.right.left = new Node(null,null,125);
    b.root.left.right.right = new Node(null,null,175);

    b.root.right = new Node(null,null,600);
    b.root.right.left = new Node(null,null,200);
    b.root.right.right = new Node(null,null,350);
    b.root.right.right.left = new Node(null,null,4);
    b.root.right.right.right = new Node(null,null,500);

    HashSet<Object> expected =new HashSet<>() ;
    expected.add(100);
    expected.add(160);
    expected.add(125);
    expected.add(175);
    expected.add(200);
    expected.add(350);
    expected.add(500);
    TreeIntersection intersect = new TreeIntersection(a,b);
    HashSet<Object> actual = intersect.tree_intersection();
    assertEquals("Should return [160, 100, 500, 200, 125, 350, 175]",expected,actual);
  }
}
