class Main{
    public static void toh(int n,String src,String dest,String help){
        if(n==1){
            System.out.println("Move disk"+n +" from "+src+" to "+dest);
            return ;
        }
        toh(n-1,src,help,dest);
        System.out.println("Move disk"+n +" from "+src+" to "+dest);
        toh(n-1,help,dest,src);
    }
    public static void main (String[] args) {
        toh(3,"A","B","c");
    }
}
