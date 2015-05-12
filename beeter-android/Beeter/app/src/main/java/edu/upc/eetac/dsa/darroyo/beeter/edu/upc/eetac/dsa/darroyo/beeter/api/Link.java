package edu.upc.eetac.dsa.darroyo.beeter.edu.upc.eetac.dsa.darroyo.beeter.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David W8.1 on 10/04/2015.
 */
public class Link {
    private String target;
    private Map<String, String> parameters;

    public Link() {
        parameters = new HashMap<String, String>();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
