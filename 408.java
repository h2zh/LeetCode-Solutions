class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int a = 0, b = 0;
        while (a<word.length() && b<abbr.length()){
            if (Character.isDigit(abbr.charAt(b))){
                if (abbr.charAt(b) == '0') return false;

                int total = 0;
                while (b<abbr.length() && Character.isDigit(abbr.charAt(b))){
                    total = total * 10 + abbr.charAt(b) - '0'; // convert char to int
                    System.out.println(total);
                    b++;
                }
                a += total;
            } else{ // pointers at both positions refer to character
                if (word.charAt(a) != abbr.charAt(b)) {
                    return false;
                }
                a++;
                b++;
            }
        }
        return a == word.length() && b == abbr.length();
    }
}



