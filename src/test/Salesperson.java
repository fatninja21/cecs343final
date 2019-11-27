package test;

public class Salesperson extends Person{
	private double commission;
	private int salesID;
        private double totalCommissionEarned;
        private double totalSales;
	
	public Salesperson(String fN, String ln, double com, int slsPersonID) {
		super(fN,ln);
		commission = com;
		salesID = slsPersonID;
	}
	public void setComissionRate(double comm) {
		this.commission = comm;
	}
	public double getComissionRate() {
		return commission;
	}
	public void setSalesID(int id) {
		this.salesID = id;
	}
	public int getSalesID() {
		return salesID;
	}
	public void editSalesPerson(String first, String last, double comm, int ID) {	
		this.setFirstName(first);
		this.setLastName(last);
		this.setComissionRate(comm);
                this.setSalesID(ID);
	}
        
	public void addToTotalSales(double total) {
            totalSales+= total;
	}

        public void addToTotalCommission(double total){
            totalCommissionEarned = total * (commission/100);
        }
        public double getTotalSales(){
            return totalSales;
        }
        
        public double getTotalCommissionEarned(){
            return totalCommissionEarned;
        }

}