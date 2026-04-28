class LastLength {
    public static void main(String[] args) {
        String s="Hello World";
        int end = s.length()-1;
        System.out.println(lengthOfLastWord(s,end,0));
    }
    static  int lengthOfLastWord(String s, int index, int count) {
       
        if(index >= 0 && s.charAt(index)==' '){
            return count;
        }

        if (index >= 0 && s.charAt(index) != ' '){
            return lengthOfLastWord(s, index -1, count+1);
        }
        return count;
    }
}