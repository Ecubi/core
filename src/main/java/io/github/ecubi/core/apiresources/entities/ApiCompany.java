package io.github.ecubi.core.apiresources.entities;

import io.github.ecubi.core.entities.User;

public class ApiCompany {
    private String id;

    private String name;

    private ApiUser owner;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiUser getOwner() {
        return owner;
    }

    public void setOwner(ApiUser owner) {
        this.owner = owner;
    }
}
