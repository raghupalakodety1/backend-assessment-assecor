package com.assessment.assescor.entity;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

//import com.sun.tools.javac.comp.Resolve;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Column(name="Id")
    @Id @GeneratedValue
	private long Id;

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    @Column(name="LastName")
	private String mLastName;

    @Column(name="FirstName")
	private String mFirstName;

    public String getmZipCode() {
        return mZipCode;
    }

    public void setmZipCode(String mZipCode) {
        this.mZipCode = mZipCode;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    @Column(name="ZipCode")
	private String mZipCode;

    @Column(name="City")
    private String mCity;


    @Column(name="Color")
	private String mColor;


	public User(/*long Id,*/ String LastName, String FirstName, String ZipCode, String City, String Color) {
	    //this.Id = Id;
		this.mLastName = LastName;
		this.mFirstName = FirstName;
		this.mZipCode = ZipCode;
		this.mCity = City;
		this.mColor = Color;
	}

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }
	
	public User() {}


}
