package com.online.bookstore.model.facility;

import java.util.ArrayList;

public class FacilityAnnualInspection implements Subject {
    private ArrayList<Object> observers;
    private int inspectionID;
    private String inspectionDate;

    public FacilityAnnualInspection() {
        observers = new ArrayList<Object>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Object o : observers) {
            Observer observer = (Observer) o;
            observer.update(inspectionID, inspectionDate);
        }
    }

    public void DateChanged() {
        notifyObservers();
    }

    public void setInspectionInformation(int inspectionID, String inspectionDate) {
        this.inspectionID = inspectionID;
        this.inspectionDate = inspectionDate;
        DateChanged();
    }
}
