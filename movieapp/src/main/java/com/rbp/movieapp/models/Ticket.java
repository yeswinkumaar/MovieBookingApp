package com.rbp.movieapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Document(value = "ticket")
@Data

public class Ticket {
    private BigInteger _id;
    private String loginId;
    private String movieName;
    private String theatreName;
    private Integer noOfTickets;
    private List<String> seatNumber;

    public Ticket()
    {

    }

    public Ticket(String loginId, String movieName, String theatreName, Integer noOfTickets, List<String> seatNumber) {
        this.loginId = loginId;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.noOfTickets = noOfTickets;
        this.seatNumber = seatNumber;
    }

    public Ticket(BigInteger _id,String loginId, String movieName, String theatreName, Integer noOfTickets, List<String> seatNumber) {
        this._id = _id;
        this.loginId = loginId;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.noOfTickets = noOfTickets;
        this.seatNumber = seatNumber;
    }

    public BigInteger get_id() {
        return _id;
    }

    public void set_id(BigInteger _id) {
        this._id = _id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
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

    public Integer getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public List<String> getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(List<String> seatNumber) {
        this.seatNumber = seatNumber;
    }
}
