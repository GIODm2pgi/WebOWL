package jena;

public class LienMusée {

	private String nm, nr, nd, nv;
	private String idm, idr;

	@Override
	public int hashCode() {
		return Integer.parseInt(idm.split("M_")[1]);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LienMusée){
			return ((LienMusée) obj).getIdm().equals(getIdm());
		}
		return false;
	}

	public LienMusée (String idm, String nm, String idr, String nr, String nd, String nv) {
		this.nm = nm;
		this.nr = nr;
		this.nd = nd;
		this.nv = nv;
		this.idm = idm;
		this.idr = idr;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getNd() {
		return nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	public String getNv() {
		return nv;
	}

	public void setNv(String nv) {
		this.nv = nv;
	}

	public String getIdm() {
		return idm;
	}

	public void setIdm(String id) {
		this.idm = id;
	}

	public String getIdr() {
		return idr;
	}

	public void setIdr(String idr) {
		this.idr = idr;
	}

}
