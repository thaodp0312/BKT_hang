import java.util.Arrays;
import java.util.Scanner;

public class Passenger {
    private String hoTen;
    private boolean gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;

    public Passenger(String hoTen, boolean gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Passenger() {
    }

    void input() {
        System.out.println("Nhập tên");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        this.hoTen = i;
        System.out.println("Nhập giới tính");

        boolean j = sc.nextBoolean();
        this.gioiTinh = j;

        System.out.println("Nhập tuổi");
        int k = sc.nextInt();
        this.tuoi = k;
        System.out.println("Nhập số vé hành khách  có");
        int x = sc.nextInt();
        Ticket[] tk = new Ticket[x];
        for (int n = 0; n < x; n++) {
            System.out.println("Nhập vé thứ " + n);
            Ticket t = new Ticket();
            t.input();
            tk[n] = t;
        }
        this.danhSachVe = tk;
    }

    int tinhTongTien() {
        int tong = 0;
        for (int x = 0; x < this.danhSachVe.length; x++) {
            tong = tong + this.danhSachVe[x].getGiaVe();
        }
        return tong;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tuoi=" + tuoi +
                ", danhSachVe=" + Arrays.toString(danhSachVe) +
                '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Ticket[] getDanhSachVe() {
        return danhSachVe;
    }

    public void setDanhSachVe(Ticket[] danhSachVe) {
        this.danhSachVe = danhSachVe;
    }
}
