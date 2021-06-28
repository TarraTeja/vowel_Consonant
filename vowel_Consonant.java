//3.Program to check vowel or consonant using switch case//

import java.util.Scanner;
class vowel_Consonant
{
 public static void main(String args[])
  {
    String ch;
    Scanner sc = new Scanner(System.in);
    ch = sc.next();
    switch(ch)
     {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
      System.out.println("vowel");
      break;
      default:
       System.out.println("consonant");
       break;
      }
    }
  }
      
