package Phuc;

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
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] discList) {
		int n = discList.length;
		for(int i = 0; i<n; i++) {
			itemsOrdered[qtyOrdered ++] = discList[i];
		}
	}
	
	public void addDigitalVideoDisc(String title, String category, String director, int length, float cost) {
		DigitalVideoDisc disc = new DigitalVideoDisc(title, category, director, length, cost);
		itemsOrdered[qtyOrdered++] = disc;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		itemsOrdered[qtyOrdered++] = disc1;
		itemsOrdered[qtyOrdered++] = disc2;
	}
}
