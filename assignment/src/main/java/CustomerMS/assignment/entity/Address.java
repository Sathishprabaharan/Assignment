package CustomerMS.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Address {
	@Id
	@GeneratedValue
	int id;
	@Column
	private String addressLine1;
	@Column
	private String addressLine2;
	@Column
	private String Zipcode;
	@OneToOne(mappedBy = "address")
	private Customer cust;


public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public String getZipcode() {
	return Zipcode;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setZipcode(String zipcode) {
	Zipcode = zipcode;
}


}
