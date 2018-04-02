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
@Table(name = "medicine", catalog = "logininfo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medicine.findAll", query = "SELECT m FROM Medicine m"),
    @NamedQuery(name = "Medicine.findByBatchno", query = "SELECT m FROM Medicine m WHERE m.batchno = :batchno"),
    @NamedQuery(name = "Medicine.findByName", query = "SELECT m FROM Medicine m WHERE m.name = :name"),
    @NamedQuery(name = "Medicine.findByStrength", query = "SELECT m FROM Medicine m WHERE m.strength = :strength"),
    @NamedQuery(name = "Medicine.findByCostprice", query = "SELECT m FROM Medicine m WHERE m.costprice = :costprice"),
    @NamedQuery(name = "Medicine.findBySellingprice", query = "SELECT m FROM Medicine m WHERE m.sellingprice = :sellingprice"),
    @NamedQuery(name = "Medicine.findByQuantity", query = "SELECT m FROM Medicine m WHERE m.quantity = :quantity"),
    @NamedQuery(name = "Medicine.findByExpiration", query = "SELECT m FROM Medicine m WHERE m.expiration = :expiration"),
    @NamedQuery(name = "Medicine.findByDescription", query = "SELECT m FROM Medicine m WHERE m.description = :description")})
public class Medicine implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "batchno")
    private String batchno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "strength")
    private String strength;
    @Basic(optional = false)
    @Column(name = "costprice")
    private String costprice;
    @Basic(optional = false)
    @Column(name = "sellingprice")
    private String sellingprice;
    @Basic(optional = false)
    @Column(name = "quantity")
    private String quantity;
    @Basic(optional = false)
    @Column(name = "expiration")
    @Temporal(TemporalType.DATE)
    private Date expiration;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public Medicine() {
    }

    public Medicine(String batchno) {
        this.batchno = batchno;
    }

    public Medicine(String batchno, String name, String strength, String costprice, String sellingprice, String quantity, Date expiration, String description) {
        this.batchno = batchno;
        this.name = name;
        this.strength = strength;
        this.costprice = costprice;
        this.sellingprice = sellingprice;
        this.quantity = quantity;
        this.expiration = expiration;
        this.description = description;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        String oldBatchno = this.batchno;
        this.batchno = batchno;
        changeSupport.firePropertyChange("batchno", oldBatchno, batchno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        String oldStrength = this.strength;
        this.strength = strength;
        changeSupport.firePropertyChange("strength", oldStrength, strength);
    }

    public String getCostprice() {
        return costprice;
    }

    public void setCostprice(String costprice) {
        String oldCostprice = this.costprice;
        this.costprice = costprice;
        changeSupport.firePropertyChange("costprice", oldCostprice, costprice);
    }

    public String getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(String sellingprice) {
        String oldSellingprice = this.sellingprice;
        this.sellingprice = sellingprice;
        changeSupport.firePropertyChange("sellingprice", oldSellingprice, sellingprice);
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        String oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        Date oldExpiration = this.expiration;
        this.expiration = expiration;
        changeSupport.firePropertyChange("expiration", oldExpiration, expiration);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (batchno != null ? batchno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicine)) {
            return false;
        }
        Medicine other = (Medicine) object;
        if ((this.batchno == null && other.batchno != null) || (this.batchno != null && !this.batchno.equals(other.batchno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1hmsakash.Medicine[ batchno=" + batchno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
