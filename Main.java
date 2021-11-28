import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main{
    public static EShop eshop = new EShop(); 
    public static boolean LOOPING = true;
    public static boolean _LOOPING = true; 
    public static boolean LOOPING_ = true;
    
  public static void main( String args[] ) { 
      
      Pen faber_castell = new Pen();
      faber_castell.name = "fabel castell";
      faber_castell.price = 0.8;
      faber_castell.description = "κατάλληλο για συγγραφή"; 
      faber_castell.stock = 10;
      faber_castell.id = 1;
      faber_castell.colour = "red";
      faber_castell.tipSize = 1.8;
      Pen bic = new Pen();
      bic.name = "bic";
      bic.price = 0.5;
      bic.description = "οικονομικά στυλό"; 
      bic.stock = 50;
      bic.id = 2;
      bic.colour = "blue";
      bic.tipSize = 1.2;
       Pen parker = new Pen();
      parker.name = "parker";
      parker.price = 4;
      parker.description = "στυλό υψηλής ποιότητας"; 
     parker.stock = 70;
      parker.id = 3;
      parker.colour = "black";
      parker.tipSize = 0.8;
       Paper sca = new Paper();
      sca.name = "sca";
      sca.price = 0.99;
      sca.description = "Χαρτί υφής"; 
      sca.stock = 45;
      sca.id = 1;
      sca.weight = 2;
      sca.pages = 100;
      Paper upm=new Paper();
      upm.name = "upm";
      upm.price = 1.2;
      upm.description = "Χαρτί σχεδιου"; 
      upm.stock = 60;
      upm.id = 2;
      upm.weight = 4;
      upm.pages = 120;
      Paper enso=new Paper();
      upm.name = "enso";
      enso.price = 1.6;
      enso.description = "Χαρτί ζωγραφικης"; 
      enso.stock = 50;
      enso.id = 3;
      enso.weight = 3;
      enso.pages = 150;
      Pencil AAA  = new Pencil();
      AAA.name = "AAA";
      AAA.price = 0.7;
      AAA.description = "Μολυβί Σχεδίου"; 
      AAA.stock = 80;
      AAA.id = 1;
      AAA.Type = Pencil.type.H;
      AAA.tipSize = 1.2;
      Pencil camel  = new Pencil();
      camel.name = "camel";
      camel.price = 0.6;
      camel.description = "Μολυβί Γραφής"; 
      camel.stock = 40;
      camel.id = 2;
      camel.Type = Pencil.type.B;
      camel.tipSize = 1.1;
      Pencil esa  = new Pencil();
      esa.name = "esa";
      esa.price = 1.5;
      esa.description = "Μολυβί Σκίασης"; 
      esa.stock = 90;
      esa.id = 3;
      esa.Type = Pencil.type.HB;
      esa.tipSize = 1.4;
      Notebook life = new Notebook();
      life.name = "life";
      life.price = 2.5;
      life.description = "Τετράδιο 2 θεμάτων"; 
      life.stock = 47;
      life.id = 1;
      life.sections = 1;
      Notebook ciak = new Notebook();
      ciak.name = "ciak";
      ciak.price = 2.9;
      ciak.description = "Τετράδιο 3 θεμάτων"; 
      ciak.stock = 52;
      ciak.id = 2;
      ciak.sections = 3;
      Notebook md = new Notebook();
      md.name = "md";
      md.price = 3.9;
      md.description = "Τετράδιο 4 θεμάτων"; 
      md.stock = 62;
      md.id = 3;
      ciak.sections = 4;
      Buyer buyer = new Buyer("Sinas Rigers","sinas@outlook.com");
      Buyer buyer2 = new Buyer("Panos Sfendourakis","sfe@outlook.com");
      buyer.shoppingcart.addItemOrdered(faber_castell,1);
      Scanner scan = new Scanner(System.in); 
    String n = "n"; 
   String y = "y";
   String NAME= "Παναγιώτης Αθανασόπουλος";
   String EMAIL = "athanpan@outlook.com";
    Owner owner = new Owner(NAME,EMAIL); 
    eshop.addBuyer(buyer);
    eshop.addBuyer(buyer2);
    eshop.addPen(faber_castell); 
    eshop.addItem(faber_castell);
    eshop.addPen(bic); 
    eshop.addItem(bic);
    eshop.addPen(parker); 
    eshop.addItem(parker);
    eshop.addPaper(sca);
    eshop.addItem(sca);
    eshop.addPaper(upm);
    eshop.addItem(upm);
    eshop.addPaper(enso);
    eshop.addItem(enso);
    eshop.addPencil(AAA);
    eshop.addItem(AAA);
    eshop.addPencil(camel);
    eshop.addItem(camel);
    eshop.addPencil(esa);
    eshop.addItem(esa);
    eshop.addNotebook(life);
    eshop.addItem(life);
    eshop.addNotebook(ciak);
    eshop.addItem(ciak);
    eshop.addNotebook(md);
    eshop.addItem(md);
    /*buyer2.shoppingcart.addItemOrdered(sca,5);
    buyer2.shoppingcart.addItemOrdered(camel,15);
    buyer2.shoppingcart.addItemOrdered(ciak,10);
    buyer2.shoppingcart.addItemOrdered(life,15);
    buyer2.shoppingcart.addItemOrdered(md,15);
    buyer2.shoppingcart.checkout(buyer2.shoppingcart.orderList,buyer2);*/
    boolean Looping = true;
    boolean _Looping = true; 
    while(_LOOPING){
       Looping = true;
       _Looping = true;
        LOOPING = true;
        LOOPING_ = true;
    System.out.println("Καταχωρήστε το email σας ");
    Scanner myObj = new Scanner(System.in);
    String Email = myObj.nextLine();
    int var3 = Email.compareTo(owner.getUserEmail()); 
   while(Looping){
       
    if(var3 != 0 ){
        System.out.println("Δεν είστε εγγραμμενος στο σύστημα σαν ιδιοκτήτης.");
    System.out.println("Επιθυμείτε να εγγραφτείτε y/n;");
    Scanner y_n = new Scanner(System.in);
    String y_or_n = y_n.nextLine();
     int var1 = y_or_n.compareTo(y);
     int var2 = y_or_n.compareTo(n);
    if(var1 == 0){
        System.out.println("Γράψτε το όνομά σας");
        Scanner _name = new Scanner(System.in);
        String _ΝΑΜΕ = _name.nextLine();
        System.out.println("Γράψτε το email σας");
        Scanner _email = new Scanner(System.in);
         String _EMAIL = _email.nextLine();
        Buyer _buyer = new Buyer(_ΝΑΜΕ,_EMAIL);
       eshop.addBuyer(_buyer); 
       System.out.println("Eγγραφηκατε επιτυχως!!");
       Looping = false;
     }
     else if(var2 == 0){
        Looping = false;
        }
     else{
        System.out.println("Καταχωρήστε y ή n!!");
        }
    }
    else{
        Looping = false;
    }
   
   }
   while(_Looping){
    for(int i=0; i<eshop.buyerList.size(); i++) { 
        int var4 = Email.compareTo(eshop.buyerList.get(i).getUserEmail());
     if(var4 != 0){ 
         System.out.println("Δεν είστε εγγραμμενος στο σύστημα σαν πελάτης.");
          System.out.println("Επιθυμείτε να εγγραφτείτε y/n;");
       Scanner n_y = new Scanner(System.in);
        String n_or_y = n_y.nextLine();
        int var70 = n_or_y.compareTo(y);
     int var80 = n_or_y.compareTo(n);        
         if(var70 == 0 ){
         System.out.println("Γράψτε το όνομά σας");
        Scanner _name = new Scanner(System.in);
        String _ΝΑΜΕ = _name.nextLine();
        System.out.println("Γράψτε το email σας");
        Scanner _email = new Scanner(System.in);
         String _EMAIL = _email.nextLine();
        Buyer _buyer = new Buyer(_ΝΑΜΕ,_EMAIL);
       eshop.addBuyer(_buyer);  
       System.out.println("Eγγραφηκατε επιτυχως!!");
       _Looping = false;
       break;
    }
   
    else if(var80 == 0){
    _Looping = false;
    _LOOPING = false;
    }
    else{
    System.out.println("Καταχωρήστε y ή n!!");
    }
   }
   else{
     _Looping = false;  
    }
    }
  }
    
   while(LOOPING){
      
    if(var3 == 0){
        Looping = true;
        _Looping = true;
        Menu menu = new Menu();
    System.out.println("Καλωσήρθατε στο κατάστημα!!");
    System.out.println("Είσαστε ο ιδιoκτήτης του καταστήματος!!");
    System.out.println("Με όνομα:"+owner.getUserName()+".");
    System.out.println("email:"+owner.getUserEmail()+".");
    System.out.println("Eshop:"+eshop+".");
    System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Πλοήγηση στο κατάστημα");
            System.out.println("2. Δείτε τους πελάτες.");
            System.out.println("3. Αποσύνδεση χρήστη και σύνδεση άλλου χρήστη");
            System.out.println("4. Έξοδος από κατάστημα");
            System.out.println("--------------------------------");
     int Option = -1;
            while (Option < 1 || Option > 8) {
                System.out.print("Επιλέξτε τι θέλετε να κάνετε: ");
                Option = scan.nextInt();
                scan.nextLine();
            }
    switch (Option) {               
                case 1:
                    menu.browse_store();
                    break;
                case 2:
                    menu.check_status();
                    break;
                case 3:
                    menu.logout();
                    break;
                
                case 4:
                    LOOPING = false;
                    _LOOPING = false;
                    break;
            }
    
    }
    else{LOOPING = false;}
    
    }
    
    while(LOOPING_){
               Menu menu=new Menu();
        
        for(int i=0; i<eshop.buyerList.size(); i++) { 
        int var4 = Email.compareTo(eshop.buyerList.get(i).getUserEmail());
        
        if(var4 == 0)   {
        System.out.println("Καλωσήρθατε στο κατάστημα!!");
    System.out.println("Με όνομα:"+eshop.buyerList.get(i).getUserName()+".");
    System.out.println("email:"+eshop.buyerList.get(i).getUserEmail()+".");
    System.out.println("Η Κατηγορια σας ειναι:"+eshop.buyerList.get(i).BuyerCategory+".");
    System.out.println("Οι ποντοι σας ειναι:"+buyer.bonus+".");
    System.out.println();
System.out.println();
System.out.println("--------------------------------");
System.out.println("1. Browse Store");
System.out.println("2. View Cart");
System.out.println("3. CheckOut");
System.out.println("4. Back");
System.out.println("5. Log out");
System.out.println("6. Exit");
System.out.println("--------------------------------");
int option = -1;
while(option<1 || option> 6) {
 System.out.print("Επιλέξτε τι θέλετε να κάνετε: ");
 option = scan.nextInt();
 scan.nextLine();   
   }   
 System.out.println();
 System.out.println();
 switch(option) {
 case 1:
  System.out.println("Eshop:"+Main.eshop+".");
Main.eshop.showCategories();
System.out.println("Επιλέξτε μια κατηγορία για να δείτε τα προιόντα της");
Scanner category = new Scanner(System.in);
    String _category = category.nextLine();
Main.eshop.showProductsInCategory(_category);
System.out.println("Επιλέξτε ένα προιόν");
Scanner product = new Scanner(System.in);
    String _product = product.nextLine();
     for (int p = 0; p < Main.eshop.itemsList.size();p++){ 
         int var10 = _product.compareTo(Main.eshop.itemsList.get(i).getName());
         if(var10 == 0){
	       Main.eshop.showProduct(Main.eshop.itemsList.get(i)); 
	       System.out.println("Θέλετε να προσθεσετε στο καλαθι το επιλεγμένο προιόν; (y/n)");  
	      String y1 = "y";
	      Scanner _y1 = new Scanner(System.in);
             String y1_ = _y1.nextLine();
             int var20 = y1_.compareTo(y1);
             if(var20 == 0){
                  System.out.println("Συμπληρώστε την ποσότητα που θέλετε."); 
                  Scanner quantity = new Scanner(System.in);
                  int _quantity = quantity.nextInt();
                Main.eshop.buyerList.get(i).placeOrder(Main.eshop.itemsList.get(i),_quantity);
                }
	       }
	      }	     
  break;
  case 2:
  
  System.out.println("Αυτο ειναι το καλαθι σας:");
  eshop.buyerList.get(i).shoppingcart.showCart();
  if(eshop.buyerList.get(i).shoppingcart.orderList.size() == 0){
      System.out.println("To καλαθι ειναι αδειο");
    } else{
 /*System.out.println("Επιλέξτε μια παραγγελία.");
 Scanner itemOrdered= new Scanner(System.in);
 String _itemordered=itemOrdered.nextLine(); */
 boolean Looping2 = true;
 while(Looping2){
 System.out.println();
System.out.println("--------------------------------");
System.out.println("1.Επιλέξτε μια παραγγελία.");
System.out.println("2. Διαγραφη καλαθιου");
System.out.println("3. Ολοκληρωση παραγγελιας");
System.out.println("4. Go Back" );
System.out.println("--------------------------------");
Scanner itemOrdered= new Scanner(System.in);
 String _itemordered=itemOrdered.nextLine();
 int options=-1;
 while(options<1 || options>4) {
 options=scan.nextInt();
 scan.nextLine();
} 
switch(options) {
  case 1:
  System.out.println("Επιλέξτε την παραγγελία.");
 Scanner item_Ordered= new Scanner(System.in);
 String _item_ordered = item_Ordered.nextLine();
  
 boolean Looping3=true;
 while(Looping3){
 System.out.println();
System.out.println("--------------------------------");
System.out.println("1. Διαγραφη παραγγελιας");
System.out.println("2. Τροποποιηση παραγγελιας");
System.out.println("3. Go back");
System.out.println("--------------------------------");
 int optionA=-1; 
 while(optionA<1 || optionA> 3) {
 optionA = scan.nextInt();
 scan.nextLine();  
} switch(optionA) {
  case 1:
  for (int m = 0; m < eshop.buyerList.get(i).shoppingcart.orderList.size(); m++) {
	int var100 = _item_ordered.compareTo(eshop.buyerList.get(i).shoppingcart.orderList.get(m).item.name);  
	if(var100 == 0){
	
	 eshop.buyerList.get(i).shoppingcart.removeItemOrdered(eshop.buyerList.get(i).shoppingcart.orderList.get(i));
		}
    }
  break;
  case 2:
  System.out.println("Επιλέξτε νέα ποσότητα.");
  Scanner quantity = new Scanner(System.in);
 int _quantity = quantity.nextInt();
  for (int m = 0; m < eshop.buyerList.get(i).shoppingcart.orderList.size(); m++) {
	int var100 = _item_ordered.compareTo(eshop.buyerList.get(i).shoppingcart.orderList.get(m).item.name);  
	if(var100 == 0){
	
	 eshop.buyerList.get(i).shoppingcart.changeItemOrderedQuantity(eshop.buyerList.get(i).shoppingcart.orderList.get(m),_quantity);
		}
    }
  break;
  case 3:
  
  break;
       
        }
 }
  break;
  case 2:
 eshop.buyerList.get(i).shoppingcart.clearCart(eshop.buyerList.get(i).shoppingcart.orderList);
  break;
  case 3: 
 eshop.buyerList.get(i).shoppingcart.checkout(eshop.buyerList.get(i).shoppingcart.orderList,eshop.buyerList.get(i));
  break; 
  case 4:
  
  break;
}
}
}
  break;
  case 3:
  eshop.buyerList.get(i).shoppingcart.checkout(eshop.buyerList.get(i).shoppingcart.orderList,eshop.buyerList.get(i));
  break;
  case 4:
  
  break;
  case 5:
  menu.logout();
  break;
  case 6:
    LOOPING_ = false;
    _LOOPING = false;
    
    break;        
     } 
   }
   else{LOOPING_ = false; 
}
}

 }
}
System.out.println("Επιτυχημένη έξοδος.");
}
}