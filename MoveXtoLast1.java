class Main{
    public static StringBuilder moveX(String str,int i, StringBuilder sb,StringBuilder countX){
        if(i==str.length()){
            sb.append(countX);
            return sb;
        };
        if(str.charAt(i)=='x' || str.charAt(i)=='X'){
            countX.append(str.charAt(i));
        }
        else{
            sb.append(str.charAt(i));
        };
        return moveX(str,i+1,sb,countX);
    };
    public static void main (String[] args) {
        String str="axbcxxd";
        StringBuilder res=moveX(str,0,new StringBuilder(),new StringBuilder());
        System.out.print(res);
    };
};
