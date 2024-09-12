class Main{
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        
        if(n%2==0){
            return pow(x,n/2)*pow(x,n/2);
        }else{
            return pow(x,n/2)* pow(x,n/2)*x;
        }
    }
    public static void main (String[] args) {
        System.out.print(pow(2,5));
    }
}
