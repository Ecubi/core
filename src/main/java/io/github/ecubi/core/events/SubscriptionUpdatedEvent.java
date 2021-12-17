package io.github.ecubi.core.events;

import io.github.ecubi.core.entities.Company;
import io.github.ecubi.core.entities.Subscription;

public class SubscriptionUpdatedEvent {
    private Subscription subscription;
    private Company company;

    private String eventId;

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
