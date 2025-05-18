class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int sco;
        char[] charArray = s.toCharArray();
        for(int i=1; i<charArray.length; i++){
            sco = Math.abs(charArray[i] - charArray[i-1]);
            score = score + sco;
        }
        return score;
    }
}