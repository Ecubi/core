package io.github.ecubi.core;

public class KafkaEvent<T extends Object> {
    private String eventType;
    private String transactionId;

    private T data;

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getEventType() {
        return eventType;
    }
}
