class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums12 = Arrays.copyOf(nums1,m);
        int [] nums23 = Arrays.copyOf(nums2,n);
        int [] mix = new int[m+n];
        
        for(int i = 0 ; i <nums12.length; i++){
            mix[i]=nums12[i];
        }
        for(int i=0 ; i<nums23.length ; i++){
            mix[nums12.length+i]=nums23[i];
        }
        for(int i = 0; i<mix.length-1 ; i++){
            for(int j =0 ;j<mix.length-i-1;j++){
                if(mix[j]>mix[j+1]){
                    int temp =mix[j];
                    mix[j]=mix[j+1];
                    mix[j+1]=temp;
                }
            }
        }
        for(int i=0 ; i<mix.length ; i++){
            nums1[i]=mix[i];
        }
        
    }
}