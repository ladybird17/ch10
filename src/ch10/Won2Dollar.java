package ch10;

public class Won2Dollar extends Converter {
	int rate;
	public Won2Dollar(int rate) {
		this.rate = rate;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		double result = src/rate;
		return result;
	}

	@Override
	protected String srcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String destString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
