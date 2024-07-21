import java.util.*;

public class ReverseNumber {

    static int reversDigits(int num)
    {
        int rev = 0  ;

        while(num != 0){
            int rem = num % 10 ;
            num /= 10 ;

            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && rem > 7){
                return 0 ;
            }

            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && rem < -8){
                return 0 ;
            }

            rev = rev*10 + rem ;
        }

        return rev ;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        System.out.println("Reverse of no. is "
                + reversDigits(num));
    }
}
