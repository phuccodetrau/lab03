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
}
