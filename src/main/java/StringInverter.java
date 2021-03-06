public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder builder = new StringBuilder(drink.getText());
        builder.reverse();
        drink.setText(builder.toString());
        return ;
    }
}
