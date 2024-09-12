class Main{
    public static String removeDuplicate(String str,int i,String newString){
        if(str.length()==i){
            return newString;
        }
        if(!newString.contains(str.charAt(i)+"")){
            return removeDuplicate(str,i+1,newString+str.charAt(i));
        }
        else{
            return removeDuplicate(str,i+1,newString);
        }
        
    }
    public static void main (String[] args) {
        String str=removeDuplicate("parwezalam",0,"");
        System.out.print(str);
    }
}
