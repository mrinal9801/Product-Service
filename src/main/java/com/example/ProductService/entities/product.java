package com.example.ProductService.entities;

//Entity class


public class product {
		private int productId;
		private int productPrice;
		private String productName;
		private String categoryName;
		
		
		public product(int productId, int productPrice, String productName, String categoryName) {
			super();
			this.productId = productId;
			this.productPrice = productPrice;
			this.productName = productName;
			this.categoryName = categoryName;
		}

		
		public int getProductId() {
			return productId;
		}


		public void setProductId(int productId) {
			this.productId = productId;
		}


		public int getProductPrice() {
			return productPrice;
		}


		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}


		public String getProductName() {
			return productName;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		public String getCategoryName() {
			return categoryName;
		}


		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}


		public product()
		{
			super();
		}


		@Override
		public String toString() {
			return "product [productId=" + productId + ", productPrice=" + productPrice + ", productName=" + productName
					+ ", categoryName=" + categoryName + "]";
		}
		
}
