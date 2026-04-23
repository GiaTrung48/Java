package thigk2.TranThaiGiaTrung;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cau_3 {
    public static void main(String[] args) {
        // Ví dụ MSSV: 66134220 -> X = 0
        int X = 0; 
        String fileName = "data.txt";
        boolean timThayX = false;

        System.out.println("--- Danh sách số nguyên từ file ---");
        try {
            File myFile = new File(fileName);
            Scanner reader = new Scanner(myFile);
            
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                if (!data.trim().isEmpty()) {
                    int num = Integer.parseInt(data.trim());
                    System.out.print(num + " ");
                    
                    if (num == X) {
                        timThayX = true;
                    }
                }
            }
            reader.close();
            
            System.out.println("\n\n--- Kết quả tìm kiếm ---");
            if (timThayX) {
                System.out.println("Giá trị X (" + X + ") CÓ trong danh sách.");
            } else {
                System.out.println("Giá trị X (" + X + ") KHÔNG có trong danh sách.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file " + fileName);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: File chứa định dạng không phải số nguyên.");
        }
    }
}
