class Main{
    public static StringBuilder  reverse(String str,int i,StringBuilder newStr){
        if(i==str.length()-1){
            newStr.append(str.charAt(i)+"");
            return newStr;
        }
        reverse(str,i+1,newStr);
        
        return newStr.append(str.charAt(i)+"");
    }
    public static void main (String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.print(reverse("parwez",0,sb));
    }
}
