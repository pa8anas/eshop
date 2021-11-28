public class Buyer extends User
{
    public double bonus;
    ShoppingCart shoppingcart = new ShoppingCart();
    buyerCategory BuyerCategory;
    
    static enum buyerCategory{
        BRONZE,SILVER,GOLD
    }
     
     void setBuyerCategory(buyerCategory BuyerCategory){
     this.BuyerCategory = BuyerCategory;
    }
        
    public Buyer(String user_name,String user_email)
    {
     super(user_name,user_email);
     BuyerCategory = buyerCategory.BRONZE;
     bonus = 0;
     this.shoppingcart = shoppingcart;
    }
    
    public void setShoppingCart(ShoppingCart shoppingcart){
    this.shoppingcart = shoppingcart;
    }
    
    public ShoppingCart getShoppingCart(){
    return shoppingcart;
    }
    
    public void awardBonus(double amount){
     this.bonus += amount;
        setbuyerCategory();  
     }
    
    public void setbuyerCategory(){
     if(bonus < 100){  
        BuyerCategory = buyerCategory.BRONZE;
    }
       else if(bonus >= 100 && bonus < 200){
         BuyerCategory = buyerCategory.SILVER;
        }
        else {
         BuyerCategory = buyerCategory.GOLD;
        }
      }
      public void placeOrder(Item item, int quantity){
        shoppingcart.addItemOrdered(item, quantity);
        }

}

