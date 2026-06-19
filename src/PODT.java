public class PODT {
    public static void main(String[] args) {
        System.out.println(processStr("%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#",6523));
    }
    public static char processStr(String s, long k) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                ans.append(ch);
            }
            else if(ch=='#'){
                ans.append(ans.toString());
            }
            else if(ch=='%'){
                ans.reverse();
            }
            else{
                if(ans.length()!=0){
                    ans.deleteCharAt(ans.length()-1);
                }
            }
        }
        return (ans.length()<=k) ? '.' : ans.charAt((int)k);
    }
}
