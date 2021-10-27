package entity;
// Generated Oct 23, 2021, 12:50:04 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CtHoadonId generated by hbm2java
 */
@Embeddable
public class CtHoadonId implements java.io.Serializable {

	private String soHoaDon;
	private String maSua;

	public CtHoadonId() {
	}

	public CtHoadonId(String soHoaDon, String maSua) {
		this.soHoaDon = soHoaDon;
		this.maSua = maSua;
	}

	@Column(name = "So_hoa_don", nullable = false, length = 5)
	public String getSoHoaDon() {
		return this.soHoaDon;
	}

	public void setSoHoaDon(String soHoaDon) {
		this.soHoaDon = soHoaDon;
	}

	@Column(name = "Ma_sua", nullable = false, length = 6)
	public String getMaSua() {
		return this.maSua;
	}

	public void setMaSua(String maSua) {
		this.maSua = maSua;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CtHoadonId))
			return false;
		CtHoadonId castOther = (CtHoadonId) other;

		return ((this.getSoHoaDon() == castOther.getSoHoaDon()) || (this.getSoHoaDon() != null
				&& castOther.getSoHoaDon() != null && this.getSoHoaDon().equals(castOther.getSoHoaDon())))
				&& ((this.getMaSua() == castOther.getMaSua()) || (this.getMaSua() != null
						&& castOther.getMaSua() != null && this.getMaSua().equals(castOther.getMaSua())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSoHoaDon() == null ? 0 : this.getSoHoaDon().hashCode());
		result = 37 * result + (getMaSua() == null ? 0 : this.getMaSua().hashCode());
		return result;
	}

}
