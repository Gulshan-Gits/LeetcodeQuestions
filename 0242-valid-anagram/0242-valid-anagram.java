class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String w = new String(a);
        String q = new String(b);

        if(q.equals(w)){
            return true;
        } else {
            return false;
        }

    }
    
}