package javaChallenges.utilities;
import javaChallenges.stacksandqueues.Queue;

import java.util.Locale;
import java.util.NoSuchElementException;

public class AnimalShelter {
  Queue<Animal> dogs;
  Queue<Animal> cats;
  int rosterNum = 0;

  public AnimalShelter(Queue dogs,Queue cats){
    this.dogs = dogs;
    this.cats = cats;
  }
  public void enqueue(Animal animal){
    if(animal.type == "dog"){

      animal.rosterId = rosterNum;
      Animal newDog = new Animal("dog",rosterNum);
      dogs.enqueue(newDog);
    }
    else if(animal.type == "cat"){
      Animal newCat = new Animal("cat",rosterNum);
      cats.enqueue(newCat);
    }else{
       throw new NoSuchElementException();
    }
  }
  public Animal dequeue(String animal){
    if(animal.toLowerCase(Locale.ROOT).equals("dog")){

      return dogs.dequeue();
    }
    else if(animal.toLowerCase(Locale.ROOT).equals("cat")){
      return cats.dequeue();
    }
    else{
      //Get lowest rosterId and return;
      String target = findSmallestId().type;
      return target.equals("cat") ? cats.dequeue() : dogs.dequeue();
    }
  }
  public Animal findSmallestId()
  {
    return dogs.peek().rosterId > cats.peek().rosterId ? cats.peek() : dogs.peek();
  }


  public Queue getDogs() {

    return dogs;
  }


  public Queue getCats() {
    return cats;
  }

  public int getRosterNum() {
    return rosterNum;
  }
  public int setRosterNum(){
    rosterNum++;
    return rosterNum;
  }

}
