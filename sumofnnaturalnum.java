public class sumofnnaturalnum {
    public static void main(String[] args) {
        int n=5;
        printsumN(1,n,0);
    }

    public static void printsumN(int i, int n, int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
       sum+=i;
       printsumN(i+1,n,sum);
    }
}
