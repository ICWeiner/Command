public class HumanClient implements Client{
    OrderingStrategy strat;

    public HumanClient(OrderingStrategy strat){
        this.strat = strat;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strat.wants(drink,recipe,bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        strat.happyHourStarted();
    }

    @Override
    public void happyHourEnded(Bar bar) {
        strat.happyHourEnded();
    }
}
