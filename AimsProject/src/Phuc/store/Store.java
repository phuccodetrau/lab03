package Phuc.store;

import Phuc.disc.DigitalVideoDisc;

public class Store {

	int quantity;
	public DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];
	
	
	public Store() {
		super();
		quantity = 0;
	}
	public void addDVD(DigitalVideoDisc dvd) {
		this.itemsInStore[quantity++] = dvd;
	}
	public void removeDVD(int index) {
		for(int i = index; i<quantity; i++) {
			itemsInStore[i] = itemsInStore[i+1];
		}
		itemsInStore[quantity] = null;
		quantity --;
	}
	public void print() {
		System.out.println("***********************SPORT***********************");
		System.out.println("Ordered Items:");
		for(int i = 0; i<quantity; i++) {
			System.out.println((i+1) + ". " + itemsInStore[i].toString());
		}
		System.out.println("***************************************************");
	}
}
