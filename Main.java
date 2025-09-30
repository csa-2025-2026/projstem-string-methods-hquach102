public class Main
{
  public static void main(String[] args)
  {
    stringManip("cream", "butter");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN; 

    firstN = s2.substring(0, n);
    lastN = s1.substring(s1.length() - n);

    output = lastN + firstN;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String output;
    String wrd1; 
    String wrd2;
    String wrd21;
    String wrd22;
    
     wrd1 = s1.toUpperCase();
    wrd21 = s2.substring(0,1);
  
    

    
  
    wrd2 = s2.toUpperCase() + s2.toLowerCase();
    System.out.println(wrd1);
    
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
