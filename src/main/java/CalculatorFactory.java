public class CalculatorFactory {

    private static final Sum sum = new Sum();
    private static final Sub sub = new Sub();

    public static Computable getComputer(String sympol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Computable) Class.forName(sympol).newInstance();
    }
}
