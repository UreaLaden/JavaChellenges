package javaChallenges.tree;

import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>>{
  public Node<T> root;
  public ArrayList<Object> arr = new ArrayList<>();

  public void add(T value){
    Node node = new Node(null,null,value);
    if(this.root == null){
      this.root = node ;
      return;
    }
    Node current = this.root;
    while(true){
      if(value.compareTo((T)current.value) < 0)
      {
        if(current.left == null) {
          current.left = node;
          return;
        }
        current = current.left;
      }
      else if(value == current.value) { return; }
      else
      {
         if(current.right == null)
         {  current.right = node;
            return;
         }
          current = current.right;
      }
    }
  }


  public ArrayList<Object> inOrderRecursive(){
    this._inOrderRecursive(this.root);
    return arr;
  }
  public void _inOrderRecursive(Node node){
    if(node == null)return;
    this._inOrderRecursive(node.left);
    this._inOrderRecursive(node.right);
  }

  public Node<T> getRoot() {
    return root;
  }

  @Override
  public String toString() {
    return "BinarySearchTree{" +
      "root=" + root +
      '}';
  }

  public boolean contains(T value){
    if(this.root == null)return false;
    Node current = this.root;
    if(value.compareTo((T)current.value) == 0)return true;
    while(current != null){
      if(value.compareTo((T)current.value) < 0){ current = current.left; }
      else if(value == current.value)return true;
      else{ current = current.right; }
    }
    return false;
  }

  public int findMax(){
    return findMax(root);
  }
  private int findMax(Node node){
    if(node == null)return Integer.MIN_VALUE;

    int left = findMax(node.left);
    int right = findMax(node.right);

    int initialMax = Math.max((int) node.value,left);

    return Math.max(initialMax,right);
  }
}
