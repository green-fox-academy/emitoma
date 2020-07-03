package com.emitoma.basicwebshop.model;

public class Filter {
    private ItemType type;
    private String shortName;
    private String longName;

    public Filter(ItemType type, String shortName, String longName) {
        this.type = type;
        this.shortName = shortName;
        this.longName = longName;
    }


    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }



    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
}
