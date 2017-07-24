package jp.co.cyms.db;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author wangjin
 *
 */
public class ShpHdrBean implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : SYSTEM_ID VARCHAR2
    private String systemId;
    // DB : SHIPMENT_NO VARCHAR2
    private String shipmentNo;

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
    private int updatedDtLocal;

    // DB : EXCLUSIVE_FG CHAR
    private String exclusiveFg;

    // DB : VALIDATION_FLG CHAR
    private String validationFlg;

    // DB : JOB_MONTH TIMESTAMP(6)
    private String jobMonth;

    // DB : JOB_STATUS VARCHAR2
    private String jobStatus;

    // DB : DIRECT_HUB_CD VARCHAR2
    private String directHub;

    // DB : SHIPMENT_REF_NO VARCHAR2
    private String shipmentRefNo;

    // DB : SHIPPING_LINE VARCHAR2
    private String shippingLine;

    // DB : VESSEL_NAME VARCHAR2
    private String vesselName;

    // DB : VOYAGE_NO VARCHAR2
    private String voyageNo;

    // DB : LOADING_PORT VARCHAR2
    private String loadingPort;

    // DB : ETD TIMESTAMP(6)
    private String etd;

    // DB : ETA TIMESTAMP(6)
    private String eta;

    // DB : TERMINAL VARCHAR2
    private String terminal;

    // DB : CY_GATE_OPEN_DATE TIMESTAMP(6)
    private String cyGateOpenDate;

    // DB : CY_GATE_OPEN_TIME TIMESTAMP(6)
    private String cyGateOpenTime;

    // DB : CY_CUT_DATE TIMESTAMP(6)
    private String cyCutDate;

    // DB : CY_CUT_TIME TIMESTAMP(6)
    private String cyCutTime;

    // DB : FT_QTY20 NUMBER
    private BigDecimal ftQty20;

    // DB : FT_QTY40 NUMBER
    private BigDecimal ftQty40;

 // DB : HC_QTY40 NUMBER
    private BigDecimal hcQty40;

	// DB : MAX_SEQ_OF_BOOKING_NO NUMBER
    private BigDecimal maxSeqOfBookingNo;

	/** Time zone */
	private int timeZone;

	/** Number of related Booking */
	private int numberBooking;

    //----------------------------------------------------------------------
    // GETTER & SETTER
    //----------------------------------------------------------------------

    /**
	 * @return the systemId
	 */
	public String getSystemId() {
		return systemId;
	}

	/**
	 * @param systemId the systemId to set
	 */
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	/**
	 * @return the timeZone
	 */
	public int getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(int timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the shipmentNo
	 */
	public String getShipmentNo() {
		return shipmentNo;
	}

	/**
	 * @param shipmentNo the shipmentNo to set
	 */
	public void setShipmentNo(String shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	/**
	 * @return the updatedUser
	 */
	public String getUpdatedUser() {
		return updatedUser;
	}

	/**
	 * @param updatedUser the updatedUser to set
	 */
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	/**
	 * @return the updatedDtUtc
	 */
	public Date getUpdatedDtUtc() {
		return updatedDtUtc;
	}

	/**
	 * @param updatedDtUtc the updatedDtUtc to set
	 */
	public void setUpdatedDtUtc(Date updatedDtUtc) {
		this.updatedDtUtc = updatedDtUtc;
	}

	/**
	 * @return the updatedDtServer
	 */
	public Date getUpdatedDtServer() {
		return updatedDtServer;
	}

	/**
	 * @param updatedDtServer the updatedDtServer to set
	 */
	public void setUpdatedDtServer(Date updatedDtServer) {
		this.updatedDtServer = updatedDtServer;
	}

	/**
	 * @return the updatedDtLocal
	 */
	public int getUpdatedDtLocal() {
		return updatedDtLocal;
	}

	/**
	 * @param updatedDtLocal the updatedDtLocal to set
	 */
	public void setUpdatedDtLocal(int updatedDtLocal) {
		this.updatedDtLocal = updatedDtLocal;
	}

	/**
	 * @return the exclusiveFg
	 */
	public String getExclusiveFg() {
		return exclusiveFg;
	}

	/**
	 * @param exclusiveFg the exclusiveFg to set
	 */
	public void setExclusiveFg(String exclusiveFg) {
		this.exclusiveFg = exclusiveFg;
	}

	/**
	 * @return the validationFlg
	 */
	public String getValidationFlg() {
		return validationFlg;
	}

	/**
	 * @param validationFlg the validationFlg to set
	 */
	public void setValidationFlg(String validationFlg) {
		this.validationFlg = validationFlg;
	}

	/**
	 * @return the jobMonth
	 */
	public String getJobMonth() {
		return jobMonth;
	}

	/**
	 * @param jobMonth the jobMonth to set
	 */
	public void setJobMonth(String jobMonth) {
		this.jobMonth = jobMonth;
	}

	/**
	 * @return the jobStatus
	 */
	public String getJobStatus() {
		return jobStatus;
	}

	/**
	 * @param jobStatus the jobStatus to set
	 */
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	/**
	 * @return the directHub
	 */
	public String getDirectHub() {
		return directHub;
	}

	/**
	 * @param directHub the directHub to set
	 */
	public void setDirectHub(String directHub) {
		this.directHub = directHub;
	}

	/**
	 * @return the eta
	 */
	public String getEta() {
		return eta;
	}

	/**
	 * @param eta the eta to set
	 */
	public void setEta(String eta) {
		this.eta = eta;
	}

	/**
	 * @return the hcQty40
	 */
	public BigDecimal getHcQty40() {
		return hcQty40;
	}

	/**
	 * @param hcQty40 the hcQty40 to set
	 */
	public void setHcQty40(BigDecimal hcQty40) {
		this.hcQty40 = hcQty40;
	}

	/**
	 * @return the shipmentRefNo
	 */
	public String getShipmentRefNo() {
		return shipmentRefNo;
	}

	/**
	 * @param shipmentRefNo the shipmentRefNo to set
	 */
	public void setShipmentRefNo(String shipmentRefNo) {
		this.shipmentRefNo = shipmentRefNo;
	}

	/**
	 * @return the shippingLine
	 */
	public String getShippingLine() {
		return shippingLine;
	}

	/**
	 * @param shippingLine the shippingLine to set
	 */
	public void setShippingLine(String shippingLine) {
		this.shippingLine = shippingLine;
	}

	/**
	 * @return the vesselName
	 */
	public String getVesselName() {
		return vesselName;
	}

	/**
	 * @param vesselName the vesselName to set
	 */
	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	/**
	 * @return the voyageNo
	 */
	public String getVoyageNo() {
		return voyageNo;
	}

	/**
	 * @param voyageNo the voyageNo to set
	 */
	public void setVoyageNo(String voyageNo) {
		this.voyageNo = voyageNo;
	}

	/**
	 * @return the loadingPort
	 */
	public String getLoadingPort() {
		return loadingPort;
	}

	/**
	 * @param loadingPort the loadingPort to set
	 */
	public void setLoadingPort(String loadingPort) {
		this.loadingPort = loadingPort;
	}

	/**
	 * @return the terminal
	 */
	public String getTerminal() {
		return terminal;
	}

	/**
	 * @param terminal the terminal to set
	 */
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	/**
	 * @return the etd
	 */
	public String getEtd() {
		return etd;
	}

	/**
	 * @param etd the etd to set
	 */
	public void setEtd(String etd) {
		this.etd = etd;
	}

	/**
	 * @return the cyGateOpenDate
	 */
	public String getCyGateOpenDate() {
		return cyGateOpenDate;
	}

	/**
	 * @param cyGateOpenDate the cyGateOpenDate to set
	 */
	public void setCyGateOpenDate(String cyGateOpenDate) {
		this.cyGateOpenDate = cyGateOpenDate;
	}

	/**
	 * @return the cyGateOpenTime
	 */
	public String getCyGateOpenTime() {
		return cyGateOpenTime;
	}

	/**
	 * @param cyGateOpenTime the cyGateOpenTime to set
	 */
	public void setCyGateOpenTime(String cyGateOpenTime) {
		this.cyGateOpenTime = cyGateOpenTime;
	}

	/**
	 * @return the cyCutDate
	 */
	public String getCyCutDate() {
		return cyCutDate;
	}

	/**
	 * @param cyCutDate the cyCutDate to set
	 */
	public void setCyCutDate(String cyCutDate) {
		this.cyCutDate = cyCutDate;
	}

	/**
	 * @return the cyCutTime
	 */
	public String getCyCutTime() {
		return cyCutTime;
	}

	/**
	 * @param cyCutTime the cyCutTime to set
	 */
	public void setCyCutTime(String cyCutTime) {
		this.cyCutTime = cyCutTime;
	}

	/**
	 * @return the ftQty20
	 */
	public BigDecimal getFtQty20() {
		return ftQty20;
	}

	/**
	 * @param ftQty20 the ftQty20 to set
	 */
	public void setFtQty20(BigDecimal ftQty20) {
		this.ftQty20 = ftQty20;
	}

	/**
	 * @return the ftQty40
	 */
	public BigDecimal getFtQty40() {
		return ftQty40;
	}

	/**
	 * @param ftQty40 the ftQty40 to set
	 */
	public void setFtQty40(BigDecimal ftQty40) {
		this.ftQty40 = ftQty40;
	}

	/**
	 * @return the maxSeqOfBookingNo
	 */
	public BigDecimal getMaxSeqOfBookingNo() {
		return maxSeqOfBookingNo;
	}

	/**
	 * @param maxSeqOfBookingNo the maxSeqOfBookingNo to set
	 */
	public void setMaxSeqOfBookingNo(BigDecimal maxSeqOfBookingNo) {
		this.maxSeqOfBookingNo = maxSeqOfBookingNo;
	}

	public int getNumberBooking() {
		return numberBooking;
	}

	public void setNumberBooking(int numberBooking) {
		this.numberBooking = numberBooking;
	}

}
