package com.online.bookstore.model.payment;

public interface Payment  {
    //Payment ID
    public String getPaymentID();
    public void setPaymentID(String paymentID);

    //Payment Card
    public String getPaymentCardNumber();
    public void setPaymentCardNumber(String paymentCardNumber);

    //Payment Date
    public String getPaymentDate();
    public void setPaymentDate(String paymentDate);

    //Payment Card Type
    public String getPaymentCardType();
    public void setPaymentCardType(String paymentCardType);


}
