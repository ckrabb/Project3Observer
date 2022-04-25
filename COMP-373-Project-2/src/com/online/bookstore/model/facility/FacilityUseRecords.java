package com.online.bookstore.model.facility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FacilityUseRecords {
    public ArrayList<FacilityUse> listActualUsage;
    public ArrayList<FacilityInspection> listInspections;

    public FacilityUseRecords() {
        listActualUsage = new ArrayList<>();
        listInspections = new ArrayList<>();
    }

    public void listActualUsage() {
        this.listActualUsage.forEach((FacilityUse) -> System.out.println("\nFACILITY USE"+FacilityUse.getUseDetails()));
    }

    public void listInspections() {
        this.listInspections.forEach((FacilityInspection) -> System.out.println("\nINSPECTION REPORT"+FacilityInspection.getInspectionDetails()));
    }

    public void addFacilityUse(FacilityUse facilityUse) {
        this.listActualUsage.add(facilityUse);
    }

    public void removeFacilityUse(FacilityUse facilityUse) {
        this.listActualUsage.remove(facilityUse);
    }

    public void addInspection(FacilityInspection facilityInspection) {
        this.listInspections.add(facilityInspection);
    }

    public void removeInspection(FacilityInspection facilityInspection) {
        this.listInspections.remove(facilityInspection);
    }

    public Date convertDate(String date)
        throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        return sdf.parse(date);
    }

    public boolean isInUseDuringInterval(int FacilityID, String startDate, String endDate) throws ParseException {
        Date startDate1 = convertDate(startDate);
        Date endDate1 = convertDate(endDate);
        int i = 0;
        for (FacilityUse r : listActualUsage) {
            if (r.getFacilityID() == FacilityID) {
                if ((convertDate(r.getStartDate()).before(startDate1) && convertDate(r.getEndDate()).before(startDate1)) || (convertDate(r.getStartDate()).after(endDate1) && convertDate(r.getEndDate()).after(endDate1))) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
        }
        return i != 0;
    }

    public void vacateFacility(int facilityID) {
        listActualUsage.removeIf(r -> r.getFacilityID() == facilityID);
    }
}
