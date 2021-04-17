package javaChallenges.FizzBuzzTree;

import javaChallenges.utilities.FizzBuzzTree;
import javaChallenges.utilities.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {
  @Test
  public void testCreateKTree(){
    FizzBuzzTree fbTree = new FizzBuzzTree();
    fbTree.setRoot(new Node(1));
    fbTree.getRoot().getChildren().add(new Node(4));
    fbTree.getRoot().getChildren().add(new Node(3));
    fbTree.getRoot().getChildren().add(new Node(9));

    Node child1 = fbTree.getRoot().getChildren().get(0);
    child1.getChildren().add(new Node(15));
    child1.getChildren().add(new Node(85));
    child1.getChildren().get(0).getChildren().add(new Node(30));

    child1.getChildren().get(1).getChildren().add(new Node(16));
    child1.getChildren().get(1).getChildren().add(new Node(32));

    Node child3 = fbTree.getRoot().getChildren().get(2);
    child3.getChildren().add(new Node(35));

    ArrayList<Object> expected = new ArrayList<>();
    expected.add("FizzBuzz");
    expected.add("4");
    expected.add("FizzBuzz");
    expected.add("FizzBuzz");
    expected.add("Buzz");
    expected.add("16");
    expected.add("32");
    expected.add("Fizz");
    expected.add("Fizz");
    expected.add("Buzz");

    ArrayList<Object> actual = fbTree.fbTransform(fbTree,fbTree.getRoot()).getList();
    assertEquals("Should return a new K-Tree: ",expected,actual);
  }
}
