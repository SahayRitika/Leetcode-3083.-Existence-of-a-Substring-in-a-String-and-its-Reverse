class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuffer br=new StringBuffer(s);
        br.reverse();
        String st=br.toString();
        int i,j;
        for(i=0;i<s.length()-1;i++){
            String stg=s.substring(i,i+2);
            System.out.println(stg);
            if(st.contains(stg)){ return true;}
        }
        return false;
    }
}
