class Solution {
    public int[][] imageSmoother(int[][] img) {
        int [][] smooth = new int[img.length][img[0].length];
        int sum =0;
        for(int i=0; i<img.length; i++){
            
            for(int j=0; j<img[0].length; j++){
                int count=1;
                sum = img[i][j];
                //Top
                if(i>0){
                    sum=sum+img[i-1][j];
                    count++;
                }
                //Bottom
                if(i<img.length-1){
                    sum=sum+img[i+1][j];
                    count++;
                }
                //Left
                if(j>0){
                    sum=sum+img[i][j-1];
                    count++;
                }
                //Right
                if(j<img[0].length-1){
                    sum=sum+img[i][j+1];
                    count++;
                }
                //Top Right
                if(i>0 && j<img[0].length-1){
                    sum=sum+img[i-1][j+1];
                    count++;
                }
                //Top Left
                if(i>0 && j>0){
                    sum=sum+img[i-1][j-1];
                    count++;
                }
                //Bottom Right
                if(i<img.length-1 && j<img[0].length-1){
                    sum=sum+img[i+1][j+1];
                    count++;
                }
                //Bottom Left
                if(i<img.length-1 && j>0){
                    sum=sum+img[i+1][j-1];
                    count++;
                }

                smooth[i][j] = sum/count;
            }
        }
        return smooth;
    }
}