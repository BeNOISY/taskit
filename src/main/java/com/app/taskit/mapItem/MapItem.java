package com.app.taskit.mapItem;

import jakarta.persistence.*;


@Entity
@Table
public class MapItem {

    @Id
    @SequenceGenerator(
            name = "map_sequence",
            sequenceName = "map_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "map_sequence"
    )
    private Long id;
    private int mapID;
    private String wrHolder;
    private String time;
    private String author;
    private String YTID;
    private String color;

    public MapItem(Long id, int mapID, String wrHolder, String time, String author, String YTID, String color) {
        this.id = id;
        this.mapID = mapID;
        this.wrHolder = wrHolder;
        this.time = time;
        this.author = author;
        this.YTID = YTID;
        this.color = color;
    }

    public MapItem(int mapID, String wrHolder, String time, String author, String YTID, String color) {
        this.mapID = mapID;
        this.wrHolder = wrHolder;
        this.time = time;
        this.author = author;
        this.YTID = YTID;
        this.color = color;
    }

    public MapItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMapID() {
        return mapID;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public String getWrHolder() {
        return wrHolder;
    }

    public void setWrHolder(String wrHolder) {
        this.wrHolder = wrHolder;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYTID() {
        return YTID;
    }

    public void setYTID(String YTID) {
        this.YTID = YTID;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MapItem{" +
                "id=" + id +
                ", mapID=" + mapID +
                ", wrHolder='" + wrHolder + '\'' +
                ", time='" + time + '\'' +
                ", author='" + author + '\'' +
                ", YTID='" + YTID + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
