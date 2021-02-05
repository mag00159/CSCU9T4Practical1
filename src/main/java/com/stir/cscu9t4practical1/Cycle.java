package com.stir.cscu9t4practical1;

public class Cycle extends Entry {
    
    private String terrain;
    private String tempo;
    
     public Cycle (String n, int d, int m, int y, int h, int min, int s, float dist, String terrain, String tempo) 
     {
        super(n, d, m, y, h, min, s, dist);
        this.terrain = terrain;
        this.tempo = tempo;
     }

    public String getTerrain()
    {
    
        return terrain;
    }

    public String getTempo()
    {
        return tempo;
    }

    @Override
    public String getEntry () {
        return getName()+ " cycled " + getDistance() + " KM in "
                + getHour()+ ":" + getMin()+ ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear()+ " on " + getTerrain() + " at " + getTempo() + " tempo\n";
    }
}