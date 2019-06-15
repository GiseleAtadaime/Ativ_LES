package com.FATEC.LES.Helper;

public class SpinnerDataContainer {
    private Integer ID;
    private String description;

    public SpinnerDataContainer(Integer ID, String description) {
        this.ID = ID;
        this.description = description;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
