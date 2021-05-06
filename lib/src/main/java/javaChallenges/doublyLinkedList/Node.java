package javaChallenges.doublyLinkedList;

import java.util.ArrayList;

public class Node<V> {
  public V value;
  public Node next;
  public Node prev;

  public Node(V value){
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

  public ArrayList<Object> toArray(){
    ArrayList<Object> array = new ArrayList<>();
    Node current = this;
    while(current != null){
      array.add(current.value);
      current = current.next;
    }
    return array;
  }
}
