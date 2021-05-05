package javaChallenges.TreeIntersection;

import javaChallenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {
  BinaryTree binaryTreeA;
  BinaryTree binaryTreeB;

  public TreeIntersection(BinaryTree binaryTreeA, BinaryTree binaryTreeB){
    this.binaryTreeA = binaryTreeA;
    this.binaryTreeB = binaryTreeB;
  }
  public HashSet<Object> tree_intersection(){
    HashSet<Object> set = new HashSet<>();
    ArrayList aList = binaryTreeA.preOrderRecursive();
    ArrayList bList = binaryTreeB.preOrderRecursive();
    for(Object item : bList){
      if(aList.contains(item)){
        set.add(item);
      }
    }
    return set;
  }

}
