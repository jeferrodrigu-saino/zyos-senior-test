package com.zyos.report.model;
// Generated Feb 21, 2020 2:29:41 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name="address"
    ,schema="public"
)
public class Address  implements java.io.Serializable {


     private int addressId;
     private City city;
     private String address;
     private String address2;
     private String district;
     private String postalCode;
     private String phone;
     private Date lastUpdate;
     private Set<Customer> customers = new HashSet<Customer>(0);
     private Set<Store> stores = new HashSet<Store>(0);
     private Set<Staff> staffs = new HashSet<Staff>(0);

    public Address() {
    }

	
    public Address(int addressId, City city, String address, String district, String phone, Date lastUpdate) {
        this.addressId = addressId;
        this.city = city;
        this.address = address;
        this.district = district;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }
    public Address(int addressId, City city, String address, String address2, String district, String postalCode, String phone, Date lastUpdate, Set<Customer> customers, Set<Store> stores, Set<Staff> staffs) {
       this.addressId = addressId;
       this.city = city;
       this.address = address;
       this.address2 = address2;
       this.district = district;
       this.postalCode = postalCode;
       this.phone = phone;
       this.lastUpdate = lastUpdate;
       this.customers = customers;
       this.stores = stores;
       this.staffs = staffs;
    }
   
     @Id 

    
    @Column(name="address_id", unique=true, nullable=false)
    public int getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="city_id", nullable=false)
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }

    
    @Column(name="address", nullable=false, length=50)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="address2", length=50)
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    
    @Column(name="district", nullable=false, length=20)
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }

    
    @Column(name="postal_code", length=10)
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    @Column(name="phone", nullable=false, length=20)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=29)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Customer> getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Store> getStores() {
        return this.stores;
    }
    
    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Staff> getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }




}


