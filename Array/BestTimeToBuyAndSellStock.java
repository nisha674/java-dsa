public class BestTimeToBuyAndSellStock {

    public static int buyAndSellStock(int []prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit , maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {4 , 5 , 1 , 8 , 9};
        System.out.println(buyAndSellStock(prices));
    }
}
