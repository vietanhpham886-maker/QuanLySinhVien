import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Student timKiemTheoMa(List<Student> ds, String maSV) {
        for (Student sv : ds) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Student> ds = new ArrayList<>();
        ds.add(new Student("SV001", "Nguyen Van A", "01/01/2004"));
        ds.add(new Student("SV002", "Tran Thi B", "15/05/2004"));

        for (Student sv : ds) {
            sv.hienThi();
        }

        System.out.println("--- Tim kiem SV002 ---");
        Student kq = timKiemTheoMa(ds, "SV002");
        if (kq != null) {
            kq.hienThi();
        } else {
            System.out.println("Khong tim thay sinh vien");
        }
    }
}
