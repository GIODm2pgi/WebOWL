package jena;

public class LienMusée {

	private String nm, nr, nd, nv;
	private String id;

	@Override
	public int hashCode() {
		return Integer.parseInt(id.split("M_")[1]);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LienMusée){
			return ((LienMusée) obj).getId().equals(getId());
		}
		return false;
	}

	public LienMusée (String id, String nm, String nr, String nd, String nv) {
		this.nm = nm;
		this.nr = nr;
		this.nd = nd;
		this.nv = nv;
		this.id = id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
