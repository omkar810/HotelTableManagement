package com.hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotelManagement {
	Table[] t = new Table[5];
	List<Waiting> wt = new LinkedList<Waiting>();
	int token = 1;
	Customer c;
	Scanner sc = new Scanner(System.in);

	public void bookTable() {
		for (int i = 0; i < t.length; i++) {
			if (t[i] == null) {
				System.out.println("How many people you are?");
				System.out.println("Choose option: 1.One 2.Two");
				switch (sc.nextInt()) {
				case 1: {
					System.out.println("Select Table no: (1)Table_1 (2)Table_2 (3)Table_3 (4)Table_4 (5)Table_5");
					int choose = sc.nextInt();
					switch (choose) {
					case 1: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, false);
							t[choose - 1] = c;
							System.out.println("Table 1 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 1 is not available.. Please choose other table.");
						break;
					}
					case 2: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, false);
							t[choose - 1] = c;
							System.out.println("Table 2 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 2 is not available.. Please choose other table.");
						break;
					}
					case 3: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, false);
							t[choose - 1] = c;
							System.out.println("Table 3 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 3 is not available.. Please choose other table.");
						break;
					}
					case 4: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, false);
							t[choose - 1] = c;
							System.out.println("Table 4 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 4 is not available.. Please choose other table.");
						break;
					}
					case 5: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, false);
							t[choose - 1] = c;
							System.out.println("Table 5 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 5 is not available.. Please choose other table.");
						break;
					}
					default: {
						System.out.println("Please choose correct option.");
					}
					}
					break;
				}
				case 2: {
					System.out.println("Select Table no: (1)Table_1 (2)Table_2 (3)Table_3 (4)Table_4 (5)Table_5");
					int choose = sc.nextInt();
					switch (choose) {
					case 1: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, true);
							t[choose - 1] = c;
							System.out.println("Table 1 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 1 is not available.. Please choose other table.");
						break;
					}
					case 2: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, true);
							t[choose - 1] = c;
							System.out.println("Table 2 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 2 is not available.. Please choose other table.");
						break;
					}
					case 3: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, true);
							t[choose - 1] = c;
							System.out.println("Table 3 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 3 is not available.. Please choose other table.");
						break;
					}
					case 4: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, true);
							t[choose - 1] = c;
							System.out.println("Table 4 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 4 is not available.. Please choose other table.");
						break;
					}
					case 5: {
						if (t[choose - 1] == null) {
							c = new Customer(true, true, true);
							t[choose - 1] = c;
							System.out.println("Table 5 is available. Your table is booked..");
							return;
						}
						System.out.println("Table 5 is not available.. Please choose other table.");
						break;
					}
					default: {
						System.out.println("Please choose correct option.");
					}
					}
					break;
				}
				default: {
					System.out.println("Please choose correct option.");
				}
				}
				return;
			}
		}
		System.out.println("Table is not available.. ");
		System.out.println("Are you ready to wait?");
		System.out.println("1.Yes 2.No");
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("What is your name?");
			String name = sc.next().toUpperCase();
			System.out.println("How many people you are?");
			System.out.println("Choose option: 1.One 2.Two");
			int members = 0;
			switch (sc.nextInt()) {
			case 1: {
				members = 1;
				break;
			}
			case 2: {
				members = 2;
				break;
			}
			default: {
				System.out.println("Please choose correct option.");
				return;
			}
			}
			System.out.println("Please seat in waiting room.");
			wt.add(new Waiting(name, members, token));
			System.out.println("Your token number is " + token++ + ".");
			break;
		}
		case 2: {
			System.out.println("Okay..");
			break;
		}
		default: {
			System.out.println("Please choose correct option.");
		}
		}
	}

	public void leaveTable() {
		System.out.println("Select Table no: (1)Table_1 (2)Table_2 (3)Table_3 (4)Table_4 (5)Table_5");
		int choose = sc.nextInt();
		for (int i = 0; i < t.length; i++) {
			try {
				if (t[choose - 1] != null && choose <= 5) {
					switch (choose) {
					case 1: {
						t[choose - 1] = null;
						System.out.println("Now table 1 is available.");
						break;
					}
					case 2: {
						t[choose - 1] = null;
						System.out.println("Now table 2 is available.");
						break;
					}
					case 3: {
						t[choose - 1] = null;
						System.out.println("Now table 3 is available.");
						break;
					}
					case 4: {
						t[choose - 1] = null;
						System.out.println("Now table 4 is available.");
						break;
					}
					case 5: {
						t[choose - 1] = null;
						System.out.println("Now table 5 is available.");
						break;
					}
					default: {
						System.out.println("Please choose correct option.");

					}
					}
					return;
				}
			} catch (Exception e) {

			}
		}
		if (choose <= 5) {
			System.out.println("Table " + choose + " is already available.");
		} else {
			System.out.println("Please choose correct option.");
		}
	}

	public void availableTable() {
		System.out.println("_________________________________");
		System.out.print("Tables");
		space("Tables");
		System.out.println("Availability");
		System.out.println("_________________________________");
		for (int i = 0; i < t.length; i++) {
			if (t[i] == null) {
				System.out.print("Table_" + (i + 1));
				space("Table_" + i + 1);
				System.out.println(" Available");
				System.out.println("_________________________________");
			} else {
				System.out.print("Table_" + (i + 1));
				space("Table_" + i + 1);
				Customer c1 = (Customer) t[i];
				if (c1.cust1 == true && c1.cust2 == true) {
					System.out.println(" 2 customers");
				} else {
					System.out.println(" 1 customer");
				}
				System.out.println("_________________________________");
			}
		}

	}

	public void seeWaitingList() {
		System.out.println("______________________________________________");
		System.out.print("Name");
		space("Name");
		System.out.print("Members");
		space("Members");
		System.out.println("Token no.");
		System.out.println("______________________________________________");
		for (int i = 0; i < wt.size(); i++) {
			System.out.print(wt.get(i).name);
			space(wt.get(i).name);
			System.out.print(wt.get(i).members);
			space(isString(wt.get(i).members));
			System.out.println(wt.get(i).token);
			System.out.println("______________________________________________");
		}
	}

	public void allotTable() {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < wt.size(); j++) {
				if (wt.get(j).members == 1 && t[i] == null) {
					t[i] = new Customer(true, true, false);
					System.out
							.println("Table " + (i + 1) + " is booked by " + wt.get(j).name + ". (From waiting list)");
					wt.remove(j);
					return;
				} 
				else if (wt.get(j).members == 2 && t[i] == null) {
					t[i] = new Customer(true, true, true);
					System.out
							.println("Table " + (i + 1) + " is booked by " + wt.get(j).name + ". (From waiting list)");
					wt.remove(j);
					return;
				}
			}
		}
	}

	public static void space(String blank) {
		for (int i = 0; i < 17 - blank.length(); i++) {
			System.out.print(" ");
		}
	}

	public static String isString(int number) {
		return number + "";
	}
}
