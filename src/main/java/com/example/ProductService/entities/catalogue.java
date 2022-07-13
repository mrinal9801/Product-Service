package com.example.ProductService.entities;

//Entity class

public class catalogue {
	private int catalogueId;
	private String categoryName;
	
	public catalogue(int catalogueId, String categoryName) {
		super();
		this.catalogueId = catalogueId;
		this.categoryName = categoryName;
	}

	public int getCatalogueId() {
		return catalogueId;
	}

	public void setCatalogueId(int catalogueId) {
		this.catalogueId = catalogueId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "catalogue [catalogueId=" + catalogueId + ", categoryName=" + categoryName + "]";
	}
	
}
