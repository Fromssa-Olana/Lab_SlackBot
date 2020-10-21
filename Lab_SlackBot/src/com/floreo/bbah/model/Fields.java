package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 * A class representation of  Field Json object
 */
public class Fields {
    private String title;
    private String value;
    private boolean shor;

    /**
     * Constructor will parse the Json object at instantiation
     * @param json
     */
    public Fields(JSONObject json) {
        if (json.get("title") != null) {
            this.title = (String) json.get("title");
        } if (json.get("value") != null) {
            this.value = (String) json.get("value");
        } if (json.get("shor") != null) {
            this.shor = (boolean)json.get("shor");
        }
    }


    /*
     * Methods below this is setters and getters for the field variables
     *
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isShor() {
        return shor;
    }

    public void setShor(boolean shor) {
        this.shor = shor;
    }
}
