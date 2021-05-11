package javaChallenges.Graph;

import javaChallenges.graph.Graph;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class GraphTest {

  @Test
  public void testSingleVertex(){
    Graph graph = new Graph();
    graph.AddVertex("Leaundrae");
    graph.AddEdge("Leaundrae",null,3);
    Object expected = "Leaundrae";
    Object actual = graph.getVertexes().get(graph.Size()-1);
    assertEquals("Should return Leaundrae",expected,actual);
  }

  @Test
  public void testEmptyGraph(){
    Graph graph = new Graph();
    Object expected = new ArrayList<>();
    Object actual = graph.GetNodes();
    assertEquals("Should return []",expected,actual);
  }

  @Test
  public void testAddVertex(){
    Graph graph = new Graph();
    graph.AddVertex("Leaundrae");
    graph.AddVertex("Anima");
    graph.AddVertex("Logan");

    int expected = 3;
    int actual = graph.getVertexes().size();
    assertEquals("Should contain 3 vertexes",expected,actual);
  }

  @Test
  public void testAddEdge(){
    Graph graph = new Graph();
    graph.AddVertex("Tim");
    graph.AddVertex("Tom");
    graph.AddVertex("Brian");

    graph.AddEdge("Tim","Tom",3);
    graph.AddEdge("Tom","Tim",3);

    graph.AddEdge("Tim","Brian",3);
    graph.AddEdge("Brian","Tim",3);

    graph.AddEdge("Tom","Brian",3);
    graph.AddEdge("Brian","Tom",3);

    ArrayList<Object> brianExpectedFriends = new ArrayList<>();
    brianExpectedFriends.add(3);
    brianExpectedFriends.add(3);
    brianExpectedFriends.add(0);

    ArrayList<Object> brianActualFriends = graph.getAdjacencyMatrix().get(2);
    assertEquals("Brian should not be friends with himself -> {3,3,0}", brianExpectedFriends,
      brianActualFriends);
  }

  @Test
  public void testGetNeighbors(){
    Graph graph = new Graph();

    graph.AddVertex("Barry");
    graph.AddVertex("Darryl");
    graph.AddVertex("Wadney");
    graph.AddVertex("Leslie");

    graph.AddEdge("Barry","Darryl",3);
    graph.AddEdge("Darryl","Barry",3);

    graph.AddEdge("Wadney","Leslie",3);
    graph.AddEdge("Leslie","Wadney",3);

    graph.AddEdge("Leslie","Barry",3);
    graph.AddEdge("Barry","Leslie",3);

    ArrayList<Object> neighbors = new ArrayList<>();
    neighbors.add("Barry -> 3");
    neighbors.add("Wadney -> 3");
    ArrayList<Object>actual = graph.GetNeighbors("Leslie");
    ArrayList<Object> expected = neighbors;
    assertEquals("Leslies neighbors are [Barry,Wadney]",expected,actual);

    int expectedSize = 4;
    int actualSize = graph.Size();
    assertEquals("Size should be 4",expectedSize,actualSize);
  }

  @Test
  public void testTraverse(){
    Graph graph = new Graph();
    graph.AddVertex("Pandora");
    graph.AddVertex("Arendelle");
    graph.AddVertex("Metroville");
    graph.AddVertex("Monstropolis");
    graph.AddVertex("Naboo");
    graph.AddVertex("Narnia");

    graph.AddEdge("Pandora","Arendelle",3);
    graph.AddEdge("Arendelle","Pandora",3);

    graph.AddEdge("Arendelle","Metroville",3);
    graph.AddEdge("Metroville","Arendelle",3);

    graph.AddEdge("Arendelle","Monstropolis",3);
    graph.AddEdge("Monstropolis","Arendelle",3);

    graph.AddEdge("Metroville","Monstropolis",3);
    graph.AddEdge("Monstropolis","Metroville",3);

    graph.AddEdge("Metroville","Narnia",3);
    graph.AddEdge("Narnia","Metroville",3);

    graph.AddEdge("Monstropolis","Naboo",3);
    graph.AddEdge("Naboo","Monstropolis",3);

    graph.AddEdge("Naboo","Narnia",3);
    graph.AddEdge("Narnia","Naboo",3);

    ArrayList<Object> expected = new ArrayList<>(asList("Pandora","Arendelle","Metroville",
      "Monstropolis","Narnia","Naboo"));
    ArrayList<Object> actual = graph.Traverse("Pandora");
    assertEquals("Should traverse the graph from Pandora to Naboo - [Pandora, Arendelle, " +
      "Metroville, Monstropolis, Narnia, Naboo]",expected,actual);
  }
}
