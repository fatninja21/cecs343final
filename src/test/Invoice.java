package test;

import java.util.ArrayList;

public class Invoice {
	private int invoiceID;
	private String address;
	//public Customer cust;
	//public Salesperson sales;
        private String custName;
        private String salesPersonName;
	private ArrayList<Product> products;
	private Boolean isOpen;
	private Double totalCost;
        private Double currentBalance;
        private Double totalBalance;
        
	
	
	//Load in ID, Salesperson, Customer, ArrayList of Products, cost per product
	public Invoice(int invID, String spName, String cust, ArrayList<Product> products, double cost,double balance, String address) {
		invoiceID = invID;
                custName= cust;
                salesPersonName = spName;
		this.products = products;
		totalCost = cost;
                currentBalance = balance;
		this.address = address;
		isOpen = true;
                totalBalance = balance;
	}
	
	//public void addProduct(Product p) {
	//	products.add(p);
	//}
	//public void removeProduct(Product p) {
	//	products.remove(p);
	//}
	
	public String getCustomer() {
		return custName;
	}
	public String getSalesperson() {
		return salesPersonName;
	}
	public int getInvoiceID() {
		return invoiceID;
	}
	public ArrayList<Product> getProducts(){
		return products;
	}
	public Boolean getStatus() {
		return isOpen;
	}
	public double getCost() {
		return totalCost;
	}
	public void setCost(double c) {
		this.totalCost = c;
	}
        public Double getCurrentBalance(){
            return currentBalance;
        }
	
        public void setCurrentBalance(double payment){
            currentBalance -= payment;
        }
	public void setStatus(Boolean b) {
		this.isOpen = b;
	}
	
	public void editInvoice(Boolean status, Double cost) {
		this.setStatus(status);
		this.setCost(cost);
	}
}
