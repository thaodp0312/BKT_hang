import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Ticket {

    private String tenChuyen;
    private LocalDateTime ngayBay;
    private int giaVe;

    public Ticket(String tenChuyen, LocalDateTime ngayBay, int giaVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    public Ticket() {
    }

    void input() {

        System.out.println("Nhập thông tin vé ");
        System.out.println("Tên chuyến");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        System.out.println("ngày bay");
        String j = sc.nextLine();

        LocalDateTime dt = LocalDateTime.parse(j);
        System.out.println("Giá vé");

        int x = sc.nextInt();
        this.tenChuyen = i;
        this.giaVe = x;
        this.ngayBay = dt;

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tenChuyen='" + tenChuyen + '\'' +
                ", ngayBay=" + ngayBay +
                ", giaVe=" + giaVe +
                '}';
    }

    public String getTenChuyen() {
        return tenChuyen;
    }

    public void setTenChuyen(String tenChuyen) {
        this.tenChuyen = tenChuyen;
    }

    public LocalDateTime getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(LocalDateTime ngayBay) {
        this.ngayBay = ngayBay;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

}
