import java.util.Scanner;
class BoxPatternB {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = in.nextInt();

        for (int row = 1; row <= size; row++) {  
            for (int col = 1; col <= size; col++) {  
               if (row == 1 || row == size || row == col) 
                  System.out.print("#" + " ");
               else
                   System.out.print("  "); 
            }
           
            System.out.println();
         }
          
        in.close();
    }
}

        


