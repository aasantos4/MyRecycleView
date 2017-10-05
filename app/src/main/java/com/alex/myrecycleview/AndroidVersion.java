package com.alex.myrecycleview;

/**
 * Created by aasantos4 on 10/09/2017.
 */

public class AndroidVersion {
    private int id;
    private String codeName;
    private String version;
    private String api;
    private String releaseDate;

    public AndroidVersion(int id, String codeName, String version, String api, String releaseDate) {
        this.id = id;
        this.codeName = codeName;
        this.version = version;
        this.api = api;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
