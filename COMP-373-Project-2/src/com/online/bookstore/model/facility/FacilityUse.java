package com.online.bookstore.model.facility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FacilityUse implements Use {
    private String StartDate, EndDate;
    private int UseID, FacilityID;

    public void reserveFacilityUse(int UseID, int FacilityID, String StartDate, String EndDate) {
        this.UseID = UseID;
        this.FacilityID = FacilityID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public String getUseDetails() {
        return ("\nUseID: "+UseID+"\nFacilityID: "+FacilityID+"\nStartDate: "+StartDate+"\nEndDate: "+EndDate);
    }

    public int getUseID(){return UseID;}
    public void setUseID(int UseID) {
        this.UseID = UseID;
    }

    public int getFacilityID(){return FacilityID;}
    public void setFacilityID(int FacilityID) {
        FacilityID = FacilityID;
    }

    public String getStartDate() {return StartDate;}
    public void setStartDate(String startDate) {
        this.StartDate = startDate;
    }

    public String getEndDate() {return EndDate;}
    public void setEndDate(String endDate) {
        this.EndDate = endDate;
    }

    public double calcUsageRate()
            throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(this.StartDate);
        Date secondDate = sdf.parse(this.EndDate);

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return ((double) diffInDays * 100.00);
    }

    public String assignFacilityToUse(String reasonForUse) {
        return ("Facility "+this.FacilityID+" assigned for use: "+reasonForUse);
    }

}
