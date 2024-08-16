package LiveSessionAssign3;

@FunctionalInterface
public interface ICalculator {
	public int operate(int a, int b);

	default int absResult(int a) {
		return a * (-1);
	}
}
