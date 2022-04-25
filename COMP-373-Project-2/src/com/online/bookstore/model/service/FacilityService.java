package com.online.bookstore.model.service;

//import com.online.bookstore.model.dal.FacilityDAO;
import com.online.bookstore.model.facility.FacilityArrangementImpl;

public class FacilityService {
    private FacilityArrangementImpl facilityArrangement;

    public FacilityService() {}

    public void setFacilities(FacilityArrangementImpl facilityArrangement) {
        this.facilityArrangement = facilityArrangement;
    }

    public FacilityArrangementImpl getFacilities() {
        return this.facilityArrangement;
    }
}

