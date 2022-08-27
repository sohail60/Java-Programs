public class PowerUsingRecursion {
    public static void main(String[] args) {
        int n=2,p=9;
        System.out.println(power(n,p));
    }

    public static int power(int n,int p){
        if (p==1){
            return n;
        }
        return n*power(n,p-1);
    }
}
