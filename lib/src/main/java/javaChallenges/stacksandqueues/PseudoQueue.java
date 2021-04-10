package javaChallenges.stacksandqueues;

public class PseudoQueue <T> implements standardQueue {
  Stack<T> main;
  Stack<T> temp;
  T value;

  public PseudoQueue(Stack<T> main,Stack<T> temp){
    this.main = new Stack<>();
    this.temp = new Stack<>();
  }

  @Override
  public void enqueue(Object value) {
    main.push((T) value);
  }

  @Override
  public void dequeue() {
    reverse(main,temp);
    temp.pop();
    reverse(temp,main);
  }

  public void reverse(Stack<T> currentStack, Stack<T> targetStack){
    while(!currentStack.isEmpty()){
      targetStack.push(currentStack.pop());
    }
  }

  public Stack<T> getMain() {
    return main;
  }
}
