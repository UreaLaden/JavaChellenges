package javaChallenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    public Node<T> front;
    public Node<T> rear;

    public Queue(){
      this.front = null;
      this.rear = null;
    }

    public void enqueue(T value){
      Node<T> newNode = new Node<>(value);
      if (this.isEmpty()) { // if the queue is empty set the front node
        this.front = newNode;
    }else{ //otherwise set the next rear node to the new node
        this.rear.next = newNode;
      }
      this.rear = newNode; // if the queue isn't empty set a new rear node
    }

    public T dequeue(){
      if(isEmpty()){ //if the queue is empty and we try to execute the method throw and error
        throw new NoSuchElementException();
      }
      T data = this.front.value; //store the current front value
      if(rear == front){ //if theres only 1 Node in the queue reset the rear
          rear = null;
        }
      this.front = this.front.next; //remove the front since front.next is null
      return data;
    }

    public T peek(){
      if(this.isEmpty()){
        throw new NoSuchElementException();
      }else{
        return this.front.value;
      }
  }

  public boolean isEmpty(){
      return this.front == null;
  }

  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front +
      ", rear=" + rear +
      '}';
  }
}
