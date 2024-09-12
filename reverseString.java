class Main{
    public static void reverse(String str,int i){
        if(i==-1){
            return;
        }
        System.out.print(str.charAt(i));
        reverse(str,i-1);
        
    }
    public static void main (String[] args) {
        reverse("parwez",5);
    }
}
