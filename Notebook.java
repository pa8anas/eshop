import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Notebook extends Item{ 
    int sections;
    Notebook notebook;
    
     public Object[] infos3(){
        this.sections = sections;
        return new Object[] { sections};
    }
    
    public Notebook()
    {
    }
   
   
    @Override
    public String getDetails(){
       Object[] Infos = infos();
    return(Arrays.toString(Infos)); 
    }
}
