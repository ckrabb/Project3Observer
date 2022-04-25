package com.online.bookstore.model.view;

/*
public class Main {
    public static void main(String[] args) throws ParseException {
        ////Facility Test One
        Facility TestFacility = new Facility();
        TestFacility.addFacilityDetail("Jordan Auto", "23 Bulls Ave, Chicago, IL 60659", 06, 10);
        TestFacility.getFacilityInformation();
        System.out.println(TestFacility.getFacilityInformation());
        ////
        TestFacility.getFacilityName();
        TestFacility.getFacilityAddress();
        TestFacility.getFacilityID();
        TestFacility.getAvailableCapacity();
        ////Facility Test Two
        FacilityInformation TestTwoFacility = new FacilityInformation();
        TestTwoFacility.addFacilityDetail("Vick Store", "23 M. Vick, Atlanta, GA 60012", 04, 15);
        TestTwoFacility.getFacilityInformation();
        System.out.println(TestTwoFacility.getFacilityInformation());
        /////
        TestTwoFacility.getFacilityName();
        TestTwoFacility.getFacilityAddress();
        TestTwoFacility.getFacilityID();
        TestTwoFacility.getAvailableCapacity();

        ////
        ////Add,remove,and list facilities
        FacilityArrangement TestGroup = new FacilityArrangement(02);
        System.out.println("-----------------------------------------------------");
        TestGroup.addNewFacility(TestFacility);
        TestGroup.addNewFacility(TestTwoFacility);
        TestGroup.listFacilities();
        System.out.println("-----------------REMOVE FACILITY TEST---------------------");
        TestGroup.removeFacility(TestFacility);
        TestGroup.listFacilities();

        System.out.println("\n-----------------FACILITY MAINTENANCE TEST---------------------");
        //Facility Maintenance Tests
        FacilityMaintenance TestMaintenance = new FacilityMaintenance();
        FacilityMaintenance TestMaintenance2 = new FacilityMaintenance();
        TestMaintenance.makeFacilityMaintRequest(06, "Ventiliation Problems", "02/04/2022", "02/07/2022");
        //schedule method for requests
        TestMaintenance.scheduleMaintenance("03/03/2022", "03/06/2022");
        TestMaintenance2.makeFacilityMaintRequest(04, "Plumbing", "05/19/2022", "05/21/2022");
       //calc downtime
        System.out.println(TestMaintenance.calcDowntimeForFacility());
        //calc total cost of request
        System.out.println("Cost: $" + TestMaintenance.calcMaintenanceCostForFacility());
        //Creating 3 test maintenance reports and adding to record list.
        FacilityMaintenanceReport testReport = new FacilityMaintenanceReport();
        FacilityMaintenanceReport testReport2 = new FacilityMaintenanceReport();
        FacilityMaintenanceReport testReport3 = new FacilityMaintenanceReport();
        testReport.createMaintenanceReport(043, 6, 5, "AC Broken", "05/02/2021", "05/05/2021", "AC needed new filter and fan. One of the rafters was damaged and needed replacement.", 1500.00);
        testReport2.createMaintenanceReport(044, 6, 1, "Broken Machinery", "08/11/2021", "09/02/2021", "Drillpress needed to be cleaned and serviced. Parts were needed and ordered.", 2300.00);
        testReport3.createMaintenanceReport(2099, 11, 10, "Parking Lot Maintenance", "02/03/2020", "02/15/2020", "Parking Lot Resurfaced.", 5320.00);
        //Maintenance Test lists
        FacMaintenanceRecords MaintenanceRecords = new FacMaintenanceRecords();
        MaintenanceRecords.addMaintenanceReport(testReport);
        MaintenanceRecords.addMaintenanceReport(testReport2);
        MaintenanceRecords.addMaintenanceReport(testReport3);
        //adding maintenance requests to record list
        MaintenanceRecords.addMaintenanceRequest(TestMaintenance);
        MaintenanceRecords.addMaintenanceRequest(TestMaintenance2);
        //list all maintenance reports
        MaintenanceRecords.listMaintenance();
        //list all maintenance requests
        MaintenanceRecords.listMaintRequests();
        //calculate Problem rate for a specific facility
        System.out.println(MaintenanceRecords.calcProblemRateForFacility(6));
        //list facility problems
        System.out.println(MaintenanceRecords.listFacilityProblems());

        System.out.println("\n-----------------FACILITY USE TESTS---------------------");
        //Creating test Uses (3)
        FacilityUse TestUse1 = new FacilityUse();
        TestUse1.reserveFacilityUse(1001, 6, "01/02/2000", "01/12/2000");
        FacilityUse TestUse2 = new FacilityUse();
        TestUse2.reserveFacilityUse(1002, 6, "3/05/2001", "03/06/2001");
        FacilityUse TestUse3 = new FacilityUse();
        TestUse3.reserveFacilityUse(1003, 11, "10/20/2003", "10/30/2003");
        //Creating FacilityUseRecords. Adding test Uses to FacilityUseRecords.
        FacilityUseRecords TestRecords = new FacilityUseRecords();
        TestRecords.addFacilityUse(TestUse1);
        TestRecords.addFacilityUse(TestUse2);
        TestRecords.addFacilityUse(TestUse3);
        //Creating test Inspections (3)
        FacilityInspection TestInspect1 = new FacilityInspection();
        TestInspect1.createFacilityInspection(2101, 11, "Wiring", "11/12/2010");
        FacilityInspection TestInspect2 = new FacilityInspection();
        TestInspect2.createFacilityInspection(2102, 12, "Yearly Inspection", "12/1/2010");
        FacilityInspection TestInspect3 = new FacilityInspection();
        TestInspect3.createFacilityInspection(2103, 12, "Yearly Inspection", "12/01/2011");
        //Adding test Inspections to FacilityUseRecords
        TestRecords.addInspection(TestInspect1);
        TestRecords.addInspection(TestInspect2);
        TestRecords.addInspection(TestInspect3);
        //List All Actual Uses //listActualUsage
        TestRecords.listActualUsage();
        //List All Inspections //listInspections
        TestRecords.listInspections();
        ///// Method Tests //////
        //calcUsageRate
        System.out.println("\nCalculated Usage Rate: $"+TestUse1.calcUsageRate());
        System.out.println("\n");
        //isInUseDuringInterval
        System.out.println("Facility is in use during requested time interval: "+TestRecords.isInUseDuringInterval(11,"10/18/2003", "10/20/2003"));
        System.out.println("\n");
        //assignFacilityToUse
        System.out.println(TestUse3.assignFacilityToUse("Storage"));
        //vacateFacility
        TestRecords.vacateFacility(11);
        //TestRecords.listActualUsage(); //To check if vacateFacility() worked
    }
}
 */