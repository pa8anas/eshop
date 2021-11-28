import java.util.Arrays;
public abstract class Item{
    public  String name;
    public  double price;
    public String description;
    public int stock;
    public int id;
     Object[] Infos = infos();
    public Item(){
    }   
    
    public void setName(String name){
    this.name = name;
    }
    
    public String getName(){
    return name;
    }
    
    
    
     public void setStock(int stock){
        this.stock = stock;
        }
        
        public int getStock(){
        return stock;
        }
        
     public Object[] infos(){
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.id = id;    
 
        return new Object[] { name, description, price, stock, id };
    }
    public String getBasicInfo(){
     //Object[] Infos = infos();
    return Arrays.toString(Infos);
   }
    
    public abstract String getDetails();
    
   
    @Override public String toString(){
    return "Πληροφορίες προιόντος:"+getBasicInfo()+getDetails()+"\n"; 
    }
    
    
    
}
