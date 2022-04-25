package com.online.bookstore.model.view;

import com.online.bookstore.model.facility.*;

public class FacilityMain {
    public static void main(String args[]) throws Exception {
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context-facility.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Spring to inject the right object implementation in FacilityService for Facility using Setter Injection
        FacilityService facilityService = (FacilityService) context.getBean("facilityService");
        FacilityArrangementImpl facilities = facilityService.getFacilities();

        //Spring to inject the right object implementation in Facility object
        FacilityImpl facility1 = (FacilityImpl) context.getBean("facility");
        facilities.addNewFacility(facility1);
        FacilityInformationImpl testinfo1 = facility1.getFacilityInformation();
        FacilityImpl facility2 = (FacilityImpl) context.getBean("facility");
        facilities.addNewFacility(facility2);
        FacilityInformationImpl testinfo2 = facility2.getFacilityInformation();

        //Spring to inject Facility Use Report and Facility Maintenance Request
        FacilityMaintenanceRequest facilityMaintenance1 = (FacilityMaintenanceRequest) context.getBean("facilityMaintenance");
        FacilityMaintenanceRequest facilityMaintenance2 = (FacilityMaintenanceRequest) context.getBean("facilityMaintenance");
        facilityMaintenance1.makeFacilityMaintRequest(3, "Event", "01/02/1999", "01/04/1999");
        facilityMaintenance2.makeFacilityMaintRequest(4, "Cleaning", "04/05/2001", "04/06/2001");
        Use facilityUse1 = (FacilityUse) context.getBean("facilityUse");
        Use facilityUse2 = (FacilityUse) context.getBean("facilityUse");
        facilityUse1.reserveFacilityUse(11, 3, "02/10/2000", "02/12/2000");
        facilityUse2.reserveFacilityUse(12, 4, "06/11/2002", "06/13/2002");

        //print Facility Use Report and Maintenance Request
        System.out.println("\n\t\t\t\t**--Facilities Use--**");
        System.out.println(facilityUse1.getUseDetails());
        System.out.println(facilityUse2.getUseDetails());
        System.out.println("\n\t\t\t\t**--Facilities Maintenance--**");
        System.out.println(facilityMaintenance1.getFacilityMaintRequestInfo());
        System.out.println(facilityMaintenance2.getFacilityMaintRequestInfo());


         */
        //AnnualInspectionUpdate
        FacilityAnnualInspection newInspection = new FacilityAnnualInspection();

        //Setup test facilities
        FacilityInformation testFacility = new FacilityInformation(newInspection);
        FacilityInformation testFacility2 = new FacilityInformation(newInspection);
        testFacility.setFacilityID("909");
        testFacility2.setFacilityID("342");

        //update and test remove/register observers
        //newInspection.removeObserver(testFacility2);
        //newInspection.registerObserver(testFacility2);
        newInspection.setInspectionInformation(113, "05/11/2023");



        /*
        //Facility 1
        testinfo1.setFacilityName("Jordan Auto");
        testinfo1.setFacilityAddress("23 Bulls Ave, Chicago, IL 60659");
        testinfo1.setFacilityID("06");
        testinfo1.setAvailableCapacity(10);

        //Facility 2
        testinfo2.setFacilityName("JVick Store");
        testinfo2.setFacilityAddress("23 M. Vick, Atlanta, GA 60012");
        testinfo2.setFacilityID("04");
        testinfo2.setAvailableCapacity(15);

        //Test removal
        facilities.removeFacility(facility1);

        //Set New ID
        testinfo2.setFacilityID("40");

        //print tests
        System.out.println("\n\t\t\t\t**--Facilities--**");
        List<FacilityImpl> listFacilities = facilities.listFacilities();
        for (FacilityImpl facility : listFacilities) {
            System.out.println("\nName: " + facility.getFacilityInformation().getFacilityName());
            System.out.println("\nAddress:" + facility.getFacilityInformation().getFacilityAddress());
            System.out.println("\nFacility ID: " + facility.getFacilityInformation().getFacilityID());
            System.out.println("\nAvailable Capacity: " + facility.getFacilityInformation().getAvailableCapacity());
            System.out.println("*****************  ******************");

        }
    }


         */

    }
}