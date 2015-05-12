package edu.upc.eetac.dsa.darroyo.beeter.edu.upc.eetac.dsa.darroyo.beeter.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David W8.1 on 10/04/2015.
 */
public class Sting {
    private int stingid;
    private String username;
    private String author;
    private String subject;
    private String content;
    private long lastModified;
    private long creationTimestamp;
    private Map<String, Link> links = new HashMap<String, Link>();
    private String ETag;

    public int getStingid() {
        return stingid;
    }

    public void setStingid(int stingid) {
        this.stingid = stingid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Map<String, Link> getLinks() {
        return links;
    }

    public void setETag(String ETag) {
        this.ETag = ETag;
    }


    public String getETag() {
        return ETag;
    }
}
