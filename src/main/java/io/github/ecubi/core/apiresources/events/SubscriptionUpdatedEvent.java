package io.github.ecubi.core.apiresources.events;

import io.github.ecubi.core.apiresources.entities.ApiCompany;
import io.github.ecubi.core.apiresources.entities.ApiSubscription;

public class SubscriptionUpdatedEvent {
    private ApiSubscription subscription;
    private ApiCompany company;

    private String transactionId;

    public ApiSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(ApiSubscription subscription) {
        this.subscription = subscription;
    }

    public ApiCompany getCompany() {
        return company;
    }

    public void setCompany(ApiCompany company) {
        this.company = company;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
