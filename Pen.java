import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Pen extends Item{
    String colour;
    public double tipSize; 
    public Pen()
    {
    }
          
    
     public Object[] infos2(){
        this.colour = colour;
        this.tipSize = tipSize;
        return new Object[] { colour, tipSize};
    }
    
     
    
    @Override
    public String getDetails(){
       Object[] Infos = infos();
    return(Arrays.toString(Infos)); 
    }
}
