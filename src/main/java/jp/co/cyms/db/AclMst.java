/*
 * Created on 14 Dec 2016 ( Time 17:19:51 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package jp.co.cyms.db;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'AclMst' entity
 * 
 * @author DeNT
 *
 */
public class AclMst implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : SYSTEM_ID VARCHAR2 
    private String systemId;
    // DB : CATEGORY VARCHAR2 
    private String category;
    // DB : CLASS VARCHAR2 
    private String classCd;
    // DB : CD1_PK VARCHAR2 
    private String cd1Pk;
    // DB : CD2_PK VARCHAR2 
    private String cd2Pk;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : NAME VARCHAR2 
    private String name;

    // DB : COLUMN_1 VARCHAR2 
    private String column1;

    // DB : COLUMN_2 VARCHAR2 
    private String column2;

    // DB : COLUMN_3 VARCHAR2 
    private String column3;

    // DB : COLUMN_4 VARCHAR2 
    private String column4;

    // DB : COLUMN_5 VARCHAR2 
    private String column5;

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

    public void setCategory( String category ) {
        this.category = category ;
    }

    public String getCategory() {
        return this.category;
    }

    public void setClassCd( String classCd ) {
        this.classCd = classCd ;
    }

    public String getClassCd() {
        return this.classCd;
    }

    public void setCd1Pk( String cd1Pk ) {
        this.cd1Pk = cd1Pk ;
    }

    public String getCd1Pk() {
        return this.cd1Pk;
    }

    public void setCd2Pk( String cd2Pk ) {
        this.cd2Pk = cd2Pk ;
    }

    public String getCd2Pk() {
        return this.cd2Pk;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setColumn1( String column1 ) {
        this.column1 = column1;
    }
    public String getColumn1() {
        return this.column1;
    }

    public void setColumn2( String column2 ) {
        this.column2 = column2;
    }
    public String getColumn2() {
        return this.column2;
    }

    public void setColumn3( String column3 ) {
        this.column3 = column3;
    }
    public String getColumn3() {
        return this.column3;
    }

    public void setColumn4( String column4 ) {
        this.column4 = column4;
    }
    public String getColumn4() {
        return this.column4;
    }

    public void setColumn5( String column5 ) {
        this.column5 = column5;
    }
    public String getColumn5() {
        return this.column5;
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
        sb.append(category);
        sb.append("|");
        sb.append(classCd);
        sb.append("|");
        sb.append(cd1Pk);
        sb.append("|");
        sb.append(cd2Pk);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(column1);
        sb.append("|");
        sb.append(column2);
        sb.append("|");
        sb.append(column3);
        sb.append("|");
        sb.append(column4);
        sb.append("|");
        sb.append(column5);
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
