package thigk2.TranThaiGiaTrung; 
import java.util.Scanner;

public class Cau_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Nhập dữ liệu
        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();
        System.out.print("Nhập cân nặng (kg): ");
        double canNặng = sc.nextDouble();

        // b. Tính BMI và xuất kết quả
        double bmi = canNặng / (chieuCao * chieuCao);
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Tình trạng: Gầy (Underweight)");
        } else if (bmi <= 24.9) {
            System.out.println("Tình trạng: Bình thường (Normal weight)");
        } else if (bmi <= 29.9) {
            System.out.println("Tình trạng: Thừa cân (Overweight)");
        } else {
            System.out.println("Tình trạng: Béo phì (Obesity)");
        }
    }
}