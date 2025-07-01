package com.carrental.models;

public class DashboardResponse {

	private long customers;
	private long variants;
	private long companies;
	private long cars;
	private long bookings;
	public long getCustomers() {
		return customers;
	}
	public void setCustomers(long customers) {
		this.customers = customers;
	}
	public long getVariants() {
		return variants;
	}
	public void setVariants(long variants) {
		this.variants = variants;
	}
	public long getCompanies() {
		return companies;
	}
	public void setCompanies(long companies) {
		this.companies = companies;
	}
	
	public long getCars() {
		return cars;
	}
	public void setCars(long cars) {
		this.cars = cars;
	}
	public long getBookings() {
		return bookings;
	}
	public void setBookings(long bookings) {
		this.bookings = bookings;
	}
	
	
}
