class Solution {
    public int maxDistance(int[] colors) {
        int fc = colors[0];
        int n =colors.length;
        int diff =0 ;

        for (int i = 1 ; i< colors.length ; i++){
            
            if (colors[i] != fc ){
                diff = Math.max(diff , i);

            }
            if(colors[i] != colors[n-1]){
                diff =Math.max(diff,n-1-i);
            }

        
        }
        return diff;
    }
}