public class ForLoopDemo1
{
   public static void main(String[] args)
   {
      // **************************************************
      System.out.println("Example 1");
     
      for (int i = 1; i <= 5; i++)
      {
         System.out.println(i);
      }

      // **************************************************
      System.out.println("\n\nExample 2");
     
      for (int i = 1; i <= 5; i++)
      {
         System.out.print(i);
      }
     
      // **************************************************
      System.out.println("\n\nExample 3");
     
      for (int i = 1; i <= 5; i++)
      {
         System.out.print(i + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 4");
     
      for (int i = 0; i < 5; i++)
      {
         System.out.print(i + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 5");
     
      for (int i = 0; i <= 5; i = i + 2)
      {
         System.out.print(i + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 6");
     
      for (int i = 10; i >= 1; i--)
      {
         System.out.print(i + " ");
      }

      // **************************************************
      System.out.println("\n\nExample 7");
     
      for (int i = 1; i < 1000000; i *= 2)
      {
         System.out.print(i + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 8");
     
      int base = 1;
     
      for (int i = 0; i < 12; i++)
      {
         base *= 2;
         System.out.print(base + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 9");
     
      for (int i = 100; i > 0; i /= 2)
      {
         System.out.print(i + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 10");
     
      int sum = 0;
     
      for (int i = 1; i <= 10; i++)
      {
         sum += i;
         System.out.print(sum + " ");
      }
     
      // **************************************************
      System.out.println("\n\nExample 11");
     
      sum = 0;
      int i = 1;
     
      while (i <= 10)
      {
         sum += i;
         System.out.print(sum + " ");
         i++;
      }
     
   } // end of main
  
} // end of class

