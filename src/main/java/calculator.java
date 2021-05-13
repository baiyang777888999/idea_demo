public class calculator {

    public int compute(int num1,int num2,String sympol) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable computable = CalculatorFactory.getComputer(sympol);
        return computable.compute(num1,num2);
    }
}
