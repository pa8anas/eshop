import java.util.Scanner;
public  class Menu  {
int amount; 
Item item;
Buyer buyer;
public void browse_store(){
System.out.println("Eshop:"+Main.eshop+".");
Main.eshop.showCategories();
System.out.println("Επιλέξτε μια κατηγορία για να δείτε τα προιόντα της");
Scanner category = new Scanner(System.in);
    String _category = category.nextLine();
Main.eshop.showProductsInCategory(_category);
System.out.println("Επιλέξτε ένα προιόν");
Scanner product = new Scanner(System.in);
    String _product = product.nextLine();
     for (int i = 0; i < Main.eshop.itemsList.size();i++){ 
         int var10 = _product.compareTo(Main.eshop.itemsList.get(i).getName());
         if(var10 == 0){
	        Main.eshop.showProduct(Main.eshop.itemsList.get(i)); 
	         System.out.println("Θέλετε να τροποποιήσεται το επιλεγμένο προιόν; (y/n)");  
	      String y1 = "y";
	      Scanner _y1 = new Scanner(System.in);
             String y1_ = _y1.nextLine();
             int var20 = y1_.compareTo(y1);
             if(var20 == 0){
                  System.out.println("Συμπληρώστε την ποσότητα που θέλετε."); 
                  Scanner quantity = new Scanner(System.in);
                  int _quantity = quantity.nextInt();
                Main.eshop.updateItemStock(Main.eshop.itemsList.get(i),_quantity);
                }
	       }
	       else{System.out.println("Καταχωρίσατε λάθος όνομα."); }
	      }
	     
	   }
	   
	   public void check_status(){
	   Main.eshop.checkStatus();
	   System.out.println("Eπιλέξτε έναν πελάτη.");
	   Scanner name = new Scanner(System.in);
           String _name = name.nextLine();
           for(int i=0; i<Main.eshop.buyerList.size(); i++){
            int var30 = _name.compareTo(Main.eshop.buyerList.get(i).getUserName());
            if(var30 == 0){
               Main.eshop.buyerList.get(i).shoppingcart.showCart();  
               System.out.println("Θέλετε να διαγράψετε τον πελάτη; (y/n)"); 
               String y1 = "y";
	      Scanner _y1 = new Scanner(System.in);
             String y1_ = _y1.nextLine();
             int var20 = y1_.compareTo(y1);
             if(var20 == 0){
                 Main.eshop.removeBuyer(Main.eshop.buyerList.get(i));
                  System.out.println("Ο πελάτης που επιλέξατε διαγράφτηκε."); 
                 
                }
            }
            }
	   }

	   
	 public void  logout(){
	   System.out.println("Επιθυμείτε να συνδεθείτε ως άλλος χρήστης; (y/n)");
	   String y10 = "y";
	   Scanner login = new Scanner(System.in);
           String _login = login.nextLine();
           int var40 = y10.compareTo(_login);
           if(var40 == 0){
            Main.LOOPING = false;
            Main.LOOPING_ = false;
            Main._LOOPING = true;
            }
            else{
            Main.LOOPING = false;
            Main.LOOPING_ = false;
            Main._LOOPING = false;
            
            }
	   }

	   	   
	}
	
