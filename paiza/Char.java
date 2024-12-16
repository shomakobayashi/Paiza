public class Char {
  public static void main(String[] args) {
    
        // String str = "Hello";
    // char[] charArray = str.toCharArray();
    // ['H', 'e', 'l', 'l', 'o']
    String str = "Hello";
    char[] charArray= str.toCharArray();
    System.out.println(charArray);
    for(char c : str.toCharArray() ){
      System.out.println(c);
    }

  }
}
