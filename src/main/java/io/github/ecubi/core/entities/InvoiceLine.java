package io.github.ecubi.core.entities;

import io.github.ecubi.core.util.Formatter;

public class InvoiceLine {
	private String id;
	private Long amount;
	private String formatted_amount;

	public String getFormatted_amount() {
		return formatted_amount;
	}

	public void setFormatted_amount(String formatted_amount) {
		this.formatted_amount = formatted_amount;
	}

	private String currency;
	private String description;
	private Boolean discountable;
	private Long quantity;
	private Boolean proration;
	private String subscription;
	private Plan plan;

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Boolean getProration() {
		return proration;
	}

	public void setProration(Boolean proration) {
		this.proration = proration;
	}

	public String getSubscription() {
		return subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDiscountable() {
		return discountable;
	}

	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public void formatValues() {
		this.formatted_amount = Formatter.formatValue(this.amount);
	}
}
