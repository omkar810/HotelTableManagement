package com.hotel;

public class Customer extends Table{
   boolean cust1;
   boolean cust2;
   Customer(boolean table, boolean cust1,boolean cust2) {
	super(table);
	this.cust1 = cust1;
	this.cust2 = cust2;
}
}
