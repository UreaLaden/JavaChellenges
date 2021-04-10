package javaChallenges;

import javaChallenges.stacksandqueues.Queue;
import javaChallenges.utilities.Animal;
import javaChallenges.utilities.AnimalShelter;
import org.junit.Test;

public class AnimalShelterTest {
  @Test
  public void testNewShelter(){
    Queue dogs = new Queue();
    Queue cats = new Queue();
    AnimalShelter shelter = new AnimalShelter(dogs,cats);
    System.out.println(shelter.getRosterNum()); //0
    shelter.enqueue(new Animal("cat", shelter.setRosterNum())); // 1
    System.out.println(shelter.getRosterNum()); // 1
    shelter.enqueue(new Animal("dog", shelter.setRosterNum())); // 2
    System.out.println(shelter.getRosterNum()); //2
    shelter.enqueue(new Animal("cat", shelter.setRosterNum())); // 3
    System.out.println(shelter.getRosterNum()); //3
    shelter.enqueue(new Animal("dog", shelter.setRosterNum())); // 4
    System.out.println(shelter.getRosterNum()); //5
    shelter.enqueue(new Animal("dog", shelter.setRosterNum())); // 5
    System.out.println(shelter.getRosterNum()); //5
    System.out.println(shelter.dequeue("rabbit"));
    System.out.println(shelter.dequeue("pig"));
    System.out.println(shelter.dequeue("pig"));

  }
}
