package com.medical.entity;


	import org.hibernate.annotations.DialectOverride.OverridesAnnotation;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	
	@Entity
	@Table(name = "Orders")
	public class Order {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int orderId;
		private String userName;
		private String medicineName;
		private String orderDate;
		private String orderStatus;
		
		public Order()
		{ super();
		}
		
		public Order(String medicineName, String userName, String orderDate, int orderId, String orderStatus )
		{  this.medicineName=medicineName;
		this.orderDate=orderDate;
		this.orderId=orderId;
		this.orderStatus=orderStatus;
		this.userName=userName;
		}

		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getMedicineName() {
			return medicineName;
		}
		public void setMedicineName(String medicineName) {
			this.medicineName = medicineName;
		}
		public String getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}
		public String getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String toString()
		{ return "Order [ medicineName =" +medicineName + ", orderDate=" +orderDate  + ",orderId="
	+ orderId + ",orderStatus =" + orderStatus + ",userName=" + userName +"]";
		
		}

	}



