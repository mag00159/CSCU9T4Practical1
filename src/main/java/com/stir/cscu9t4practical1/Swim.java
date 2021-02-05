package com.stir.cscu9t4practical1;

public class Swim extends Entry {
    
    private String location;

    public Swim (String n, int d, int m, int y, int h, int min, int s, float dist, String location)
    {
        super(n,d,m,y,h,min,s,dist);
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }
    
    @Override
    public String getEntry() {
    return getName() + " swam " + getDistance() + " KM " + getLocation() + " in "
                + getHour() + ":" + getMin() + ":" + getSec() + " On "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}
