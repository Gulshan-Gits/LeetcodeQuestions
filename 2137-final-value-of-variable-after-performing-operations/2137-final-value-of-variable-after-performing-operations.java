class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(int i=0; i<operations.length; i++){
           switch (operations[i]){
            case "--X":--num;
            break;
            case "++X":++num;
            break;
            case "X--":num--;
            break;
            case "X++":num++;
            break;
            default : num = 0;
           }
        }
        return num;
    }
}