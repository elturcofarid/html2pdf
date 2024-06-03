package com.tools.html2pdf.model;

public class DataRequest {

    public Object data;

    public String queue;

    public DataRequest() {
    }

    public DataRequest(Object data, String queue) {
        this.data = data;
        this.queue = queue;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
