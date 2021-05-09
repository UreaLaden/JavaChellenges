package javaChallenges.LeftJoinTest;

import javaChallenges.LeftJoin.LeftJoin;
import javaChallenges.doublyLinkedList.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
  @Test
  public void testLeftJoin(){
    HashMap<String,String> a = new HashMap<>();
    a.put("fond","enamored");
    a.put("wrath","anger");
    a.put("diligent","employed");
    a.put("outfit","garb");
    a.put("guide","usher");

    HashMap<String,String> b = new HashMap<>();
    b.put("fond","averse");
    b.put("wrath","delight");
    b.put("diligent","idle");
    b.put("guide","follow");
    b.put("flow","jam");

    LeftJoin target = new LeftJoin(a,b);
    ArrayList<Node> resultList = target.merge();
    ArrayList<Object> expected = new ArrayList<>();
    expected.add("diligent");
    expected.add("employed");
    expected.add("idle");

    ArrayList<Object> actual = new ArrayList<>();
    for(Node value:resultList){
      actual.add(value.toArray());
    }
    System.out.println("resultList = " + actual);
    System.out.println("actual = " + actual.get(0));
    assertEquals("Should return [diligent,employed,idle]",expected,actual.get(0));
  }
}
