package javaChallenges.doublyLinkedList;

public class Node {
  public int value;
  public Node next;
  public Node prev;

  public Node(int value){
    this.value = value;
    this.next = null;
    this.prev = null;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", next=" + next +
      ", prev=" + prev +
      '}';
  }
}
