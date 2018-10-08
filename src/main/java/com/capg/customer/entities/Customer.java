package com.capg.customer.entities;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "customers")
	public class Customer {

		@Id
		private int CustomerId;
		private String CustomerName;
		@Column(unique = true)
		private String customerEmail;
		private String customerAddress;
		private String customerPassword;

		public Customer(int customerId, String customerName, String customerEmail, String customerAddress,
				String customerPassword) {
			super();
			CustomerId = customerId;
			CustomerName = customerName;
			this.customerEmail = customerEmail;
			this.customerAddress = customerAddress;
			this.customerPassword = customerPassword;
		}

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getCustomerId() {
			return CustomerId;
		}

		public void setCustomerId(int customerId) {
			CustomerId = customerId;
		}

		public String getCustomerName() {
			return CustomerName;
		}

		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public String getCustomerAddress() {
			return customerAddress;
		}

		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

		public String getCustomerPassword() {
			return customerPassword;
		}

		public void setCustomerPassword(String customerPassword) {
			this.customerPassword = customerPassword;
		}

		@Override
		public String toString() {
			return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", customerEmail="
					+ customerEmail + ", customerAddress=" + customerAddress + ", customerPassword=" + customerPassword
					+ "]";
		}
	}