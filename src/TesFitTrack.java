public class TesFitTrack {
    public static void main(String[] args) {
        
        Member[] daftarMember = new Member[4];

        System.out.println("=== UJI COBA PEMBUATAN OBJEK ===");
        
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "22-10-2026", "VIP");
        
        daftarMember[1] = new Member("Andi Wijaya", "085712345678", "22-10-2026", "Premium");
        
        // Objek 3: Dibuat lewat constructor tanpa paket (otomatis menjadi Basic)
        daftarMember[2] = new Member("Siti Aminah", "081987654321", "22-10-2026");
        
        // Objek 4: Sengaja masukkan data yang melanggar validasi (nomor pendek dan paket salah)
        System.out.println("-> Percobaan input data melanggar validasi saat buat objek:");
        daftarMember[3] = new Member("Dodi", "081", "22-10-2026", "Super");
        
        System.out.println("\n=== UJI COBA SETTER TIDAK VALID PADA OBJEK JADI ===");
        // Panggil salah satu setter dengan nilai tidak valid pada objek yang sudah jadi
        System.out.println("-> Mencoba ganti nomor telepon Budi jadi 089:");
        daftarMember[0].setNoTelepon("089"); 
        
        System.out.println("\n=== CETAK SELURUH DATA MEMBER DARI ARRAY ===");
        // Cetak semua objek Member dari array memakai perulangan for dan toString()
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(daftarMember[i].toString());
        }
    }
}