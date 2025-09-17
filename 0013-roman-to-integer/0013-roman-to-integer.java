class Solution {
    public int romanToInt(String s) {
        int a = 0;
        int prev = 0;

        for (char s1 : s.toCharArray()) {
            int value = 0;

            switch (s1) {
                case 'I': value = 1; break;
                case 'V': value = 5; break; 
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }

            if (prev < value) {
                a = a - 2 * prev + value; 
                // Subtract the smaller one (already added earlier), then add the current
            } else {
                a += value;
            }

            prev = value;
        }

        return a;
    }
}
