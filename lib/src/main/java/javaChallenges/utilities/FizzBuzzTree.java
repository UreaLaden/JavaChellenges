package javaChallenges.utilities;

import java.util.ArrayList;

public class FizzBuzzTree {
  Node root;
  ArrayList<Object> list = new ArrayList<>();


  public FizzBuzzTree(){
    this.root = null;
  }

  public FizzBuzzTree fbTransform(FizzBuzzTree tree, Node node){
    if(node != null){

      boolean isDivisibleByBoth = (int)node.value % 15 == 0 || (int)node.value == 1;
      boolean isDivisibleByThree = (int)node.value % 3 == 0;
      boolean isDivisibleByFive = (int)node.value % 5 == 0;

      node.value =  (isDivisibleByBoth) ? "FizzBuzz" :
        ((isDivisibleByFive) ? "Buzz" :
          (isDivisibleByThree) ? "Fizz" : ""+node.value);

      list.add(node.value);
      for(Node child : node.children){
        fbTransform(tree,child);
      }
    }
    return tree;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public Node getRoot() {
    return root;
  }

  @Override
  public String toString() {
    return "FizzBuzzTree{" +
      "root=" + root +
      '}';
  }

  public ArrayList<Object> getList() {
    return list;
  }
}
