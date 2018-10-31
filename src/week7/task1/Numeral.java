package week7.task1;
// thuộc về số
public class Numeral extends Expression{
    public int value;
    public Numeral(){

    }
    Numeral(int value){
        this.value = value;
    }
    @Override
    public String toString(){
        return String.format("%d", value);
    }
    @Override
    public int evaluate(){
        return value;
    }
}
