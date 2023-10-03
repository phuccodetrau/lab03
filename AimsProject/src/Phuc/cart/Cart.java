package Phuc.cart;

import Phuc.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	public Cart() {
		qtyOrdered = 0;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered[qtyOrdered++] = disc;
	}
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i<qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for(int i = 0; i<qtyOrdered; i++) {
			System.out.println((i+1) + ". " + itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public DigitalVideoDisc find(String title) {
		for(int i = 0; i<qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(title)) {
				return itemsOrdered[i];
			}
		}
		System.out.println("No disc match!");
		return null;
	}
	
	public DigitalVideoDisc find(int id) {
		for(int i = 0; i<qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(id)) {
				return itemsOrdered[i];
			}
		}
		System.out.println("No disc match!");
		return null;
	}
}
