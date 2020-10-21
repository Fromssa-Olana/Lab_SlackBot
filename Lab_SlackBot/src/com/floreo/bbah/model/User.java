package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:
    private String id;
    private String name;
    private boolean deleted;
    private String color;

    // I think profile is a class but I'm not sure so have not finished this one
    //private profile;

    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private boolean has_2fa;
    private String two_factor_type;
    private boolean has_files;

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json - Lynnisha
    }


    // TODO add getters to access private fields - Lynnisha
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public void setName(String name) {this.name = name; }

    public boolean getDeleted() { return deleted; }

    public void setDeleted(boolean deleted) {this.deleted = deleted; }


    //not sure what should be happening with profile. Is it a Class? - LG
    /*public  getProfile() {return profile;}
    public void setProfile( profile) {this.profile = profile; }*/

    public boolean getIs_admin() { return is_admin; }

    public void setIs_admin(boolean is_admin) {this.is_admin = is_admin; }

    public boolean getIs_owner() { return is_owner; }

    public void setIs_owner(boolean is_owner) {this.is_owner = is_owner; }

    public boolean getIs_primary_owner() { return is_primary_owner; }

    public void setIs_primary_owner(boolean is_primary_owner) {this.is_primary_owner = is_primary_owner; }

    public boolean getIs_restricted() { return is_restricted; }

    public void setIs_restricted(boolean is_restricted) {this.is_restricted = is_restricted; }

    public boolean getIs_ultra_restricted() { return is_ultra_restricted; }

    public void setIs_ultra_restricted(boolean is_ultra_restricted) {this.is_ultra_restricted = is_ultra_restricted; }

    public boolean getHas_2fa() { return has_2fa; }

    public void setHas_2fa(boolean has_2fa) {this.has_2fa = has_2fa; }

    public String getTwo_factor_type() { return two_factor_type; }

    public void setTwo_factor_type(String two_factor_type) {this.two_factor_type = two_factor_type; }

    public boolean getHas_files() { return has_files; }

    public void setHas_files(boolean has_files) {this.has_files = has_files; }


}
