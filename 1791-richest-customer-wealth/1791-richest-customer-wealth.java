class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i=0; i<accounts.length; i++){
            int amount=0;
            for(int j=0; j<accounts[0].length; j++){
                amount = amount + accounts[i][j];
                if (amount>max){
                    max = amount;
                }
            }
        }
        return max;
    }
}