import java.util.ArrayList;
import java.util.List;

public class StringRecipe {
    private List<StringTransformer> list;

    public StringRecipe(List<StringTransformer> list){
        this.list = list;
    }

    public void mix(StringDrink stringDrink){
        for(int i = 0; i < list.size(); i++){
            list.get(i).execute(stringDrink);
        }

    }
}
