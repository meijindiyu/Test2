

import java.util.*;


public class Main {

    private static  List<String> str1;
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] numbers = line.split("/");
            int a = Integer.valueOf(numbers[0]);
            int b = Integer.valueOf(numbers[1]);

            while(a != 1 ){
                if(b%(a-1) == 0 ){
                    System.out.print("1/"+b/(a-1)+"+");
                    a=1;
                }else {
                    int q = b / a;
                    int r = b % a;
                    int front = q + 1;
                    System.out.print("1/" + front + "+");
                    a = a - r;
                    b = b * (q + 1);
                    if (b % a == 0) {
                        b = b / a;
                        a = 1;
                    }
                }
            }
            System.out.println("1/"+b);
        }



    }




}





