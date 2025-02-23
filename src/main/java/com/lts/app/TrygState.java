package com.lts.app;

import java.rmi.server.UID;

public class TrygState {

    /* Constructor */
    TrygState() {
        stateUID = new UID();
    }

    private UID stateUID;

    public UID getUID() {
        return stateUID;
    }

    public String toString() {
        return stateUID.toString();
    }
}
