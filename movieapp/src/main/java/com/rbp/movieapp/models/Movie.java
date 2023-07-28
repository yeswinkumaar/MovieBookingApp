package com.rbp.movieapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(value = "movie")
@Data

public class Movie {
    private BigInteger _id;
    private String movieName;

    private String theatreName;
    private Integer noOfTicketsAvailable;

    public Movie(String movieName, String theatreName, Integer noOfTicketsAvailable, String ticketsStatus) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
        this.ticketsStatus = ticketsStatus;
    }

    private String ticketsStatus;

    public Movie()
    {

    }

    public Movie(BigInteger bigInteger, String movieName, String theatreName, Integer noOfTicketsAvailable, String book_asap) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
    }

    public BigInteger get_id() {
        return _id;
    }

    public void set_id(BigInteger _id) {
        this._id = _id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public Integer getNoOfTicketsAvailable() {
        return noOfTicketsAvailable;
    }

    public void setNoOfTicketsAvailable(Integer noOfTicketsAvailable) {
        this.noOfTicketsAvailable = noOfTicketsAvailable;
    }

    public String getTicketsStatus() {
        return ticketsStatus;
    }

    public void setTicketsStatus(String ticketsStatus) {
        this.ticketsStatus = ticketsStatus;
    }
//    public Movie(ObjectId _id, String movieName, String theatreName, Integer noOfTicketsAvailable) {
//        this._id = _id;
//        this.movieName = movieName;
//        this.theatreName = theatreName;
//        this.noOfTicketsAvailable = noOfTicketsAvailable;
//    }
}
