package entity;
// Generated Oct 23, 2021, 12:50:04 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * KhachHang generated by hbm2java
 */
@Entity
@Table(name = "khach_hang", catalog = "qlbansua")
public class KhachHang implements java.io.Serializable {

	private String maKhachHang;
	private String tenKhachHang;
	private boolean phai;
	private String diaChi;
	private String dienThoai;
	private String email;
	private String password;
	private boolean enable;
	private Set<HoaDon> hoaDons = new HashSet<HoaDon>(0);
	private Set<VeryficationEmail> veryficationEmails = new HashSet<VeryficationEmail>(0);

	public KhachHang() {
	}

	public KhachHang(String maKhachHang, String tenKhachHang, boolean phai, String diaChi, String dienThoai,
			String email, String password, boolean enable) {
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.phai = phai;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.email = email;
		this.password = password;
		this.enable = enable;
	}

	public KhachHang(String maKhachHang, String tenKhachHang, boolean phai, String diaChi, String dienThoai,
			String email, String password, boolean enable, Set<HoaDon> hoaDons,
			Set<VeryficationEmail> veryficationEmails) {
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.phai = phai;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.email = email;
		this.password = password;
		this.enable = enable;
		this.hoaDons = hoaDons;
		this.veryficationEmails = veryficationEmails;
	}

	@Id

	@Column(name = "Ma_khach_hang", unique = true, nullable = false, length = 50)
	public String getMaKhachHang() {
		return this.maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	@Column(name = "Ten_khach_hang", nullable = false, length = 100)
	public String getTenKhachHang() {
		return this.tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	@Column(name = "Phai", nullable = false)
	public boolean isPhai() {
		return this.phai;
	}

	public void setPhai(boolean phai) {
		this.phai = phai;
	}

	@Column(name = "Dia_chi", nullable = false, length = 200)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "Dien_thoai", nullable = false, length = 20)
	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	@Column(name = "Email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "enable", nullable = false)
	public boolean isEnable() {
		return this.enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachHang")
	public Set<HoaDon> getHoaDons() {
		return this.hoaDons;
	}

	public void setHoaDons(Set<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachHang")
	public Set<VeryficationEmail> getVeryficationEmails() {
		return this.veryficationEmails;
	}

	public void setVeryficationEmails(Set<VeryficationEmail> veryficationEmails) {
		this.veryficationEmails = veryficationEmails;
	}

}
