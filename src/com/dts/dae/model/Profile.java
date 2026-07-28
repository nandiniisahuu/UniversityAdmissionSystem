/*
 * RegistrationBean.java
 */

package com.dts.dae.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 * @author
 */
public class Profile {
    private String sub1, sub2, sub3, hno, regdno;
    private int secretqid;
    private String id;
    private String password;
    private String newpassword;
    private String firstname;
    private String lastname;
    private String logintype;
    private String status;
    private Timestamp date;
    private int roleid;
    private int flogin;
    private String timezone;
    private String city;
    private String bdate;
    private Date birthDate1;
    private String state;
    private String country;
    private String locale;
    private String secretqans;
    private String ownsecretq;
    private Timestamp passwordmoddate;
    private Timestamp profilemoddate;
    private double sscpercentage;
    private double ugpercentage;
    private double gpercentage;

    public double getSscpercentage() {
        return sscpercentage;
    }

    public void setSscpercentage(double sscpercentage) {
        this.sscpercentage = sscpercentage;
    }

    public double getUgpercentage() {
        return ugpercentage;
    }

    public void setUgpercentage(double ugpercentage) {
        this.ugpercentage = ugpercentage;
    }

    public double getGpercentage() {
        return gpercentage;
    }

    public void setGpercentage(double gpercentage) {
        this.gpercentage = gpercentage;
    }

    public Profile() {}

    public void setLoginID(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNewPassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setLoginType(String logintype) {
        this.logintype = logintype;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRegDate(Timestamp date) {
        this.date = date;
    }

    public void setSecretQuestionID(int secretqid) {
        this.secretqid = secretqid;
    }

    public void setOwnSecretQuestion(String ownsecretq) {
        this.ownsecretq = ownsecretq;
    }

    public void setSecretAnswer(String secretqans) {
        this.secretqans = secretqans;
    }

    public void setFirstLogin(int flogin) {
        this.flogin = flogin;
    }

    public void setRoleId(int roleid) {
        this.roleid = roleid;
    }

    public void setBirthDate(String bdate) {
        this.bdate = bdate;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setTimeZone(String timezone) {
        this.timezone = timezone;
    }

    public void setPasswordModifiedDate(Timestamp passwordmoddate) {
        this.passwordmoddate = passwordmoddate;
    }

    public void setProfileModifiedDate(Timestamp profilemoddate) {
        this.profilemoddate = profilemoddate;
    }

    public String getLoginID() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNewPassword() {
        return newpassword;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getLoginType() {
        return logintype;
    }

    public String getStatus() {
        return status;
    }

    public String getRegDate() {
        if (date != null) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }
        return null;
    }

    public int getSecretQuestionID() {
        return secretqid;
    }

    public String getOwnSecretQuestion() {
        return ownsecretq;
    }

    public String getSecretAnswer() {
        return secretqans;
    }

    public int getFirstLogin() {
        return flogin;
    }

    public int getRoleId() {
        return roleid;
    }

    public String getBirthDate() {
        return bdate;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getLocale() {
        return locale;
    }

    public String getTimeZone() {
        return timezone;
    }

    public String getPasswordModifiedDate() {
        if (passwordmoddate != null) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(passwordmoddate);
        }
        return null;
    }

    public String getProfileModifiedDate() {
        if (profilemoddate != null) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(profilemoddate);
        }
        return null;
    }

    public Date getBirthDate1() {
        return birthDate1;
    }

    public void setBirthDate1(Date birthDate1) {
        this.birthDate1 = birthDate1;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getRegdno() {
        return regdno;
    }

    public void setRegdno(String regdno) {
        this.regdno = regdno;
    }
}
