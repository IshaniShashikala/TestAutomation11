package com.abc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private String url;
    private String osVersion;

    public Config(){
        try {
            InputStream input = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.setUrl(prop.getProperty("url"));
            this.setOsVersion(prop.getProperty("osversion"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
