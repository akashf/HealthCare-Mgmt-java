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
@Table(name = "docdetail", catalog = "logininfo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Docdetail.findAll", query = "SELECT d FROM Docdetail d"),
    @NamedQuery(name = "Docdetail.findByDocname", query = "SELECT d FROM Docdetail d WHERE d.docname = :docname"),
    @NamedQuery(name = "Docdetail.findByDocemail", query = "SELECT d FROM Docdetail d WHERE d.docemail = :docemail"),
    @NamedQuery(name = "Docdetail.findByDocmo", query = "SELECT d FROM Docdetail d WHERE d.docmo = :docmo"),
    @NamedQuery(name = "Docdetail.findByAadhar", query = "SELECT d FROM Docdetail d WHERE d.aadhar = :aadhar"),
    @NamedQuery(name = "Docdetail.findByDepartment", query = "SELECT d FROM Docdetail d WHERE d.department = :department"),
    @NamedQuery(name = "Docdetail.findByGender", query = "SELECT d FROM Docdetail d WHERE d.gender = :gender")})
public class Docdetail implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "docname")
    private String docname;
    @Basic(optional = false)
    @Column(name = "docemail")
    private String docemail;
    @Basic(optional = false)
    @Column(name = "docmo")
    private String docmo;
    @Id
    @Basic(optional = false)
    @Column(name = "aadhar")
    private String aadhar;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;

    public Docdetail() {
    }

    public Docdetail(String aadhar) {
        this.aadhar = aadhar;
    }

    public Docdetail(String aadhar, String docname, String docemail, String docmo, String department, String gender) {
        this.aadhar = aadhar;
        this.docname = docname;
        this.docemail = docemail;
        this.docmo = docmo;
        this.department = department;
        this.gender = gender;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        String oldDocname = this.docname;
        this.docname = docname;
        changeSupport.firePropertyChange("docname", oldDocname, docname);
    }

    public String getDocemail() {
        return docemail;
    }

    public void setDocemail(String docemail) {
        String oldDocemail = this.docemail;
        this.docemail = docemail;
        changeSupport.firePropertyChange("docemail", oldDocemail, docemail);
    }

    public String getDocmo() {
        return docmo;
    }

    public void setDocmo(String docmo) {
        String oldDocmo = this.docmo;
        this.docmo = docmo;
        changeSupport.firePropertyChange("docmo", oldDocmo, docmo);
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        String oldAadhar = this.aadhar;
        this.aadhar = aadhar;
        changeSupport.firePropertyChange("aadhar", oldAadhar, aadhar);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
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
        hash += (aadhar != null ? aadhar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docdetail)) {
            return false;
        }
        Docdetail other = (Docdetail) object;
        if ((this.aadhar == null && other.aadhar != null) || (this.aadhar != null && !this.aadhar.equals(other.aadhar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1hmsakash.Docdetail[ aadhar=" + aadhar + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
