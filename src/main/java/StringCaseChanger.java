public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        int len = drink.getText().length();
        StringBuilder builder = new StringBuilder(drink.getText());
        for(int i = 0; i < len; i++){
            if(Character.isLowerCase(builder.charAt(i))){
                builder.setCharAt(i,Character.toUpperCase(builder.charAt(i)));
            }else{
                builder.setCharAt(i,Character.toLowerCase(builder.charAt(i)));
            }
        }
        drink.setText(builder.toString());
    }
}
