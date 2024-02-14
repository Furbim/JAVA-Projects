package program;

import java.time.LocalDate;

import entities.Order;
import entities.enume.OrderStatus;

public class Enume {

	public static void main(String[] args) {
		
		Order order = new Order(1234,LocalDate.now(),OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order.toString());
		
	}

}
