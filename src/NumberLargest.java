import java.util.Arrays;
import java.util.Scanner;

public class NumberLargest {
    public static String largestNum(int[] nums)
    {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort( str, (s1, s2) -> (s2+s1).compareTo(s1+s2) );
        if(str[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for(String s:str){
            ans.append(s);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println(largestNum(a));

    }
}
