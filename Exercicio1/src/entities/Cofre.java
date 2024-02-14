package entities;

public class Cofre {

	private int code;
	private String name;
	private double balance;

	
	public Cofre(int code, String name, double balance) {

		this.code = code;
		this.name = name;
		this.balance = balance;
	}

	public Cofre(int code, String name) {

		this.code = code;
		this.name = name;

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double value) {

		balance += value;

	}

	public void withdraw(double value) {

		balance = balance - 5 - value;

	}

	public String toString() {
		return "Acount = " + code + ", Name = " + name + ", Balance = " + balance;
	}

}
