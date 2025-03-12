class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a=new int[n][n];
      
      int colb=0,cole=a[0].length-1;
      int rowb=0,rowe=a.length-1;
      int t=1;
      while(colb<=cole&&rowb<=rowe){
        for(int i=colb;i<=cole;i++){
            a[rowb][i]=t;
            t++;
        }
        rowb++;
        for(int i=rowb;i<=rowe;i++){
            a[i][cole]=t;
            t++;
            
        }
        cole--;
        if(rowb<=rowe){
            for(int i=cole;i>=colb;i--){
                a[rowe][i]=t;
                t++;
            }
            rowe--;
        }
        if(colb<=cole){
            for(int i=rowe;i>=rowb;i--){
                a[i][colb]=t;
                t++;
            }
            colb++;
        }
      }
      return a;
    }
}