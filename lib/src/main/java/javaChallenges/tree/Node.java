package javaChallenges.tree;

public class Node<T> {
  public Node<T> left;
  public Node<T> right;
  public T value;


  public Node(Node<T>left,Node<T> right, T value){
    this.left = left;
    this.right = right;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" + ", value=" + value + " left=" + left + ", right=" + right + '}';
  }

  public Node<T> getLeft() {
    return left;
  }

  public Node<T> getRight() {
    return right;
  }

  public T getValue() {
    return value;
  }
}
