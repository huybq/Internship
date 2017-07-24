/*
 * Created on 14 Dec 2016 ( Time 17:20:56 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package jp.co.cyms.db;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'JptMstH1' entity
 * 
 * @author DeNT
 *
 */
public class JptMstH1 implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : SYSTEM_ID VARCHAR2 
    private String systemId;
    // DB : JOB_PATTERN_CD VARCHAR2 
    private String jobPatternCd;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : TERRITORY_CD VARCHAR2 
    private String territoryCd;

    // DB : JOB_MODE VARCHAR2 
    private String jobMode;

    // DB : UPDATED_USER VARCHAR2 
    private String updatedUser;

    // DB : UPDATED_DT_UTC DATE 
    private Date updatedDtUtc;

    // DB : UPDATED_DT_SERVER DATE 
    private Date updatedDtServer;

    // DB : EXCLUSIVE_FG CHAR 
    private String exclusiveFg;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setSystemId( String systemId ) {
        this.systemId = systemId ;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public void setJobPatternCd( String jobPatternCd ) {
        this.jobPatternCd = jobPatternCd ;
    }

    public String getJobPatternCd() {
        return this.jobPatternCd;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setTerritoryCd( String territoryCd ) {
        this.territoryCd = territoryCd;
    }
    public String getTerritoryCd() {
        return this.territoryCd;
    }

    public void setJobMode( String jobMode ) {
        this.jobMode = jobMode;
    }
    public String getJobMode() {
        return this.jobMode;
    }

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

    public void setExclusiveFg( String exclusiveFg ) {
        this.exclusiveFg = exclusiveFg;
    }
    public String getExclusiveFg() {
        return this.exclusiveFg;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(systemId);
        sb.append("|");
        sb.append(jobPatternCd);
        sb.append("|");
        sb.append(territoryCd);
        sb.append("|");
        sb.append(jobMode);
        sb.append("|");
        sb.append(updatedUser);
        sb.append("|");
        sb.append(updatedDtUtc);
        sb.append("|");
        sb.append(updatedDtServer);
        sb.append("|");
        sb.append(exclusiveFg);
        return sb.toString(); 
    } 


}