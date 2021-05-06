package javaChallenges.LeftJoin;


import javaChallenges.doublyLinkedList.Node;
import javaChallenges.linkedList.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {
  HashMap a;
  HashMap b;

  public LeftJoin(HashMap a, HashMap b){
    this.a = a;
    this.b = b;
  }

  public ArrayList<Node> merge(){
    ArrayList<Node> result = new ArrayList<>();
    for(Object item : a.keySet()){
      LinkedList group = new LinkedList();
      group.insert(item);
      group.append(a.get(item));
      if(b.containsKey(item)){
        group.append(b.get(item));
      }else{
        group.append("NULL");
      }
      result.add(group.head);
    }
    return result;
  }
}
