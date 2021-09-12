package model;

import java.io.Serializable;

public class Bilboard  implements Serializable{

	private double width;
	private double height;
	private boolean inUse;
	private String brand;
	private double area;
	
	/**
	 * @param width
	 * @param height
	 * @param inUse
	 * @param brand
	 */
	public Bilboard(double width, double height, boolean inUse, String brand) {
		super();
		this.width = width;
		this.height = height;
		this.inUse = inUse;
		this.brand = brand;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isInUse() {
		return inUse;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Bilboard [width=" + width + ", height=" + height + ", inUse=" + inUse + ", brand=" + brand + "]  \n";
	}	
	public String toString1() {
		return "" + width + " | " + height + " | " + inUse + " | " + brand + "\n";
	}
	public String toString2() {
		return "Billboard  <" + brand + ">  with area  <" + area + "> " +   "\n";
	}
	
}
