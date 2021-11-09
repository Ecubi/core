package io.github.ecubi.core.events;

import io.github.ecubi.core.apiresources.PosUser;

public class PosUserDisabledEvent {
    private PosUser user;

    public PosUser getUser() {
        return user;
    }

    public void setUser(PosUser user) {
        this.user = user;
    }
}
