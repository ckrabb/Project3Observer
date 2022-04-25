
package com.online.bookstore.model.facility;

public interface FacilityInformationImpl {

    public void setFacilityID(String id);
    public String getFacilityID();

    public void setFacilityName(String name);
    public String getFacilityName();

    public void setFacilityAddress(String address);
    public String getFacilityAddress();

    public void setAvailableCapacity(int availableCapacity );
    public int getAvailableCapacity();

    public void setInspectionID(int id);
    public int getInspectionID();

    public void setInspectionDate(String date);
    public String getInspectionDate();
}


