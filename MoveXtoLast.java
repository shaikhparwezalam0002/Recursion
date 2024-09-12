class Main{
    public static StringBuilder moveX(String str,int i,int count, StringBuilder sb){
        if(i==str.length()){
            for(int j=1;j<=count;j++){
                sb.append("x");
            }
            return sb;
        }
        if(str.charAt(i)=='x' || str.charAt(i)=='X'){
            count++;
        }
        else{
            sb.append(str.charAt(i));
        }
        return moveX(str,i+1,count,sb);
    }
    public static void main (String[] args) {
        String str="axbcxxd";
        StringBuilder res=moveX(str,0,0,new StringBuilder());
        System.out.print(res);
    }
}
