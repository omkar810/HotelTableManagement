package com.hotel;

public class HotelApp {

	public static void main(String[] args) {
		HotelManagement hm=new HotelManagement();
		for(;;) {
			System.out.println("1.Book_table 2.Leave_table 3.See_tables 4.See_Waiting 5.Exit");
			switch(hm.sc.nextInt()) {
			case 1:{
				hm.bookTable();
				break;
			}
			case 2:{
				hm.leaveTable();
				hm.allotTable();
				break;
			}
			case 3:{
				hm.availableTable();
				break;
			}
			case 4:{
				hm.seeWaitingList();
				break;
			}
			default:{
				System.out.println("Application is closed..");
				return;
			}
			}
		}

	}

}
