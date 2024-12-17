class Solution {
    public int maxProfit(int[] prices) {
        int i,lowestprice=prices[0],profit,maxprofit=0;
        for(i=0;i<prices.length;i++)
        {
            profit=prices[i]-lowestprice;
            if(prices[i]<lowestprice)
            {
                lowestprice=prices[i];
            }
            if(profit>maxprofit)
            {
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}