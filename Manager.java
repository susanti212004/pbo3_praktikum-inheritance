class Pegawai {
    public String nama;
    public double gaji;   
}

public class Manager extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d) {
        nama = n;
        departemen = d;
    }
}