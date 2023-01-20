package HackerRank;

import java.util.Scanner;

public class questionIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int N = scan.nextInt();
        if (N % 2 != 0) {
            System.out.println("odd weird condtion 1");
        }
          else  if (N >= 2 && N <= 5) {
                System.out.println(" between 2 to 5 :   = not Weird");
            }
            else if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            else
        {
            System.out.println("not weird");
            }

//       else if (N % 2 == 0){
//                System.out.println("equal to zero : not weird");
//            }


//            else {
//                System.out.println("last else Not Weird");
//            }
        }
    }
