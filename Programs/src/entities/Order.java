package entities;

import java.time.LocalDate;

import entities.enume.OrderStatus;

public class Order {

	private Integer ClientId;
	private LocalDate moment = LocalDate.now();
	private OrderStatus Status;
	
	public Order(Integer clientId, LocalDate moment, OrderStatus status) {
		super();
		ClientId = clientId;
		this.moment = moment;
		Status = status;
	}

	
	public String toString() {
		return "Order [ClientId=" + ClientId + ", moment=" + moment + ", Status=" + Status + "]";
	}

	public Integer getClientId() {
		return ClientId;
	}

	public void setClientId(Integer clientId) {
		ClientId = clientId;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return Status;
	}

	public void setStatus(OrderStatus status) {
		Status = status;
	}

	
	
	
}
