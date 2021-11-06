package io.github.ecubi.core.events;

import io.github.ecubi.core.entities.Company;
import io.github.ecubi.core.entities.Invoice;
import io.github.ecubi.core.entities.Subscription;

public class InvoicePaymentFailedEvent {
	private String eventId;

	private Company company;

	private Subscription subscription;

	private Invoice invoice;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
