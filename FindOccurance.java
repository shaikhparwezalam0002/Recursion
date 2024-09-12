class Main{
    public static void occurance(String str,int fst,int lst,int itr){
        if(itr==-1){
            System.out.println("First occurance "+fst);
            System.out.println("Last occurance "+lst);
            return ;
        }
        
        if(lst==-1 && str.charAt(itr)=='a'){
            lst=itr;
        }
        if(str.charAt(itr)=='a'){
            fst=itr;
        }
        occurance(str,fst,lst,itr-1);
    }
    public static void main (String[] args) {
        String str="ParwezAlam";
        occurance(str,-1,-1,str.length()-1);
    }
}
