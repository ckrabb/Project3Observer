package com.online.bookstore.model.facility;

import java.util.List;

public interface FacilityArrangementImpl {
    public List<FacilityImpl> listFacilities();
    public void setFacilities(List<FacilityImpl> list);
    public FacilityImpl addNewFacility(FacilityImpl f);
    public FacilityImpl removeFacility(FacilityImpl f);
}
