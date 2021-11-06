package io.github.ecubi.core.entities;

import java.util.List;

public class Invoice {
	Long amountDue;

	Long amountPaid;

	Long amountRemaining;

	Long applicationFeeAmount;

	Long attemptCount;

	Boolean attempted;

	Boolean autoAdvance;

	Long created;

	String currency;

	String customerEmail;

	String customerName;

	String customerPhone;

	String description;
	Long dueDate;

	Long endingBalance;

	String footer;

	String hostedInvoiceUrl;

	String id;

	String invoicePdf;

	String number;

	Boolean paid;

	Long periodEnd;

	Long periodStart;

	Long postPaymentCreditNotesAmount;

	Long prePaymentCreditNotesAmount;

	String receiptNumber;

	Long startingBalance;

	String statementDescriptor;

	String status;

	Long subscriptionProrationDate;

	Long subtotal;

	Long tax;

	Long total;

	Long webhooksDeliveredAt;
	
	List<InvoiceLine> lines;
	

	public List<InvoiceLine> getLines() {
		return lines;
	}

	public void setLines(List<InvoiceLine> lines) {
		this.lines = lines;
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Long dueDate) {
		this.dueDate = dueDate;
	}

	public Long getEndingBalance() {
		return this.endingBalance;
	}

	public void setEndingBalance(Long endingBalance) {
		this.endingBalance = endingBalance;
	}

	public String getFooter() {
		return this.footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getHostedInvoiceUrl() {
		return this.hostedInvoiceUrl;
	}

	public void setHostedInvoiceUrl(String hostedInvoiceUrl) {
		this.hostedInvoiceUrl = hostedInvoiceUrl;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvoicePdf() {
		return this.invoicePdf;
	}

	public void setInvoicePdf(String invoicePdf) {
		this.invoicePdf = invoicePdf;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Boolean getPaid() {
		return this.paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Long getPeriodEnd() {
		return this.periodEnd;
	}

	public void setPeriodEnd(Long periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Long getPeriodStart() {
		return this.periodStart;
	}

	public void setPeriodStart(Long periodStart) {
		this.periodStart = periodStart;
	}

	public Long getPostPaymentCreditNotesAmount() {
		return this.postPaymentCreditNotesAmount;
	}

	public void setPostPaymentCreditNotesAmount(Long postPaymentCreditNotesAmount) {
		this.postPaymentCreditNotesAmount = postPaymentCreditNotesAmount;
	}

	public Long getPrePaymentCreditNotesAmount() {
		return this.prePaymentCreditNotesAmount;
	}

	public void setPrePaymentCreditNotesAmount(Long prePaymentCreditNotesAmount) {
		this.prePaymentCreditNotesAmount = prePaymentCreditNotesAmount;
	}

	public String getReceiptNumber() {
		return this.receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public Long getStartingBalance() {
		return this.startingBalance;
	}

	public void setStartingBalance(Long startingBalance) {
		this.startingBalance = startingBalance;
	}

	public String getStatementDescriptor() {
		return this.statementDescriptor;
	}

	public void setStatementDescriptor(String statementDescriptor) {
		this.statementDescriptor = statementDescriptor;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSubscriptionProrationDate() {
		return this.subscriptionProrationDate;
	}

	public void setSubscriptionProrationDate(Long subscriptionProrationDate) {
		this.subscriptionProrationDate = subscriptionProrationDate;
	}

	public Long getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Long subtotal) {
		this.subtotal = subtotal;
	}

	public Long getTax() {
		return this.tax;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getWebhooksDeliveredAt() {
		return this.webhooksDeliveredAt;
	}

	public void setWebhooksDeliveredAt(Long webhooksDeliveredAt) {
		this.webhooksDeliveredAt = webhooksDeliveredAt;
	}

	public Long getAmountDue() {
		return this.amountDue;
	}

	public void setAmountDue(Long amountDue) {
		this.amountDue = amountDue;
	}

	public Long getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Long getAmountRemaining() {
		return this.amountRemaining;
	}

	public void setAmountRemaining(Long amountRemaining) {
		this.amountRemaining = amountRemaining;
	}

	public Long getApplicationFeeAmount() {
		return this.applicationFeeAmount;
	}

	public void setApplicationFeeAmount(Long applicationFeeAmount) {
		this.applicationFeeAmount = applicationFeeAmount;
	}

	public Long getAttemptCount() {
		return this.attemptCount;
	}

	public void setAttemptCount(Long attemptCount) {
		this.attemptCount = attemptCount;
	}

	public Boolean getAttempted() {
		return this.attempted;
	}

	public void setAttempted(Boolean attempted) {
		this.attempted = attempted;
	}

	public Boolean getAutoAdvance() {
		return this.autoAdvance;
	}

	public void setAutoAdvance(Boolean autoAdvance) {
		this.autoAdvance = autoAdvance;
	}
}
