package javaChallenges.doublyLinkedList;

public class DoublyLinkedList {
  public Node head;
  public Node tail;

  public DoublyLinkedList(){
    this.head = null;
    this.tail = null;
  }
  public void insert(int value){
    Node newNode = new Node(value);
    newNode.next = this.head;
    if(this.head != null)this.head.prev = newNode;
    this.head = newNode;
    if(this.tail == null) this.tail= newNode;
  }
  public boolean includes(int value){
    Node current = this.head;
    while(current != null){
      if(current.value == value){
        return true;
      }
      current = current.next;
    }
    return false;
  }
  public String toString(){
    return this._toString(this.head);
  }
  public String _toString(Node targetNode){
    if(targetNode == null)return "NULL";
    return "" + targetNode.value + " -> " + this._toString(targetNode.next);
  }
  public String iterativeToString(){
    Node current = this.head;
    String result ="";
    while(current != null){
      result += current.value;
      current = current.next;
      if(current != null){
        result += " -> ";
      }else{
        result += " -> NULL";
      }
    }
    return result;
  }
  public int countNodes(){
    int totalNodes = 0;
    Node current = this.head;
    while(current != null){
      current = current.next;
      totalNodes++;
    }
    return totalNodes;
  }
}
