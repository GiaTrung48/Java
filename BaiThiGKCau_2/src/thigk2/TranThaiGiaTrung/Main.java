package thigk2.TranThaiGiaTrung;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 1. Hard-code 3 sinh viên
        dsSV.add(new SinhVien("SV001", "Nguyễn Văn An", 2002, "CNTT"));
        dsSV.add(new SinhVien("SV002", "Lê Thị Bình", 2005, "Kế toán"));
        dsSV.add(new SinhVien("SV003", "Trần Văn Cường", 2003, "Du lịch"));

        System.out.println("--- Danh sách 3 sinh viên ban đầu ---");
        for (SinhVien sv : dsSV) System.out.println(sv);

        // 2. Thêm mới sinh viên từ bàn phím
        System.out.println("\n--- Nhập thông tin sinh viên mới ---");
        System.out.print("Mã số SV: "); String ma = sc.nextLine();
        System.out.print("Họ và tên: "); String ten = sc.nextLine();
        System.out.print("Năm sinh: "); int nam = sc.nextInt();
        sc.nextLine(); // Xóa bộ đệm
        System.out.print("Chuyên ngành: "); String nganh = sc.nextLine();
        
        dsSV.add(new SinhVien(ma, ten, nam, nganh));

        // 3. In lại toàn bộ danh sách
        System.out.println("\n--- Danh sách sau khi cập nhật ---");
        for (SinhVien sv : dsSV) System.out.println(sv);

        // 4. In sinh viên lớn hơn 20 tuổi
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("\n--- Danh sách sinh viên > 20 tuổi ---");
        for (SinhVien sv : dsSV) {
            if (namHienTai - sv.getNamSinh() > 20) {
                System.out.println(sv);
            }
        }
    }
}
