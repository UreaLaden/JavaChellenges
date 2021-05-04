package javaChallenges.HashtableTest;

import javaChallenges.hashtable.Hashtable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashTableTest {

  @Test
  public void testMakeHashTable(){
    Hashtable table = new Hashtable(25);
    table.add(49,"Dre's number in high school");
    String expected = "{ 49 : Dre's number in high school }";
    String actual = table.toString();
    assertEquals("Should return '{ 49 : Dre's number in high school }'",expected,actual);
  }
  @Test
  public void testHashKeyInRange(){
    Hashtable table = new Hashtable(5);
    int high = Integer.MIN_VALUE;
    int low = Integer.MAX_VALUE;

    high = Math.max(table.add("the sky is blue",false),high);
    low = Math.min(table.add("the sky is blue",false),low);

    high = Math.max(table.add("all dogs go to heaven","most likely"),high);
    low = Math.min(table.add("all dogs go to heaven","most likely"),low);

    high = Math.max(table.add(52,"weeks"),high);
    low = Math.min(table.add(52,"weeks"),low);

    high = Math.max(table.add("another test",1),high);
    low = Math.min(table.add("another test",1),low);

    high = Math.max(table.add("another another test",2),high);
    low = Math.min(table.add("another another test",2),low);

    high = Math.max(table.add("another another another",3),high);
    low = Math.min(table.add("another another another",3),low);

    boolean actual = (high < table.size) && (low >= 0);
    assertTrue("Hash should be within the bounds of the HashTable",actual);
  }
  @Test
  public void testGetValue(){
    Hashtable table = new Hashtable(10);
    table.add(4,"Logan");
    table.add(8,"Anima");
    table.add(21,"Caroline");
    String expected = "Anima";
    String actual = table.get(8).toString();
    assertEquals("Should return 'Anima'",expected,actual);
  }
  @Test
  public void testNullOnMissingValue(){
    Hashtable table = new Hashtable(10);
    table.add(4,"Logan");
    table.add(8,"Anima");
    table.add(21,"Caroline");
    Object expected = null;
    Object actual = table.get("test");
    assertEquals("Should return 'null'",expected,actual);
  }
  @Test
  public void testCollisionHandler(){
    Hashtable table = new Hashtable(10);
    table.add(4,"Logan");
    table.add(8,"Anima");
    table.add(21,"Caroline");
    table.add(21,"Leaundrae");
    Object actual = table.get(21);
    Object expected = "Leaundrae";
    assertEquals("Should return 'Leaundrae'",expected,actual);
  }
  @Test
  public void testGetValueWithCollision(){
    Hashtable table = new Hashtable(10);
    table.add(4,"Logan");
    table.add(8,"Anima");
    table.add(30,"Alex");
    table.add(24,"Albert");
    table.add(21,"Caroline");
    table.add(24,"Helen");
    table.add(21,"Leaundrae");
    Object actual = table.get(24);
    Object expected = "Helen";
    assertEquals("Should return 'Helen'",expected,actual);
  }


}
