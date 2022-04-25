package com.online.bookstore.model.facility;

public class Facility implements FacilityImpl {
   private FacilityInformationImpl facilityInformation;

   public Facility() {}

   public void setFacilityInformation(FacilityInformationImpl info) {
      this.facilityInformation = info;
   }

   public FacilityInformationImpl getFacilityInformation() {
      return this.facilityInformation;
   }

   public FacilityInformationImpl addFacilityDetail(String id, String name, String address, int availableCapacity){
      this.facilityInformation.setFacilityName(name);
      this.facilityInformation.setFacilityAddress(address);
      this.facilityInformation.setFacilityID(id);
      this.facilityInformation.setAvailableCapacity(availableCapacity);
      return this.facilityInformation;
   }
}
