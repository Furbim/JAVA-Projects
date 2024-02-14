package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enu.Level;

public class Trabalhador {

	private String name;
	private Level lv;
	private Double bs;
	private Department department;
	List <HourContract> contracts = new ArrayList<>();
	
	

	
	public Trabalhador(String name, Level lv, Double bs, Department department) {

		this.name = name;
		this.lv = lv;
		this.bs = bs;
		this.department = department;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Level getLv() {
		return lv;
	}




	public void setLv(Level lv) {
		this.lv = lv;
	}




	public Double getBs() {
		return bs;
	}




	public void setBs(Double bs) {
		this.bs = bs;
	}




	public Department getDepartment() {
		return department;
	}




	public void setDepartment(Department department) {
		this.department = department;
	}




	public List<HourContract> getContract() {
		return contracts;
	}




	public void setContract(List<HourContract> contract) {
		this.contracts = contract;
	}

    public void addcontract(HourContract contract) {
    	contracts.add(contract);
    	
    }
    public void aremovecontract(HourContract contract) {
    	contracts.remove(contract);
    	
    }
    
    public double income(int year, int month) {
        double sum = bs;
        for (HourContract c : contracts) {
            LocalDate contractDate = c.getMes();
            int c_year = contractDate.getYear();
            int c_month = contractDate.getMonthValue();
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

	public String toString() {
		return "Trabalhador [name=" + name + ", lv=" + lv + ", bs=" + bs + ", department=" + department + "]";
	}
	
	
}
