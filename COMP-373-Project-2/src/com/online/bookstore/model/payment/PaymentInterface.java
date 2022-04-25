package com.online.bookstore.model.payment;

public class PaymentInterface implements Payment {
    private String paymentID;
    private String paymentCardNumber;
    private String paymentCardType;
    private String paymentDate;


    public PaymentInterface() {
    }

    //ID
    public String getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    //CardNumber
    public String getPaymentCardNumber() {
        return paymentCardNumber;
    }
    public void setPaymentCardNumber(String paymentCardNumber) {
        this.paymentCardNumber = paymentCardNumber;
    }

    //CardType
    public String getPaymentCardType() {
        return paymentCardType;
    }
    public void setPaymentCardType(String paymentCardType) {
        this.paymentCardType = paymentCardType;
    }

    //Date
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

}