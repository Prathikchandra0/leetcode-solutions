class Solution {
    public int maxVowels(String s, int k) {
        int left  =0;
        int count=0;
        //Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        Set<Character> vowels = Set.of('a','e','i','o','u');


        for(int i =0 ;i<k; i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }

        }
        int mx = count;
        for(int right =k ; right <s.length() ; right++){
            if(vowels.contains(s.charAt(left))){
                count--;
                
            }
            left++;
            if(vowels.contains(s.charAt(right))){
                count++;
            }
            mx =Math.max(mx,count);
        }
        return mx;
        
    }
}