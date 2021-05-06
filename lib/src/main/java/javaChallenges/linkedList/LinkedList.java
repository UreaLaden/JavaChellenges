package javaChallenges.linkedList;

import javaChallenges.doublyLinkedList.Node;

public class LinkedList{
    public Node head;
    public Node tail;

  public LinkedList(){
    this.head = null;
    this.tail = null;
  }
  public void insert(Object value){
    //takes any value as an argument and adds
    // a new node with the value to the head of the list wih an O(1) Time performance
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
    if(this.tail == null) this.tail = newNode;
  }
  public boolean includes(int value){
    //takes any value as an argument and returns a boolean result depending
    //on whether that value exists as a Node's value somewhere within the list
    Node current = this.head;
    while(current != null){
      if(current.value.equals(value))
      {
        return true;
      }
      current = current.next;
    }
    return false;
  }
  public boolean includesRecursive(int targetValue){
    return includesRecursive(this.head,targetValue);
  }
  private boolean includesRecursive(Node current, int targetValue){
//    assuming LL is {9} -> {7} -> null
//    base case: we arrive at null
//    small bit of work : node of not null : check for match: return true
//    recursion : call the function on current.next, value
    if(current == null)return false;
    if(current.value.equals(targetValue))return true;
    return includesRecursive(current.next,targetValue);
  }

  public String toString(){
    //takes in no arguments and returns a string representing all the values
    // in the Linked List
    return this._toString(this.head);
  }

  public String _toString(Node currentNode){
    if(currentNode == null)return null;
    return "{" + currentNode.value + "} -> " + this._toString(currentNode.next);
  }


  public int countNodes(){
    //count all the nodes of a linked list
    Node currentNode = this.head;
    int count = 0;
    while(currentNode != null){
      currentNode = currentNode.next;
      count++;
    }
    return count;
  }

  public void append(Object value){
    Node newNode = new Node(value);
    this.tail.next = newNode;
    this.tail = newNode;
  }
  public void insertBefore(int value, int newVal){
    Node newNode = new Node(newVal);
    Node current = this.head;
    boolean isHeadOrTail = this.tail.value.equals(value) || current.value.equals(value);
    if(!isHeadOrTail ){
      while(current.next != null){
        if(current.next.value.equals(value)){
          newNode.next = current.next;
          current.next = newNode;
          return;
        }
        current = current.next;
      }
    }
    else{
      if(this.tail.value.equals(value))
      {
        newNode.next = this.tail;
        this.tail.prev.next = newNode;
      }
      else{
        this.insert(newVal);
      }
    }
  }
  public void insertAfter(int value, int newVal){
    Node newNode = new Node(newVal);
    boolean isTail = this.tail.value.equals(value);
    if(isTail){
      append(newVal);
    }
    else{
      Node current = this.head;
      while(current.next != null){
        if(current.value.equals(value)){
          Node temp = current.next;
          current.next = newNode;
          newNode.next = temp;
          return;
        }
        current = current.next;
      }
    }
  }

  public void delete(int value){
    boolean isHead = this.head.value.equals(value);
    boolean isTail = this.tail.value.equals(value);
    if(isHead){
      Node temp = this.head.next;
      this.head.next = null;
      this.head = temp;
    }
    if(isTail){
      Node temp = this.tail.prev;
      this.tail = null;
      this.tail = temp;
    }
    Node current = this.head;
    while(current.next != null){
      if(current.next.value.equals(value)){
        Node temp = current.next;
        current.next = null;
        current.next = temp.next;
        return;
      }
      current = current.next;
    }
  }

  public int kthFromEnd(int index){
    Node current = this.head;
    int currentIdx = 0;
    int maxIndex = this.countNodes()-1;
    if(maxIndex == index){return (int)current.value;}
    int target;
    try{
      boolean indexInRange = index < this.countNodes() && index >= 0;
      if(indexInRange){
        target=0;
      }
    }catch(Exception e){
      System.out.println("Index Out of Bounds");
      throw e;
    }
    while(current.next != null ){
      target = (this.countNodes()-1) - currentIdx;
      if(target == index){
        return (int)current.value;
      }
      currentIdx++;
      current = current.next;
    }
    return -1;
  }

  public LinkedList zipLists(LinkedList b){
    if(this.countNodes() == 0)return b;
    if(b.countNodes() == 0) return this;
    zipLists(this.head,b.head);
    return this;
  }
  private void zipLists(Node a, Node b){
    Node temp1 = a.next;
    Node temp2 = b.next;
    if(temp1 == null)return;
    if(temp2 == null)return;
    a.next = b;
    b.next = temp1;
    zipLists(temp1,temp2);
  }
}
