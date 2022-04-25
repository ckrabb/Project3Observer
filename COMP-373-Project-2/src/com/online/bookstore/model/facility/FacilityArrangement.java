package com.online.bookstore.model.facility;

import java.util.List;

public class FacilityArrangement implements FacilityArrangementImpl{
    private List<FacilityImpl> facilities;
    public FacilityArrangement() {}

    public List<FacilityImpl> listFacilities() {
        return this.facilities;
    }

    public void setFacilities(List<FacilityImpl> list) {
        this.facilities = list;
    }

    public FacilityImpl addNewFacility(FacilityImpl f) {
        facilities.add(f);
        return facilities.get(facilities.size()-1);
    }

    public FacilityImpl removeFacility(FacilityImpl f) {
        this.facilities.remove(f);
        return f;
    }
}
