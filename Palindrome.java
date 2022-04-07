public class Palindrome {
    public static void main(String[] args) {
        int r,n,temp,sum=0;
        n=1441;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Entered number is Palindrome");
        }
        else{
            System.out.println("Entered number is not a Palindrome");
        }
    }
}
