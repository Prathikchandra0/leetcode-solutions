class Solution {
    public int largestVariance(String s) {
        int ans = 0;

        for (char x = 'a'; x <= 'z'; x++) {
            for (char y = 'a'; y <= 'z'; y++) {
                if (x == y) continue;

                // forward pass
                ans = Math.max(ans, solve(s, x, y));

                // reverse pass
                String rev = new StringBuilder(s).reverse().toString();
                ans = Math.max(ans, solve(rev, x, y));
            }
        }
        return ans;
    }

    private int solve(String s, char x, char y) {
        int curr = 0;
        boolean hasy = false;
        int best = 0;

        for (char c : s.toCharArray()) {

            if (c == x) curr++;
            if (c == y) {
                curr--;
                hasy = true;
            }

            // moved INSIDE loop
            if (hasy) {
                best = Math.max(best, curr);
            }

            // moved INSIDE loop
            if (curr < 0) {
                curr = 0;
                hasy = false;
            }
        }
        return best;
    }
}
