
class Solution{
    String modify(String s){
        StringBuilder sb = new StringBuilder("");
        boolean lowercase=false;
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            lowercase= true;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if( (ch>='a' && ch<='z')  && (lowercase==false))
            {
                ch= (char)(ch-32);
            }
            else if( (ch>='A' && ch<='Z') && (lowercase==true))
            {
                ch= (char)(ch+32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
