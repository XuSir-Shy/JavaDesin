package design.BehavioralPattern.InterpreterPattern;



/**
 * And解释：非终结表达式
 */
public class AndNode extends AbstractNode{

    private AbstractNode left;

    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right){
        this.left = left;
        this.right = right;
    }

    //And解释符操作
    @Override
    public String interpret() {
        return left.interpret()+"再"+right.interpret();
    }
}
