package com.shahnCM.coronaDashboard.models;

public class LocationStats {

    private String states;
    private String country;
    private int LatestTotalCases;

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return LatestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "states='" + states + '\'' +
                ", country='" + country + '\'' +
                ", LatestTotalCases=" + LatestTotalCases +
                '}';
    }
}
