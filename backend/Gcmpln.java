package sgsystem;

public class Gcmpln {
	private  String tno;
	private  String ctgy;
	private String cmplnbx;
	private  String uid;
	public Gcmpln(String tno, String ctgy, String cmplnbx, String uid) {
		super();
		this.tno = tno;
		this.ctgy = ctgy;
		this.cmplnbx = cmplnbx;
		this.uid = uid;
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
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
}
