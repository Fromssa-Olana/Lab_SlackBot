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
    private profile;

    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private boolean has_2fa;
    private String two_factor_type;
    private boolean has_files;

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json
    }

    // TODO add getters to access private fields
}
