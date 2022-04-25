package com.online.bookstore.model.facility;

import java.util.*;

public class FacMaintenanceRecords {
    private ArrayList<FacilityMaintenanceReport> listMaintenance;
    private ArrayList<FacilityMaintenance> listMaintRequests;

    public FacMaintenanceRecords() {
        listMaintenance = new ArrayList<>();
        listMaintRequests = new ArrayList<>();
    }

    public void listMaintenance() {
        this.listMaintenance.forEach((FacilityMaintenanceReport) -> System.out.println("\nMAINTENANCE REPORT"+ FacilityMaintenanceReport.getMaintenanceReport()));
    }

    public void addMaintenanceReport(FacilityMaintenanceReport facilityMaintenanceReport) {
        this.listMaintenance.add(facilityMaintenanceReport);
    }

    public void removeMaintenanceReport(FacilityMaintenanceReport facilityMaintenanceReport) {
        this.listMaintenance.remove(facilityMaintenanceReport);
    }

    public void listMaintRequests() {
        this.listMaintRequests.forEach((FacilityMaintenance) -> System.out.println("\nMAINTENANCE REQUEST"+FacilityMaintenance.getFacilityMaintRequestInfo()));
    }

    public void addMaintenanceRequest(FacilityMaintenance facilityMaintenance) {
        this.listMaintRequests.add(facilityMaintenance);
    }

    public void removeMaintenanceRequest(FacilityMaintenance facilityMaintenance) {
        this.listMaintRequests.remove(facilityMaintenance);
    }

    public String calcProblemRateForFacility(int FacilityID) {
        double i = 0;
        for (FacilityMaintenanceReport r : listMaintenance) {
            if(r.getFacilityID() == FacilityID) {
                i += (double) r.getNumberOfProblems();
            }
        }
        double problemRate =  (i/totalProblems()*100);
        return ("\nFacility "+FacilityID+" has "+problemRate+"% of Facility problems.");
    }

    public double totalProblems() {
        double i = 0;
        for (FacilityMaintenanceReport r : listMaintenance) {
            i += r.getNumberOfProblems();
        }
        return i;
    }

    public String listFacilityProblems() {
        ArrayList<String> list = new ArrayList<String>();
        for (FacilityMaintenanceReport r : listMaintenance) {
            list.add(r.getPurpose());
        }
        return ("\nFacility Problems: "+list);
    }

}
