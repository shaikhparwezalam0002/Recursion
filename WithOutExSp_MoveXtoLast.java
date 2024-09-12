class Main{
    public static StringBuilder moveX(String str,int i, StringBuilder sb){
        if(i==str.length()){
            return sb;
        };
        
        if(str.charAt(i)!='x'){
            sb.append(str.charAt(i));
        };
        moveX(str,i+1,sb);
        if(str.charAt(i)=='x'){
            sb.append(str.charAt(i));
        }
        return sb;
    };
    public static void main (String[] args) {
        String str="axbcxxd";
        StringBuilder res=moveX(str,0,new StringBuilder());
        System.out.print(res);
    };
};
