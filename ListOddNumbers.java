public class ListOddNumbers {
    public static void main(String[] args) {

        int limit = 100;
        System.out.println("Printing odd numbers between "+limit);
        for(int n=1; n<=limit; n++){
            if(n%2!=0){
                System.out.print(n +" ");
            }
        }
    }
}
