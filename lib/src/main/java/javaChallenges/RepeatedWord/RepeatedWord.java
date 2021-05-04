package javaChallenges.RepeatedWord;

import java.util.HashMap;
import java.util.Locale;

public class RepeatedWord {
  public static String getRepeatedWord(String input){
    if(input.equals(""))return null;
    Character[] specialChars = {'!',',','?','-','.',')','(','}','{'};
    HashMap<String,Integer> words = new HashMap<>();
    String word = "";
    for(int i=0;i<input.length();i++){
      char currentChar = input.toLowerCase(Locale.ROOT).charAt(i);
      boolean addChar = true;
      int tempIdx = 0;
      while(tempIdx < specialChars.length)
      {
        if(currentChar == specialChars[tempIdx] || Character.isWhitespace(currentChar)){
          addChar = false;
          break;
        }
        tempIdx++;
      }
      if(addChar){ word += currentChar; }
      else
      {
        if(words.get(word) != null && word.length() > 0){
          return word;
        }
        words.put(word,1);
        word = "";
      }
    }
    return null;
  }
}
