package com.online.bookstore.model.facility;

public class FacilityInspection {
    private int InspectionID, FacilityID;
    private String InspectionPurpose, InspectionDate;

    public void createFacilityInspection(int InspectionID, int FacilityID, String InspectionPurpose, String InspectionDate) {
        this.InspectionID = InspectionID;
        this.FacilityID = FacilityID;
        this.InspectionPurpose = InspectionPurpose;
        this.InspectionDate = InspectionDate;
    }

    public String getInspectionDetails() {
        return ("\nInspectionID: "+getInspectionID()+"\nFacilityID: "+getFacilityID()+"\nInspection Purpose: "+getInspectionPurpose()+"\nInspection Date: "+getInspectionDate());
    }

    public int getInspectionID(){return InspectionID;}
    public void setInspectionID(int inspectionID) {
        InspectionID = inspectionID;
    }

    public int getFacilityID() {return FacilityID;}
    public void setFacilityID(int facilityID) {
        FacilityID = facilityID;
    }

    public String getInspectionPurpose() {return InspectionPurpose;}
    public void setInspectionPurpose(String inspectionPurpose) {
        InspectionPurpose = inspectionPurpose;
    }

    public String getInspectionDate() {return InspectionDate;}
    public void setInspectionDate(String inspectionDate) {
        InspectionDate = inspectionDate;
    }
}
