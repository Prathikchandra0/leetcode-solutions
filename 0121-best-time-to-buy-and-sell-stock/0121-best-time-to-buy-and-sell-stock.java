class Solution {
    public int maxProfit(int[] prices) {
        int  min_price  = Integer.MAX_VALUE;
        int max_profit=0;

        for(int price : prices){
            if(min_price > price){
                min_price = price;
            }
            int Profit = price - min_price;
            if(Profit > max_profit){
                max_profit = Profit;
            }

        }
        return max_profit;
        
    }
}