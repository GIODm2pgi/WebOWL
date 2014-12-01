package jena;

public class FicheMusée extends LienMusée {

	private String nru, nth, hov, rov, fan, pno, swe ;
	
	public FicheMusée (String id){
		super(id, null, null, null, null, null);
	}

	public String getNru() {
		return nru;
	}

	public void setNru(String nru) {
		this.nru = nru;
	}

	public String getNth() {
		return nth;
	}

	public void setNth(String nth) {
		this.nth = nth;
	}

	public String getHov() {
		return hov;
	}

	public void setHov(String hov) {
		this.hov = hov;
	}

	public String getRov() {
		return rov;
	}

	public void setRov(String rov) {
		this.rov = rov;
	}

	public String getFan() {
		return fan;
	}

	public void setFan(String fan) {
		this.fan = fan;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getSwe() {
		return swe;
	}

	public void setSwe(String swe) {
		this.swe = swe;
	}

}
