package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 */

public class Attachment {

    // implement private fields for each of the following Attachment JSON keys:
    private String fallback;
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private Fields fields;
    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    private int ts;

    /**
     * An attachment constructor will parse the Json object to the class field variables
     *
     * @param json
     */
    public Attachment(JSONObject json) {

        // parse an attachment from the incoming json
        if (json.get("fallback") != null) {
            this.fallback = (String) json.get("fallback");
        }
        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }
        if (json.get("pretext") != null) {
            this.pretext = (String) json.get("pretext");
        }
        if (json.get("author_name") != null) {
            this.author_name = (String) json.get("author_name");
        }
        if (json.get("author_link") != null) {
            this.author_link = (String) json.get("author_link");
        }
        if (json.get("author_icon") != null) {
            this.author_icon = (String) json.get("author_icon");
        }
        if (json.get("title") != null) {
            this.title = (String) json.get("title");
        }
        if (json.get("fields") != null) {
            this.fields = (Fields) json.get("fields");
        }
        if (json.get("title_link") != null) {
            this.title_link = (String) json.get("title_link");
        }
        if (json.get("text") != null) {
            this.text = (String) json.get("text");
        }
        if (json.get("image_url") != null) {
            this.image_url = (String) json.get("image_url");
        }
        if (json.get("thumb_url") != null) {
            this.thumb_url = (String) json.get("thumb_url");
        }
        if (json.get("footer") != null) {
            this.footer = (String) json.get("footer");
        }
        if (json.get("footer_icon") != null) {
            this.footer_icon = (String) json.get("footer_icon");
        }
        if (json.get("ts") != null) {
            this.ts = (int) json.get("ts");
        }
    }


    /**
     * Methods below this lines are getters and setters to the field variables.
     *
     */
    public String getFallback() { return fallback; }

    public void setFallback(String fallback) { this.fallback = fallback; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getPretext() { return pretext; }

    public void setPretext(String pretext) { this.pretext = pretext; }

    public String getAuthor_name() { return author_name; }

    public void setAuthor_name(String author_name) { this.author_name = author_name; }

    public String getAuthor_link() { return author_link; }

    public void setAuthor_link(String author_link) { this.author_link = author_link; }

    public String getAuthor_icon() { return author_icon; }

    public void setAuthor_icon(String author_icon) { this.author_icon = author_icon; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getTitle_link() { return title_link; }

    public void setTitle_link(String title_link) { this.title_link = title_link; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public Fields getFields() { return fields; }

    public void setFields(Fields fields) { this.fields = fields; }

    public String getImage_url() { return image_url; }

    public void setImage_url(String image_url) { this.image_url = image_url; }

    public String getThumb_url() { return thumb_url; }

    public void setThumb_url(String thumb_url) { this.thumb_url = thumb_url; }

    public String getFooter() { return footer; }

    public void setFooter(String footer) { this.footer = footer; }

    public String getFooter_icon() { return footer_icon; }

    public void setFooter_icon(String footer_icon) { this.footer_icon = footer_icon; }

    public int getTs() { return ts; }

    public void setTs(int ts) { this.ts = ts; }

    // attachment constructor
    public Attachment(String fallback, String color, String pretext, String author_name, String author_link, String author_icon, String title, String title_link, String text, Fields fields, String image_url, String thumb_url, String footer, String footer_icon, int ts) {
        this.fallback = fallback;
        this.color = color;
        this.pretext = pretext;
        this.author_name = author_name;
        this.author_link = author_link;
        this.author_icon = author_icon;
        this.title = title;
        this.title_link = title_link;
        this.text = text;
        this.fields = fields;
        this.image_url = image_url;
        this.thumb_url = thumb_url;
        this.footer = footer;
        this.footer_icon = footer_icon;
        this.ts = ts;
    }
}
