/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1hmsakash;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Akash Pandey
 */
@Entity
@Table(name = "userdetails", catalog = "logininfo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Userdetails.findAll", query = "SELECT u FROM Userdetails u"),
    @NamedQuery(name = "Userdetails.findByUserId", query = "SELECT u FROM Userdetails u WHERE u.userId = :userId"),
    @NamedQuery(name = "Userdetails.findByUsername", query = "SELECT u FROM Userdetails u WHERE u.username = :username"),
    @NamedQuery(name = "Userdetails.findByUserpass", query = "SELECT u FROM Userdetails u WHERE u.userpass = :userpass"),
    @NamedQuery(name = "Userdetails.findByEmail", query = "SELECT u FROM Userdetails u WHERE u.email = :email"),
    @NamedQuery(name = "Userdetails.findByFullName", query = "SELECT u FROM Userdetails u WHERE u.fullName = :fullName"),
    @NamedQuery(name = "Userdetails.findByMobile", query = "SELECT u FROM Userdetails u WHERE u.mobile = :mobile"),
    @NamedQuery(name = "Userdetails.findByGender", query = "SELECT u FROM Userdetails u WHERE u.gender = :gender"),
    @NamedQuery(name = "Userdetails.findByAadhar", query = "SELECT u FROM Userdetails u WHERE u.aadhar = :aadhar")})
public class Userdetails implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "userpass")
    private String userpass;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "mobile")
    private String mobile;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "aadhar")
    private String aadhar;

    public Userdetails() {
    }

    public Userdetails(Integer userId) {
        this.userId = userId;
    }

    public Userdetails(Integer userId, String username, String userpass, String email, String fullName, String mobile, String gender, String aadhar) {
        this.userId = userId;
        this.username = username;
        this.userpass = userpass;
        this.email = email;
        this.fullName = fullName;
        this.mobile = mobile;
        this.gender = gender;
        this.aadhar = aadhar;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        Integer oldUserId = this.userId;
        this.userId = userId;
        changeSupport.firePropertyChange("userId", oldUserId, userId);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        String oldUserpass = this.userpass;
        this.userpass = userpass;
        changeSupport.firePropertyChange("userpass", oldUserpass, userpass);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String oldFullName = this.fullName;
        this.fullName = fullName;
        changeSupport.firePropertyChange("fullName", oldFullName, fullName);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        String oldAadhar = this.aadhar;
        this.aadhar = aadhar;
        changeSupport.firePropertyChange("aadhar", oldAadhar, aadhar);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userdetails)) {
            return false;
        }
        Userdetails other = (Userdetails) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1hmsakash.Userdetails[ userId=" + userId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
