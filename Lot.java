
public class Lot implements Listable {
	private String address;
	private double area;
	private double price;
	
		@Override
	public String toString() {
		return "Lot [address=" + address + ", area=" + area + ", price=" + price + ", getAddress()=" + getAddress()
				+ ", getArea()=" + getArea() + ", toString()=" + super.toString() + "]";
	}
		public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public void toShortRealEstateList() {
		
		
	}
	@Override
	public void getPrice() {
	
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
