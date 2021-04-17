package javaChallenges.utilities;

import java.util.ArrayList;

public class Node {
  Object value;
  ArrayList<Node> children;

  public Node(int value){
    this.value = value;
    this.children = new ArrayList<>();
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public ArrayList<Node> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<Node> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", children=" + children +
      '}';
  }
}
