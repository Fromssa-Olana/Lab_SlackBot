package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 * A class representation of Profile Json object
 */
public class Profile {
    private String first_name;
    private String last_name;
    private String real_name;
    private String email;
    private String skype;
    private String phone;
    private String image;

    /**
     * Constructor will parse the Json object at instantiation
     * @param json
     */
    public Profile(JSONObject json) {
        if (json.get("first_name") != null) {
            this.first_name = (String) json.get("first_name");
        } if (json.get("last_name") != null) {
            this.last_name = (String) json.get("last_name");
        } if (json.get("real_name") != null) {
            this.real_name = (String)json.get("real_name");
        } if (json.get("email") != null) {
            this.email = (String)json.get("email");
        } if (json.get("skype") != null) {
            this.skype = (String)json.get("skype");
        } if (json.get("phone") != null) {
            this.phone = (String)json.get("phone");
        } if (json.get("image") != null) {
            this.image = (String)json.get("image");
        }
    }


    /*
     * Methods below this is setters and getters for the field variables
     *
     */
    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getReal_name() { return real_name; }

    public void setReal_name(String real_name) { this.real_name = real_name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSkype() { return skype; }

    public void setSkype(String skype) { this.skype = skype; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }
}