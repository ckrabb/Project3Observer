package com.online.bookstore.model.facility;

public class FacilityInformation implements FacilityInformationImpl, Observer {
    private String name;
    private String address;
    private String facilityID;
    private int availableCapacity;
    private int inspectionID;
    private String inspectionDate;
    private Subject annualInspection;


    public FacilityInformation(Subject annualInspection) {
        this.annualInspection = annualInspection;
        annualInspection.registerObserver(this);
    }

    //Facility ID
    public String getFacilityID() {
        return this.facilityID;
    }
    public void setFacilityID(String id) {
        this.facilityID = id;
    }

    //FacilityName
    public String getFacilityName() {
        return this.name;
    }
    public void setFacilityName(String name) {
        this.name = name;
    }

    //Facility Address
    public String getFacilityAddress() {
        return this.address;
    }
    public void setFacilityAddress(String address) {
        this.address = address;
    }

    //Available Capacity
    public int getAvailableCapacity() {
        return this.availableCapacity;
    }
    public void setAvailableCapacity(int availableCapacity) {

        this.availableCapacity = availableCapacity;
    }

    //Annual Inspection
    public int getInspectionID() {return this.inspectionID;}
    public void setInspectionID(int inspectionID) {
        this.inspectionID = inspectionID;
    }

    public String getInspectionDate() {return inspectionDate;}
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    @Override
    public void update(int inspectionID, String inspectionDate) {
        this.inspectionID = inspectionID;
        this.inspectionDate = inspectionDate;
        getInspectionInfo();
    }

    private void getInspectionInfo() {
        System.out.println("Annual Inspection: "+inspectionID+" scheduled for: "+inspectionDate+" at facility: "+facilityID+".");
    }

}




