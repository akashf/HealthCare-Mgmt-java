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
@Table(name = "transactions", catalog = "logininfo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transactions.findAll", query = "SELECT t FROM Transactions t"),
    @NamedQuery(name = "Transactions.findByTransactionId", query = "SELECT t FROM Transactions t WHERE t.transactionId = :transactionId"),
    @NamedQuery(name = "Transactions.findByAccountHName", query = "SELECT t FROM Transactions t WHERE t.accountHName = :accountHName"),
    @NamedQuery(name = "Transactions.findByAmount", query = "SELECT t FROM Transactions t WHERE t.amount = :amount"),
    @NamedQuery(name = "Transactions.findByPaymentMode", query = "SELECT t FROM Transactions t WHERE t.paymentMode = :paymentMode"),
    @NamedQuery(name = "Transactions.findByMobile", query = "SELECT t FROM Transactions t WHERE t.mobile = :mobile")})
public class Transactions implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Basic(optional = false)
    @Column(name = "AccountHName")
    private String accountHName;
    @Basic(optional = false)
    @Column(name = "Amount")
    private String amount;
    @Basic(optional = false)
    @Column(name = "paymentMode")
    private String paymentMode;
    @Basic(optional = false)
    @Column(name = "Mobile")
    private String mobile;

    public Transactions() {
    }

    public Transactions(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Transactions(Integer transactionId, String accountHName, String amount, String paymentMode, String mobile) {
        this.transactionId = transactionId;
        this.accountHName = accountHName;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.mobile = mobile;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        Integer oldTransactionId = this.transactionId;
        this.transactionId = transactionId;
        changeSupport.firePropertyChange("transactionId", oldTransactionId, transactionId);
    }

    public String getAccountHName() {
        return accountHName;
    }

    public void setAccountHName(String accountHName) {
        String oldAccountHName = this.accountHName;
        this.accountHName = accountHName;
        changeSupport.firePropertyChange("accountHName", oldAccountHName, accountHName);
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        String oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        String oldPaymentMode = this.paymentMode;
        this.paymentMode = paymentMode;
        changeSupport.firePropertyChange("paymentMode", oldPaymentMode, paymentMode);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactions)) {
            return false;
        }
        Transactions other = (Transactions) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1hmsakash.Transactions[ transactionId=" + transactionId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
