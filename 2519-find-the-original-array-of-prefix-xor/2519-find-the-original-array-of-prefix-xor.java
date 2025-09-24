class Solution {
    public int[] findArray(int[] pref) {
        int[] pref2 = new int[pref.length];
        pref2[0]=pref[0];
        for(int i=1; i<pref.length;i++){
            pref2[i]=pref[i]^pref[i-1];

        }
        return pref2;
        
    }
}