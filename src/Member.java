public class Member {
    
    private final int MIN_PANJANG_TELEPON = 10;
    private final String AWALAN_TELEPON = "0";

    private String nama = "Member Baru";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "01-01-2026";
    private String jenisPaket = "Basic";

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Gagal: Nama tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        
        if (noTelepon != null && noTelepon.startsWith(AWALAN_TELEPON) && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println("Gagal: Nomor telepon harus diawali angka 0 dan minimal 10 digit.");
        }
    }

   
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }
}