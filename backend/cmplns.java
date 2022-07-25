package sgsystem;


public class cmplns {

	private String tno;
	private String ctgy;
	private String cmplnbx;
	public cmplns(String tno, String ctgy, String cmplnbx) {
		super();
		this.tno = tno;
		this.ctgy = ctgy;
		this.cmplnbx = cmplnbx;
	}
	
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getCtgy() {
		return ctgy;
	}
	public void setCtgy(String ctgy) {
		this.ctgy = ctgy;
	}
	public String getCmplnbx() {
		return cmplnbx;
	}
	public void setCmplnbx(String cmplnbx) {
		this.cmplnbx = cmplnbx;
	}
		
	}
