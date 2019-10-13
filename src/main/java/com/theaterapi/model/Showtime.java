/*
This Class is For Showtime Model included
id for Auto Generated ID
movieId for Query Movie's Data from MovieDB
theaterId for Query theater's Data from theaterDB
date for Date of this Showtime
time for Time of this Showtime (1 Showtime object : 1 time Only)
status for If Showtime Time has passed status will be FALSE
availableSeats for all availableseat Query from TheaterDB
unavailableSeats for all unavailableseat after user paid it
*/
package com.theaterapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
public class Showtime {
    @Id
    private String id;
    private String movieId;
    private String theaterId;
    private String date;
    private String time;
    private Boolean status;
    private List<String> availableSeats;
    private List<String> unavailableSeats;

    public void setAvailableSeats(List<String> seats){
        this.availableSeats = seats;
    }

    public void setUnavailableSeats(List<String> seats){
        this.unavailableSeats = seats;
    }

    public String getMovieId(){
        return this.movieId;
    }

    public String getTheaterId(){
        return this.theaterId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getId() {
        return id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }
}
