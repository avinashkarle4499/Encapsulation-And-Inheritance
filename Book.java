package EncapsulationAndInheritanace;

[20:38, 09/02/2021] Avinash Karle: class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return 21234;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return "Business of 21st Century";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return "Robert T Kiyosaki";
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return 560;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book
{
	private String category;
	
}
class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Book b=new Book();
 b.getBookNo();
 b.getTitle();
 b.getPrice();
 b.getAuthor();
 
 
 System.out.println("Book no is "+b.getBookNo());
 System.out.println("Tiltle is "+b.getTitle());
 System.out.println("Author is "+  b.getAuthor());
 System.out.println("Price is "+b.getPrice());
 
	}
 
	}
[20:38, 09/02/2021] Avinash Karle: 2nd
[20:38, 09/02/2021] Avinash Karle: package oopsAssignment;

public class Address {
	private String addressLine;
	private String city;

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	void getAddressDetails()
	{
		System.out.println("Address Details are:"+ addressLine+city);

	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


























	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}