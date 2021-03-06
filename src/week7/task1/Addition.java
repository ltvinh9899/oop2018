package week7.task1;
// thêm
public  class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right){
        super(left, right);
    }
   @Override
    public  String toString(){
     return String.format("%s + %s", left, right);
   }
   @Override
    public  int evaluate(){
     return left.evaluate() + right.evaluate();
   }
}

