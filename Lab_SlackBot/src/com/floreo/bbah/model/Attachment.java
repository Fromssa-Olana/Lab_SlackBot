package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    // TODO: implement private fields for each of the following attachment JSON keys:
    private String fallback;
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;

    // TODO: determine if we need fields
    // Fields fields;

    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    private int ts;

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json
        // channel/message class parse -- use as hint/example
    }

    // add getters and setters to access private fields
    public String getFallback() { return fallback; }

    public void setFallback(String fallback) { this.fallback = fallback; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getPretext() { return pretext; }

    public void setPreText(String pretext) { this.pretext = pretext; }

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

    public Attachment(String fallback, String color, String pretext, String author_name, String author_link, String author_icon, String title, String title_link, String text,  String image_url, String thumb_url, String footer, String footer_icon, int ts) {
        this.fallback = fallback;
        this.color = color;
        this.pretext = pretext;
        this.author_name = author_name;
        this.author_link = author_link;
        this.author_icon = author_icon;
        this.title = title;
        this.title_link = title_link;
        this.text = text;
        this.image_url = image_url;
        this.thumb_url = thumb_url;
        this.footer = footer;
        this.footer_icon = footer_icon;
        this.ts = ts;
    }
}
