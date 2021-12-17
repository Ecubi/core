package io.github.ecubi.core.apiresources.events;

import io.github.ecubi.core.apiresources.entities.ApiSubscription;
import io.github.ecubi.core.entities.Company;


public class SubscriptionChangedEvent {
    private Company company;

    private ApiSubscription subscription;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ApiSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(ApiSubscription subscription) {
        this.subscription = subscription;
    }
}
