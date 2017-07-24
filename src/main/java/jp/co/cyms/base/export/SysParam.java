package jp.co.cyms.base.export;

import java.io.Serializable;

/**
 * Java bean for 'SysParam' entity
 * 
 * @author tichnv
 *
 */
public class SysParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String parameterName;

    private String kind;

    private String title;
 
    private String value;

    

    /**
	 * @return the parameterName
	 */
	public String getParameterName() {
		return parameterName;
	}
	/**
	 * @param parameterName the parameterName to set
	 */
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public void setKind( String kind ) {
        this.kind = kind;
    }
    public String getKind() {
        return this.kind;
    }

    public void setTitle( String titleE ) {
        this.title = titleE;
    }
    public String getTitle() {
        return this.title;
    }

    public void setValue( String value ) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }

    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(parameterName);
        sb.append("|");
        sb.append(kind);
        sb.append("|");
        sb.append(title);
        sb.append("|");
        sb.append(value);
        return sb.toString(); 
    } 


}