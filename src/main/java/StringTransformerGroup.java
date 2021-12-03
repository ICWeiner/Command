import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    public List<StringTransformer> list;

    public StringTransformerGroup(List<StringTransformer> list){
        this.list = list;
    }
    @Override
    public void execute(StringDrink drink) {
        for(int i = 0; i < list.size(); i++){
            list.get(i).execute(drink);
        }
    }
}
