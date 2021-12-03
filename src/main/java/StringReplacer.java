public class StringReplacer implements StringTransformer{
    private char a,b;

    public StringReplacer(Character a, Character b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void execute(StringDrink drink) {
        StringBuilder builder = new StringBuilder(drink.getText());
        int len = drink.getText().length();

        for (int i = 0; i < len; i++){
            if( builder.charAt(i) == this.a){
                builder.setCharAt(i,this.b);
            }
        }
        drink.setText(builder.toString());
    }
}
