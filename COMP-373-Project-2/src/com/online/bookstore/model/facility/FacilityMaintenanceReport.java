package com.online.bookstore.model.facility;

public class FacilityMaintenanceReport {
    private int MaintenanceID, FacilityID, NumberOfProblems;
    private String Purpose, StartDate, EndDate, Summary;
    private double Cost;

    public void createMaintenanceReport(int MaintenanceID, int FacilityID, int NumberOfProblems, String Purpose, String StartDate, String EndDate, String Summary, double Cost) {
        this.MaintenanceID = MaintenanceID;
        this.FacilityID = FacilityID;
        this.NumberOfProblems = NumberOfProblems;
        this.Purpose = Purpose;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Summary = Summary;
        this.Cost = Cost;
    }

    public String getMaintenanceReport() {
        return ("\nMaintenanceID: " + getMaintenanceID() + "\nFacilityID: " + getFacilityID() + "\nNumber of Problems: "+getNumberOfProblems()+"\nPurpose: "+getPurpose()+"\nStart Date: "+getStartDate()+"\nEnd Date: "+getEndDate()+"\nSummary: "+getSummary()+"\nCost: "+getCost());
    }

    public int getMaintenanceID(){return MaintenanceID;}
    public void setMaintenanceID(int MaintenanceID) {
        this.MaintenanceID = MaintenanceID;
    }

    public int getFacilityID(){return FacilityID;}
    public void setFacilityID(int FacilityID) {
        this.FacilityID = FacilityID;
    }

    public int getNumberOfProblems(){return NumberOfProblems;}
    public void setNumberOfProblems(int NumberofProblems) {
        this.NumberOfProblems = NumberofProblems;
    }

    public String getPurpose(){return Purpose;}
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    public String getStartDate(){return StartDate;}
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate(){return EndDate;}
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getSummary(){return Summary;}
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public double getCost(){return Cost;}
    public void setCost(double Cost) {
        this.Cost = Cost;
    }
}
