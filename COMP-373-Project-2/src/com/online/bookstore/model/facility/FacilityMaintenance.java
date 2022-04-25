package com.online.bookstore.model.facility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FacilityMaintenance implements FacilityMaintenanceRequest {
    private int FacilityID;
    private String Purpose;
    private String StartDate;
    private String EndDate;

    public void makeFacilityMaintRequest(int FacilityID, String Purpose, String StartDate, String EndDate) {
        this.FacilityID = FacilityID;
        this.Purpose = Purpose;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public String getFacilityMaintRequestInfo() {
        return ("\nFacilityID: "+getFacilityID()+"\nPurpose: "+getPurpose()+"\nStart Date: "+getStartDate()+"\nEnd Date: "+getEndDate());
    }

    public int getFacilityID(){return FacilityID;}
    public void setFacilityID(int FacilityID){
        this.FacilityID = FacilityID;
    }

    public String getPurpose(){return Purpose;}
    public void setPurpose(String Purpose){
        this.Purpose = Purpose;
    }

    public String getStartDate(){return StartDate;}
    public String getEndDate(){return EndDate;}

    public void scheduleMaintenance(String StartDate, String EndDate) {
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public String calcDowntimeForFacility()
        throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(this.StartDate);
        Date secondDate = sdf.parse(this.EndDate);

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return ("Downtime of Facility (In days): " + diffInDays);
    }

    public int differenceBetweenHours()
            throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(this.StartDate);
        Date secondDate = sdf.parse(this.EndDate);

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diffInHours = TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return (int) diffInHours;
    }

    public double calcMaintenanceCostForFacility() throws ParseException {
        int totalHours = this.differenceBetweenHours();
        return (double) totalHours * 20;
    }

}
