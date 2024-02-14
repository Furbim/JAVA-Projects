package entities;

public class PaymentPaper {

	public String name;
	public double sb;
	public double rate;

	public double sl() {

		return sb - rate;

	}

	public void IncreaseSalary(double percentage) {

		sb = sb * (percentage / 100 + 1);

	}

	public String tostring() {

		return "Name: " + name +", R$ " + String.format("%.2f%n", sl());
	
	}
}
