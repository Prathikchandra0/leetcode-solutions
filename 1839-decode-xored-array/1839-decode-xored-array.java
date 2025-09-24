class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] encoded2 = new int[encoded.length+1];
        encoded2[0]=first;
        for(int i=0 ; i< encoded.length ; i++){
            encoded2[i+1]=encoded2[i]^encoded[i];
        }
        return encoded2;
        
    }
}