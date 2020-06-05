package commandPattern;
/**
 * 
 * @author 2016112105 박선희
 *
 */
public class BuyStockOrder implements Order{
	private StockTrade stock;
	public BuyStockOrder(StockTrade stock) {
		// TODO Auto-generated constructor stub
		this.stock=stock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();
	}

}
