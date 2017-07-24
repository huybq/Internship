/*
 * Created on 14 Dec 2016 ( Time 17:19:59 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package jp.co.cyms.db;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'BkgCon' entity
 * 
 * @author DeNT
 *
 */
public class BkgCon implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : SYSTEM_ID VARCHAR2 
    private String systemId;
    // DB : BOOKING_NO VARCHAR2 
    private String bookingNo;
    // DB : CONTAINER_NO VARCHAR2 
    private String containerNo;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : UPDATED_USER VARCHAR2 
    private String updatedUser;

    // DB : UPDATED_DT_UTC TIMESTAMP(6) 
    private Date updatedDtUtc;

    // DB : UPDATED_DT_SERVER TIMESTAMP(6) 
    private Date updatedDtServer;

    // DB : UPDATED_DT_LOCAL TIMESTAMP(6) 
    private Date updatedDtLocal;

    // DB : EXCLUSIVE_FG CHAR 
    private String exclusiveFg;

    // DB : VALIDATION_FLG CHAR 
    private String validationFlg;

    // DB : CONTAINER_SIZE VARCHAR2 
    private String containerSize;

    // DB : CONTAINER_TYPE VARCHAR2 
    private String containerType;

    // DB : HC VARCHAR2 
    private String hc;

    // DB : STATUS VARCHAR2 
    private String status;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setSystemId( String systemId ) {
        this.systemId = systemId ;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public void setBookingNo( String bookingNo ) {
        this.bookingNo = bookingNo ;
    }

    public String getBookingNo() {
        return this.bookingNo;
    }

    public void setContainerNo( String containerNo ) {
        this.containerNo = containerNo ;
    }

    public String getContainerNo() {
        return this.containerNo;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setUpdatedUser( String updatedUser ) {
        this.updatedUser = updatedUser;
    }
    public String getUpdatedUser() {
        return this.updatedUser;
    }

    public void setUpdatedDtUtc( Date updatedDtUtc ) {
        this.updatedDtUtc = updatedDtUtc;
    }
    public Date getUpdatedDtUtc() {
        return this.updatedDtUtc;
    }

    public void setUpdatedDtServer( Date updatedDtServer ) {
        this.updatedDtServer = updatedDtServer;
    }
    public Date getUpdatedDtServer() {
        return this.updatedDtServer;
    }

    public void setUpdatedDtLocal( Date updatedDtLocal ) {
        this.updatedDtLocal = updatedDtLocal;
    }
    public Date getUpdatedDtLocal() {
        return this.updatedDtLocal;
    }

    public void setExclusiveFg( String exclusiveFg ) {
        this.exclusiveFg = exclusiveFg;
    }
    public String getExclusiveFg() {
        return this.exclusiveFg;
    }

    public void setValidationFlg( String validationFlg ) {
        this.validationFlg = validationFlg;
    }
    public String getValidationFlg() {
        return this.validationFlg;
    }

    public void setContainerSize( String containerSize ) {
        this.containerSize = containerSize;
    }
    public String getContainerSize() {
        return this.containerSize;
    }

    public void setContainerType( String containerType ) {
        this.containerType = containerType;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public void setHc( String hc ) {
        this.hc = hc;
    }
    public String getHc() {
        return this.hc;
    }

    public void setStatus( String status ) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(systemId);
        sb.append("|");
        sb.append(updatedUser);
        sb.append("|");
        sb.append(updatedDtUtc);
        sb.append("|");
        sb.append(updatedDtServer);
        sb.append("|");
        sb.append(updatedDtLocal);
        sb.append("|");
        sb.append(exclusiveFg);
        sb.append("|");
        sb.append(bookingNo);
        sb.append("|");
        sb.append(containerNo);
        sb.append("|");
        sb.append(validationFlg);
        sb.append("|");
        sb.append(containerSize);
        sb.append("|");
        sb.append(containerType);
        sb.append("|");
        sb.append(hc);
        sb.append("|");
        sb.append(status);
        return sb.toString(); 
    } 


}
