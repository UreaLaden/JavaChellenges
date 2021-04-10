package javaChallenges.tree;

import javaChallenges.stacksandqueues.Queue;
import javaChallenges.stacksandqueues.Stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BinaryTree<T>{
  public Node<T> root = null;
  public ArrayList<Object> arr;

  public BinaryTree(){
    this.arr = new ArrayList<>();
  }


  public ArrayList<Object> preOrder(){
    ArrayList<Object> result = new ArrayList<>();
    if(this.root == null) throw new NoSuchElementException();
    Stack<Node> arr = new Stack();
    arr.push(this.root);
    while(!arr.isEmpty()){
      Node node = arr.pop();
      result.add(node.value);
      if(node.right != null){
       arr.push(node.right);
      }
      if(node.left != null){
        arr.push(node.left);

      }
    }
    return result;
  }
  public ArrayList<Object> preOrderRecursive(){
    this._preOrderRecursive(this.root);
    return arr;
  }
  public void _preOrderRecursive(Node node){
    if(node == null) return;
    this.arr.add(node.value);
    this._preOrderRecursive(node.left);
    this._preOrderRecursive(node.right);
  }


  public ArrayList<Object> inOrder(){
    ArrayList<Object> result = new ArrayList<>();
    if(this.root == null) throw new NoSuchElementException();
    Queue<Node> arr = new Queue();
    arr.enqueue(this.root);
    while(!arr.isEmpty()){
      Node node = arr.dequeue();
      result.add(node);
      if(node.left != null){
        arr.enqueue(node.left);
      }

      if(node.right != null){
        arr.enqueue(node.right);
      }

    }
    return result;
  }

  public ArrayList<Object> inOrderRecursive(){
    this._inOrderRecursive(this.root);
    return arr;
  }
  public void _inOrderRecursive(Node node){
    if(node == null)return;
    arr.add(node.value);
    this._inOrderRecursive(node.left);
    this._inOrderRecursive(node.right);
  }

  public ArrayList<Object> postOrder(){
    this._postOrder(this.root);
    return arr;
  }
  private void _postOrder(Node node){
    if(node == null)return;
    this._postOrder(node.left);
    this._postOrder(node.right);
    arr.add(node.value);
  }

  @Override
  public String toString() {
    return "BinaryTree{" +
      "root=" + root +
      '}';
  }

  public void setArrVal(Object obj) {
    this.arr.add(obj);
  }

  public ArrayList<Object> getArr() {
    return arr;
  }
}
