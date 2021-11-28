import java.util.*; 
public class ShoppingCart extends EShop{
        Buyer buyer;
	List<ItemOrdered> orderList = new ArrayList<ItemOrdered>();
	Item item;
	  
          //προσθηκη ενος προιοντος στο καλαθη του χρηστη
	public void addItemOrdered(Item item, int quantity){
		if (item.stock >= quantity){
			ItemOrdered itemOrdered = new ItemOrdered(item, quantity);
			if (orderList.contains(itemOrdered)){
				for (int i = 0; i < orderList.size(); i++) {
					if (orderList.get(i) == itemOrdered)
						orderList.get(i).quantity += itemOrdered.quantity;
				}
			}else {
				orderList.add(itemOrdered);
			}
		}
	}

	public void removeItemOrdered(ItemOrdered itemOrdered){
		orderList.remove(itemOrdered);
		itemOrdered.item.stock += itemOrdered.quantity;
	}

	public void changeItemOrderedQuantity(ItemOrdered itemOrdered, int newquantity){
		if (itemOrdered.item.stock >= newquantity)
			itemOrdered.quantity = newquantity;
		int temp = itemOrdered.item.stock-itemOrdered.quantity;
		itemOrdered.item.setStock(temp);
	}
	//προβολη του καλαθιου αγορων ενος χρηστη
	public void showCart(){
		double sum = 0;
		for (int i = 0; i < orderList.size(); i++) {
		   System.out.println("Τα προιόντα του καλαθιού αγορών του πελάτη είναι τα εξής:"); 
		   System.out.println("Προιόν:"); 
	 System.out.println(orderList.get(i).item.name);
	 System.out.println("Με ποσότητα:"); 
	 System.out.println(orderList.get(i).quantity);
	 System.out.println("Και τιμή:");
			System.out.println(orderList.get(i).item.price * orderList.get(i).quantity+ "$");
			sum += (orderList.get(i).item.price * orderList.get(i).quantity);
		}
		System.out.println("Sunolo: " + sum + "$");
	}

	public void clearCart(List<ItemOrdered> orderList){
		for (int i = 0; i < orderList.size(); i++){
			removeItemOrdered(orderList.get(i));
		}
	}

	public void checkout(List<ItemOrdered> orderList, Buyer buyer){
		showCart();
		System.out.println("Gia epivevaiwsh pathste y");
		Scanner input = new Scanner(System.in);
		String myString = input.next();
		if (myString == "y"){
			 buyer.bonus = 0.1 * calculateNet(orderList);
			buyer.awardBonus(buyer.bonus);
			for (int i = 0; i < orderList.size(); i++){
				orderList.remove(i);
			}
		}
	}

	public double calculateNet(List<ItemOrdered> orderList){
		double sum = 0;
		for (int i = 0; i < orderList.size(); i++) {
			sum += (orderList.get(i).item.price * orderList.get(i).quantity);
		}
		return sum;
	}

	public double calcluateCourierCost(List<ItemOrdered> orderList, Buyer buyer){
		double sum = 0;
		switch(buyer.BuyerCategory){
			case GOLD:
				return sum;
			case SILVER:
				sum = (2/100) * calculateNet(orderList);
				return sum;
			case BRONZE:
			if (calculateNet(orderList) >= 150){
				sum = (2/100) * calculateNet(orderList);
				return sum;
			}
			if (calculateNet(orderList) < 150){
				sum = 3.0;
				return sum;
			}
		
		}
		return sum;
	}
	
}