/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormweek11.ormtest;

public class Sales {
	public Sales() {
	}
	
	private int ID;
	
	private String product;
	
	private String date;
	
	private String quantity;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setProduct(String value) {
		this.product = value;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setDate(String value) {
		this.date = value;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setQuantity(String value) {
		this.quantity = value;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
