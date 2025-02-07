import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if (a < 0 || a > 50 || b < 0 || b > 50 || n < 1 || n > 15) {
                    System.out.println("Invalid input");
                    return; // Exit if input is invalid
                }

                int sum = a;
                for (int j = 0; j < n; j++) {
                    sum += (1 << j) * b; // 1 << i is equivalent to 2^i
                    System.out.print(sum + " ");
                }
                System.out.println();

            }
        }
    }

