import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    int Maxrows;
    int Maxcols;
    int Threshold;
    int sum;
    int[][] array;
    ArrayList<ArrayList<Integer>> bigList;

    public static void main(String[] args) {
        //System.out.print(new Solution().match("a".toCharArray(),".*".toCharArray()));
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            int number = Integer.valueOf(sc.nextLine());
            String[] temp = sc.nextLine().split(" ");
            int[] array =new int[temp.length];
            for(int i = 0 ; i <array.length;i++){
                array[i] = Integer.valueOf(temp[i]);
            }
            Arrays.sort(array);
            int sum = 0 ;
            int tem = 0 ;
            for(int j = 0 ; j <array.length;j++){

                sum = sum+ tem*array[j];
                tem = tem + array[j];

            }
            System.out.println(sum);
        }

    }

}
