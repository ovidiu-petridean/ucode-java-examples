package org.ucode.hotel;

import java.util.Date;

public class IdentityCard {
    private Date dateOfBirth;
    private Date issuedAt;
    private Date expiresAt;
    private String address;
    private String cnp;

    public IdentityCard(Date dateOfBirth, Date issuedAt, Date expiresAt, String address, String cnp) {
        this.dateOfBirth = dateOfBirth;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
        this.address = address;
        this.cnp = cnp;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
}
