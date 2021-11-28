import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Paper extends Item{
    int weight;
    int pages;
   
   
     public Object[] infos4(){
        this.weight = weight;
        this.pages = pages;
        return new Object[] { weight ,pages};
    }
    public Paper()
    {
    }
    
    
    @Override
    public String getDetails(){
       Object[] Infos = infos();
    return(Arrays.toString(Infos)); 
    }
}
