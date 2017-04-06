package no.ntnu.tdt4240.geoquiz9000.models;

import java.util.ArrayList;

public class MapPicture implements IMap {
    protected String name;
    protected static IMap.MapType mapType;
    protected String rootPath;
    protected int locationCount;

    //metaData
    private String map; //ref to map picture
    //data to calculate distances
    private double distX;
    private double distY;

    //dataSets
    private ArrayList<String> pictures;
    private ArrayList<String> description;
    private ArrayList<Integer> locationsX;
    private ArrayList<Integer> locationsY;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IMap.MapType getType() {
        return mapType;
    }

    //TODO: maybe return the actual map instead of a string
    public String getMap() {
        return map;
    }

    @Override
    public String getRootPath() { return rootPath; }

    public double getDistX() {
        return distX;
    }

    public double getDistY() {
        return distY;
    }

    @Override
    public int getLocationCount() {
        return pictures.size();
    }

    public String getLocationPicture(int id) {
        return pictures.get(id);
    }

    public String getLocationDescription(int id) {
        return description.get(id);
    }

    public int getLocationX(int id) {
        return locationsX.get(id);
    }

    public int getLocationY(int id) {
        return locationsY.get(id);
    }
}