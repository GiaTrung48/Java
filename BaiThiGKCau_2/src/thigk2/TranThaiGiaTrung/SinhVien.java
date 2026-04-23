package thigk2.TranThaiGiaTrung;

	class SinhVien {
	    private String maSV;
	    private String hoTen;
	    private int namSinh;
	    private String chuyenNganh; // Thuộc tính thứ 4 tự chọn
	
	    // Constructor đầy đủ tham số
	    public SinhVien(String maSV, String hoTen, int namSinh, String chuyenNganh) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.namSinh = namSinh;
	        this.chuyenNganh = chuyenNganh;
	    }
	
	    // Getters và Setters
	    public String getMaSV() { return maSV; }
	    public void setMaSV(String maSV) { this.maSV = maSV; }
	
	    public String getHoTen() { return hoTen; }
	    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
	
	    public int getNamSinh() { return namSinh; }
	    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }
	
	    public String getChuyenNganh() { return chuyenNganh; }
	    public void setChuyenNganh(String chuyenNganh) { this.chuyenNganh = chuyenNganh; }
	
	    @Override
	    public String toString() {
	        return String.format("MSSV: %s | Họ tên: %-20s | Năm sinh: %d | Ngành: %s", 
	                              maSV, hoTen, namSinh, chuyenNganh);
	    }
	}

