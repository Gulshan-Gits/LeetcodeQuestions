class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String tar = Character.toString(x);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++){
            if(words[i].contains(tar)){
                answer.add(i);
            }
        }
        return answer;
    }
}