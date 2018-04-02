/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1hmsakash;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Akash Pandey
 */
@Entity
@Table(name = "patientregister", catalog = "logininfo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Patientregister.findAll", query = "SELECT p FROM Patientregister p"),
    @NamedQuery(name = "Patientregister.findByPatientId", query = "SELECT p FROM Patientregister p WHERE p.patientId = :patientId"),
    @NamedQuery(name = "Patientregister.findByPatientFullname", query = "SELECT p FROM Patientregister p WHERE p.patientFullname = :patientFullname"),
    @NamedQuery(name = "Patientregister.findByPatientEmail", query = "SELECT p FROM Patientregister p WHERE p.patientEmail = :patientEmail"),
    @NamedQuery(name = "Patientregister.findByPatientAge", query = "SELECT p FROM Patientregister p WHERE p.patientAge = :patientAge"),
    @NamedQuery(name = "Patientregister.findByPatientDob", query = "SELECT p FROM Patientregister p WHERE p.patientDob = :patientDob"),
    @NamedQuery(name = "Patientregister.findByPatientMobile", query = "SELECT p FROM Patientregister p WHERE p.patientMobile = :patientMobile"),
    @NamedQuery(name = "Patientregister.findByPatientAdd", query = "SELECT p FROM Patientregister p WHERE p.patientAdd = :patientAdd"),
    @NamedQuery(name = "Patientregister.findByPatientDescription", query = "SELECT p FROM Patientregister p WHERE p.patientDescription = :patientDescription"),
    @NamedQuery(name = "Patientregister.findByPatientAadhar", query = "SELECT p FROM Patientregister p WHERE p.patientAadhar = :patientAadhar"),
    @NamedQuery(name = "Patientregister.findByPdepartment", query = "SELECT p FROM Patientregister p WHERE p.pdepartment = :pdepartment"),
    @NamedQuery(name = "Patientregister.findByGender", query = "SELECT p FROM Patientregister p WHERE p.gender = :gender")})
public class Patientregister implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patient_id")
    private Integer patientId;
    @Basic(optional = false)
    @Column(name = "patient_fullname")
    private String patientFullname;
    @Basic(optional = false)
    @Column(name = "patient_email")
    private String patientEmail;
    @Basic(optional = false)
    @Column(name = "patient_age")
    private int patientAge;
    @Basic(optional = false)
    @Column(name = "patient_dob")
    @Temporal(TemporalType.DATE)
    private Date patientDob;
    @Basic(optional = false)
    @Column(name = "patient_mobile")
    private String patientMobile;
    @Basic(optional = false)
    @Column(name = "patient_add")
    private String patientAdd;
    @Basic(optional = false)
    @Column(name = "patient_description")
    private String patientDescription;
    @Basic(optional = false)
    @Column(name = "patient_aadhar")
    private String patientAadhar;
    @Basic(optional = false)
    @Column(name = "pdepartment")
    private String pdepartment;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;

    public Patientregister() {
    }

    public Patientregister(Integer patientId) {
        this.patientId = patientId;
    }

    public Patientregister(Integer patientId, String patientFullname, String patientEmail, int patientAge, Date patientDob, String patientMobile, String patientAdd, String patientDescription, String patientAadhar, String pdepartment, String gender) {
        this.patientId = patientId;
        this.patientFullname = patientFullname;
        this.patientEmail = patientEmail;
        this.patientAge = patientAge;
        this.patientDob = patientDob;
        this.patientMobile = patientMobile;
        this.patientAdd = patientAdd;
        this.patientDescription = patientDescription;
        this.patientAadhar = patientAadhar;
        this.pdepartment = pdepartment;
        this.gender = gender;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        Integer oldPatientId = this.patientId;
        this.patientId = patientId;
        changeSupport.firePropertyChange("patientId", oldPatientId, patientId);
    }

    public String getPatientFullname() {
        return patientFullname;
    }

    public void setPatientFullname(String patientFullname) {
        String oldPatientFullname = this.patientFullname;
        this.patientFullname = patientFullname;
        changeSupport.firePropertyChange("patientFullname", oldPatientFullname, patientFullname);
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        String oldPatientEmail = this.patientEmail;
        this.patientEmail = patientEmail;
        changeSupport.firePropertyChange("patientEmail", oldPatientEmail, patientEmail);
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        int oldPatientAge = this.patientAge;
        this.patientAge = patientAge;
        changeSupport.firePropertyChange("patientAge", oldPatientAge, patientAge);
    }

    public Date getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(Date patientDob) {
        Date oldPatientDob = this.patientDob;
        this.patientDob = patientDob;
        changeSupport.firePropertyChange("patientDob", oldPatientDob, patientDob);
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        String oldPatientMobile = this.patientMobile;
        this.patientMobile = patientMobile;
        changeSupport.firePropertyChange("patientMobile", oldPatientMobile, patientMobile);
    }

    public String getPatientAdd() {
        return patientAdd;
    }

    public void setPatientAdd(String patientAdd) {
        String oldPatientAdd = this.patientAdd;
        this.patientAdd = patientAdd;
        changeSupport.firePropertyChange("patientAdd", oldPatientAdd, patientAdd);
    }

    public String getPatientDescription() {
        return patientDescription;
    }

    public void setPatientDescription(String patientDescription) {
        String oldPatientDescription = this.patientDescription;
        this.patientDescription = patientDescription;
        changeSupport.firePropertyChange("patientDescription", oldPatientDescription, patientDescription);
    }

    public String getPatientAadhar() {
        return patientAadhar;
    }

    public void setPatientAadhar(String patientAadhar) {
        String oldPatientAadhar = this.patientAadhar;
        this.patientAadhar = patientAadhar;
        changeSupport.firePropertyChange("patientAadhar", oldPatientAadhar, patientAadhar);
    }

    public String getPdepartment() {
        return pdepartment;
    }

    public void setPdepartment(String pdepartment) {
        String oldPdepartment = this.pdepartment;
        this.pdepartment = pdepartment;
        changeSupport.firePropertyChange("pdepartment", oldPdepartment, pdepartment);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patientregister)) {
            return false;
        }
        Patientregister other = (Patientregister) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1hmsakash.Patientregister[ patientId=" + patientId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
