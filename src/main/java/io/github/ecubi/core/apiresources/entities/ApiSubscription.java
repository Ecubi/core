package io.github.ecubi.core.apiresources.entities;

public class ApiSubscription {
    private String id;

    private String vendor_id;

    private String plan_id;

    private ApiPlan plan;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendorId() {
        return vendor_id;
    }

    public void setVendorId(String vendorId) {
        this.vendor_id = vendor_id;
    }

    public String getPlanId() {
        return plan_id;
    }

    public void setPlanId(String plan_id) {
        this.plan_id = plan_id;
    }

    public ApiPlan getPlan() {
        return plan;
    }

    public void setPlan(ApiPlan plan) {
        this.plan = plan;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
