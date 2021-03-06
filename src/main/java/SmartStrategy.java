import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    boolean happyHour = false;
    List<StringDrink> drinkList = new ArrayList<>();
    List<StringRecipe> recipeList = new ArrayList<>();
    List<StringBar> barList = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()) bar.order(drink, recipe);
        else{
            drinkList.add(drink);
            recipeList.add(recipe);
            barList.add(bar);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        happyHour = true;
        while (happyHour && barList.size() > 0){
            this.wants(drinkList.get(0),recipeList.get(0),barList.get(0));
            drinkList.remove(0);
            recipeList.remove(0);
            barList.remove(0);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        happyHour = false;
    }
}
