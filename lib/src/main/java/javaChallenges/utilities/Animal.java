package javaChallenges.utilities;

public class Animal {
  public String type;
  public int rosterId;

  public Animal(String type,int rosterId){
    this.type = type;
    this.rosterId = rosterId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getRosterId() {
    return rosterId;
  }

  public void setRosterId(int rosterId) {
    this.rosterId = rosterId;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "type='" + type + '\'' +
      ", rosterId=" + rosterId +
      '}';
  }
}
