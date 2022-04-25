package com.online.bookstore.model.facility;

public interface FacilityImpl  {
    public void setFacilityInformation(FacilityInformationImpl info);
    public FacilityInformationImpl getFacilityInformation();
    public FacilityInformationImpl addFacilityDetail (String name, String address, String id, int availableCapacity);
}
