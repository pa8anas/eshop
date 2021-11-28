import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Pencil extends Item{
    public double tipSize;
    type Type;
   
    
    static enum type{
        H,B,HB
    }
    
     public Object[] infos1(){
        this.tipSize = tipSize;
        this.Type = Type;
        return new Object[] { tipSize, Type };
    }
    
    public Pencil()
    {
    }
     void setType(type Type){
     this.Type = Type;
    }
    
    
    @Override
    public String getDetails(){
       Object[] Infos = infos();
    return(Arrays.toString(Infos)); 
    }
    
}
