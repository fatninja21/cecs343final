package test;


public class Product {
	
	private String productName;
	private int quantity;
	private double productCost;
	private double salePrice;
	private int quantitySold;
	//total of sales made
	private double totalSales;
	//total of costs made 
	private double totalCost;
	//total of sales & cost
	private double totalProfit;
	//perentage of profit value
	private double totalProfitPercent;
	
	//Constructor
	public Product(String productName, int quantity, double productCost, double salePrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.productCost = productCost;
		this.salePrice = salePrice;
		this.totalCost = (quantity * productCost);
		this.quantitySold = 0;
		this.totalSales = 0.0;
		this.totalProfit = 0;
		this.totalProfitPercent = 0;
	}
	
	public String getName() {
		return productName;
	}
        public void setName(String name){
            this.productName =name;
        }
	public int getQuantity() {
		return quantity;
	}
        public void setQuantity(int qty){
            this.quantity= qty;
        }
	public double getCost() {
		return productCost;
	}
        public void setCost(double cost){
            this.productCost = cost;
        }
	public double getSalePrice() {
		return salePrice;
	}
        public void setSalePrice(double Saleprice){
            this.salePrice= Saleprice;
        }
	public int getQtySold(){
		return quantitySold;
	}
	public double getTotalSales(){
		return totalSales;
	}
	public double getTotalCost(){
		return totalCost;
	}
	public double getTotalProfit(){
		return totalProfit;
	}
	public double getTotalProfitPercent(){
		return totalProfitPercent;
	}
	public void  editProduct(String name, int qty, double prodCost,double salePrice) {	
		this.setName(name);
                this.setQuantity(qty);
                this.setCost(prodCost);
                this.setSalePrice(salePrice);      
        }	
	

	
	// Methods //
	
	
	//load how much of product to purchase
	public void sellProduct(int qty) {
		//Set new amount sold and current stock
		quantitySold += qty;
		quantity -= qty;
		
		//Add to total sales
		totalSales += (qty * salePrice);
		
		//Set Total Profit
		//totalProfit = (totalSales - totalCost);
		
		//Set Profit Percent
		//if (totalSales != 0.0){
	//		this.totalProfitPercent = (totalProfit / totalSales * 100 );
	//	}
		
	}
	
	
	//Use for restocking Product
	public void restock(int restockValue){
		//Restock
		quantity += restockValue;
		
		//Add to total Costs
		totalCost += (restockValue * productCost);
		
		//Set Total Profit
		totalProfit = (totalSales - totalCost);
		
		//Set Profit Percent
		if (totalSales != 0.0){
			this.totalProfitPercent = (totalProfit / totalSales * 100 );
		}
	}
}