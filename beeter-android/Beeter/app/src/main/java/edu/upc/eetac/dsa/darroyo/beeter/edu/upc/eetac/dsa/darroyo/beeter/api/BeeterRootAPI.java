package edu.upc.eetac.dsa.darroyo.beeter.edu.upc.eetac.dsa.darroyo.beeter.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David W8.1 on 10/04/2015.
 */
public class BeeterRootAPI {
    private Map<String, Link> links;

    public BeeterRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }

}
