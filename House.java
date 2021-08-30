
public class House implements Listable{
private String id;
private double size;
private double price;
public House(String id, double size, double price) {
	super();
	this.id = id;
	this.size = size;
	this.price = price;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public double getPrice1() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "House [id=" + id + ", size=" + size + ", price=" + price + ", getId()=" + getId() + ", getSize()="
			+ getSize() + ", getPrice()=" + getPrice1() + ", toString()=" + super.toString() + "]";
}
@Override
public void toShortRealEstateList() {
	// TODO Auto-generated method stub
	
}
@Override
public void getPrice() {
	// TODO Auto-generated method stub
	
}


	
}
