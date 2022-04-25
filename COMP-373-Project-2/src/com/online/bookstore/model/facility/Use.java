package com.online.bookstore.model.facility;

public interface Use {

    public void reserveFacilityUse (int UseID, int FacilityID, String StartDate, String EndDate);

    public String getUseDetails();

}
