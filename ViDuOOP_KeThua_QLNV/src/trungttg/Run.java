package trungttg;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("NV001","Phan Lập Công",2500000);
		System.out.print(nv1);		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("NV002", "Nguyễn Văn A", 2000000, 3, 200000);
		System.out.print("\n" +nvVanPhong1);
	}

}
