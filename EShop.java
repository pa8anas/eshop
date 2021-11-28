import java.util.List;
import java.util.ArrayList;
public class EShop
{
    private String name;
    Owner owner;
    List<Item> itemsList = new ArrayList<Item>();
    List<Buyer> buyerList = new ArrayList<Buyer>();
    List<Pen> PenList = new ArrayList<Pen>();
    List<Pencil> PencilList = new ArrayList<Pencil>();
    List<Notebook> NotebookList = new ArrayList<Notebook>();

    List<Paper> PaperList = new ArrayList<Paper>();
    public Item _item;
    private int _id;
    Buyer _buyer;
    Pen pen = new Pen();
    Pencil pencil = new Pencil();
    Notebook notebook = new Notebook();
    Paper paper = new Paper();
    public EShop()
    {
    }
    public void addItem(Item _item){
       itemsList.add(_item); 
          }
  
  void getItemById(int _id){
     for (Item item : itemsList) { 
         int i = (int) item.Infos[4];
            if (i == _id) { 
                  System.out.println(item);
            }  
    }
  }
  
  public void removeItem(Item _item){
     for (Item item : itemsList) { 
            if (item == _item) { 
                itemsList.remove(_item); 
            }   
     }
    }
    
  public void addBuyer( Buyer _buyer){
     
                 buyerList.add(_buyer); 
     
    }  
    
   public void removeBuyer(Buyer _buyer){
     for (Buyer buyer : buyerList) { 
            if (buyer == _buyer) { 
                buyerList.remove(_buyer); 
            }   
     }
    }
    
    public void updateItemStock(Item _item,int _stock){
    //Object stc = (int) _stock;
    //stc = _item.Infos[3];
    _item.setStock(_stock);
    }
    
    public void showCategories(){
    System.out.println("Οι υπάρχουσες κλάσεις προιόντων είναι οι εξής:");
    System.out.println("1.Pen");
    System.out.println("Το πλήθος των Items της κλάσης Pen είναι:"+PenList.size());
    System.out.println("2.Pencil");
    System.out.println("Το πλήθος των Items της κλάσης Pencil είναι:"+PencilList.size());
    System.out.println("3.Notebook");
    System.out.println("Το πλήθος των Items της κλάσης Notebook είναι:"+NotebookList.size());
    System.out.println("4.Paper");
    System.out.println("Το πλήθος των Items της κλάσης Paper είναι:"+PaperList.size());
     }
     
     public void addPen(Pen pen){
           PenList.add(pen);
           }
           
           public void printPens(){
               for(Pen p : PenList){
        System.out.println(p);
    }  	
	   }
	    public void addPaper(Paper paper){
           PaperList.add(paper);
           }
           
           public void printPapers(){
               for(Paper i : PaperList){
        System.out.println(i);
    } 	
	   }
    public void addPencil(Pencil pencil){
           PencilList.add(pencil);
           }
           
           public void printPencils(){
               for(Pencil i : PencilList){
        System.out.println(i);
    }  	
	   }
	    
	   public void addNotebook(Notebook notebook){
           NotebookList.add(notebook);
           }
           
           public void printNotebooks(){
              for(Notebook i : NotebookList){
        System.out.println(i);
    } 	
	   }
     public void showProductsInCategory(String category){
    	switch(category){
    		case "Pen":
    		printPens();
    		case "Pencil":
    		printPencils();
    		case "Notebook":
    		printNotebooks();
    		case "Paper":
    		printPapers();
    		/*default:
    		System.out.println("Wrong argument");*/
    	}
    }
    
    public String showProduct(Item _item){
    	return(_item.getBasicInfo());
    }
    
    public void checkStatus(){
    	for (int i = 0; i < buyerList.size(); i++) {
    		System.out.println(buyerList.get(i));
    		System.out.println(buyerList.get(i).getUserName());
    		System.out.println(buyerList.get(i).BuyerCategory);    		
    		System.out.println(buyerList.get(i).bonus);
    	}

    }
    
}