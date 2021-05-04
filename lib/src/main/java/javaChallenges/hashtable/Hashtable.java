package javaChallenges.hashtable;
import java.util.ArrayList;

public class Hashtable {
  ArrayList<LinkedList> buckets;
  public int size;


  public Hashtable(int size){
    this.size = size;
    this.buckets=new ArrayList<>();
    for(int i=0; i< size;i++){
      buckets.add(new LinkedList());
    }
  }

  @Override
  public String toString() {
    String result = "";
    for(LinkedList bucket : buckets){
      String line = "";
      Node current = bucket.head;
      while(current != null){
        line += "{ " + current.value.key + " : " + current.value.value + " }";
        current = current.next;
      }
      result += line ;
    }
    return result ;
  }
  public Object get(Object key){
    int targetIndex = this.hash(key);
    LinkedList linkedListAtIdx = this.buckets.get(targetIndex);
    Node current = linkedListAtIdx.head;
    while(current != null){
      if(current.value.key == key){
        return current.value.value;
      }
      current = current.next;
    }
    return null;
  }
  public boolean contains(Object key){
    Object containsItem = this.get(key);
    return containsItem != null;
  }

  public int add(Object key, Object value){
    int insertionIdx = this.hash(key);
    LinkedList linkedList = buckets.get(insertionIdx);
    StorageObject object = new StorageObject(key, value);
    linkedList.add(object);
    return insertionIdx;
  }
  public int hash(Object valueToHash){
    String value = valueToHash.toString();
    int hash = 0;
    for(int i=0 ; i< value.length();i++){
      int num = value.charAt(i);

      hash += num;
      hash = hash * (int)Math.pow(31,6);
      hash = hash % 1000000001;
    }
    hash = Math.abs(hash) % buckets.size();
    return hash;
  }

  private static class LinkedList{
    Node head;

    public LinkedList(){
      this.head = null;
    }

    public void add(StorageObject object){
      Node current = this.head;
      boolean containsKey = false;
      while(current != null){
        if(current.value.key == object.key){
          containsKey = true;
          current.value.value = object.value;
        }
        current = current.next;
      }
      if(!containsKey){
        this.head = new Node(object, this.head);
      }
    }
  }
  private static class StorageObject{
    Object key;
    Object value;

    public StorageObject(Object key, Object value){
      this.key = key;
      this.value = value;
    }
  }
  private static class Node{
    StorageObject value;
    Node next;

    public Node(StorageObject value, Node next){
      this.next = next;
      this.value = value;
    }
  }

}
