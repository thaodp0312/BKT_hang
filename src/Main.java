

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nhập số hành khách");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Passenger[] psm = new Passenger[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập hành khách thứ " + (i + 1));
            Passenger x = new Passenger();
            x.input();
            psm[i] = x;

        }
        System.out.println("Danh sách khách hàng và tổng tiền: ");
        for (int x = 0; x < n; x++) {
            System.out.println(psm[x].toString());
            System.out.println("Tổng tiền: " + psm[x].tinhTongTien());
        }
        Passenger temp = new Passenger();
        for (int i = 0; i < psm.length - 1; i++) {
            for (int j = i + 1; j < psm.length; j++) {
                if (psm[i].tinhTongTien() < psm[j].tinhTongTien()) {
                    temp = psm[i];
                    psm[i] = psm[j];
                    psm[j] = temp;
                }
            }
        }
        System.out.println("Sau khi sắp xếp tổng tiền giảm dần: ");
        for (int x = 0; x < n; x++) {
            System.out.println(psm[x].toString());
            System.out.println("Tổng tiền: " + psm[x].tinhTongTien());
        }


    }
}
