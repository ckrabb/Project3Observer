package com.online.bookstore.model.facility;

public interface FacilityMaintenanceRequest {

    public void makeFacilityMaintRequest(int FacilityID, String Purpose, String StartDate, String EndDate);

    public String getFacilityMaintRequestInfo();
}
