/*
You have written an anonymous love letter and you don’t want your handwriting to be recognized. 
Since you don’t have a printer within reach, you are trying to write this letter by copying and pasting characters from a newspaper.
Given a string L representing the letter and a string N representing the newspaper, 
return true if the L can be written entirely from N and false otherwise. 
The letter includes only ascii characters.
*/

/* PSEUDO CODE

function isLoveLetterReproducible(L, M):
   charMap = []
   charCount = 0

   for i from 0 to L.length:
      charCode = int(L.charAt(i)) 
      if (charMap[charCode] == 0):
         charCount++
      charMap[charCode]++

   for i from 0 to N.length:
      charCode = int(N.charAt(i))
      if (charMap[charCode] > 0):
         charMap[charCode]--
         if (charMap[charCode] == 0):
            charCount--
      if (charCount == 0):
         return true

   return false
*/

class Main {
  static public void main( String args[] ) {
    String L = args[1];
    String N = args[2];
    System.out.println(canBeFormed(L, N));
  }
  private static boolean canBeFormed(String letter, String Newspaper) {
    NesPaper N = new NewsPaper(Nespaper);
    return N.canBeFormedFromNewsPaper(letter);
    
  }
  
  class NewsPaper {
    private HashMap<String, Integer> map;
    public NewsPaper(String N){
        this.map = = new HashMap<String, Integer>();
        initializeMap(N);
    }
    
    private void initialize(String N) {
      String[] words = N.split(" ");
      for(int i = 0; i<words.length; i++) {
        if(map.containsKey(words[i]))
          map.put(words[i], map.get(words[i]) + 1);
        else
          map.put(words[i], 1);
      }
      
      private boolean canBeFormedFromNewsPaper(String letter) {
        String[] words = letter.split(" ");
        HashMap<String, Integer> lmap = new HashMap<String, Integer>();
        for(int i = 0; i<letter.length; i++) {
          if(!map.containsKey(words[i]))
            return false;
          
          if(lmap.containsKey(words[i]))
            if(map.get(words[i]) < lmap.get(words[i])+1);
              return false;
            else
              lmap.put(words[i], lmap.get(words[i]+1);
          else
             lmap.put(words[i], 1);                       
        }
        return true;
      }
                       
    }    
  }
}