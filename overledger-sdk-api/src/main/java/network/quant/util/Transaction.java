package network.quant.util;

import network.quant.api.DLT;

public class Transaction {

    private DLT dlt;
    private Object data;

    public Transaction() {
    }

    public Transaction(DLT dlt, Object data) {
        this.dlt = dlt;
        this.data = data;
    }

    public DLT getDlt() {
        return dlt;
    }

    public void setDlt(DLT dlt) {
        this.dlt = dlt;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
