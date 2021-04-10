package javaChallenges.utilities;

public class MultiBracketValidation {

  public static boolean multiBracketValidation(String input){
    int braceMatch = 0;
    int bracketMatch = 0;
    int parenMatch = 0;

    for(String a: input.split("")){
      switch(a){
        case "{":
          braceMatch += braceMatch == 0 ? 1 : 0;
          break;
        case "}":
          braceMatch += braceMatch == 1 ? 1 : 0;
          braceMatch = braceMatch % 2 == 0 ? 0 : braceMatch;
          break;
        case "(":
          parenMatch += parenMatch == 0 ? 1 : 0;
          break;
        case ")":
          parenMatch += parenMatch == 1 ? 1 : 0;
          parenMatch = parenMatch % 2 == 0 ? 0 : parenMatch;
          break;
        case "[":
          bracketMatch += bracketMatch == 0 ? 1 : 0;
          break;
        case "]":
          bracketMatch += bracketMatch == 1 ? 1 : 0;
          bracketMatch = bracketMatch % 2 == 0 ? 0 : bracketMatch;
          break;
      }
    }
      return !((braceMatch + bracketMatch + parenMatch) > 0);
  }


}
