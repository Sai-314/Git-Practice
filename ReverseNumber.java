import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int no, r,a, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number want to reverse : ");
        no = sc.nextInt();
        a=no;
        while (no>0){
            r=no%10;
            rev =(rev*10)+r;
            no=no/10;
        }
        System.out.println(rev);
    }
}
