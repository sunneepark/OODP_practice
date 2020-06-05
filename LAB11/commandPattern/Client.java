package commandPattern;

public class Client {
	public static void main(String[] args) {
		StockTrade stock = new StockTrade();
		BuyStockOrder buyStockOrder = new BuyStockOrder(stock);
		SellStockOrder sellStockOrder = new SellStockOrder();
		Agent agent = new Agent();

		agent.placeOrder(buyStockOrder); // Buy Shares
		agent.placeOrder(sellStockOrder); // Sell Shares
	}

}
