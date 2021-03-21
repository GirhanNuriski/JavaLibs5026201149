import javax.swing.*;

public class JavaLibs5026201149 {
    public static void main(String[] args) {
        String Opening, userName, userKritik, userSaran, namaMinuman, userRekom;
        int ratingPlace, ratingDrink, userAge, ratingPelayanan, jumlahMinuman;
        int hargaMinuman = 15000;
        double pajakMinuman = 0.1;
        double rekomHarga, hargaSebelumPajak, hargaSetelahPajak;



        //opening
        JOptionPane.showMessageDialog(null, "Selamat datang, di kalkulator sederhana dan survey kepuasan kedai kopi kami!");
        //opening

        //survey penilaian
        userName = JOptionPane.showInputDialog("Sebutkan nama anda?");
        userAge = Integer.parseInt(JOptionPane.showInputDialog("Halo " +userName +", berapa umur kamu?"));
        userRekom = JOptionPane.showInputDialog("Darimana mendapat info tentang kedai kopi kami?");
        ratingPlace = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa penilaian anda tentang tempat kami? (1-10)"));
        ratingPelayanan = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa penilaian anda tentang pelayanan kami? (1-10)"));
        ratingDrink = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa penilaian anda tentang minuman kami? (1-10)"));
        rekomHarga = Double.parseDouble(JOptionPane.showInputDialog(null,"Menurut anda, berapa kira-kira harga yang normal untuk 1 pcs minuman?"));
        userKritik = JOptionPane.showInputDialog("Berikan kritik anda untuk kedai kopi kami!");
        userSaran = JOptionPane.showInputDialog("Berikan saran anda untuk kedai kopi kami!");
        JOptionPane.showMessageDialog(null, "Terimakasih atas masukan anda, " +userName +"!");
        //survey penilaian

        //kalkulator sederhana
        JOptionPane.showMessageDialog(null,"Kita beralih ke kalkulator sederhana ya, " +userName +"!");
        namaMinuman = JOptionPane.showInputDialog("Sebutkan nama minuman yang anda beli?");
        jumlahMinuman = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah minuman yang anda beli?"));
        hargaSebelumPajak = (hargaMinuman * jumlahMinuman);
        hargaSetelahPajak = (hargaSebelumPajak + hargaSebelumPajak * pajakMinuman);
        JOptionPane.showMessageDialog(null, "Pesanan anda adalah " +namaMinuman +" " +jumlahMinuman);
        JOptionPane.showMessageDialog(null, "Total harga yang harus dibayar adalah " +"Rp. " +hargaSetelahPajak);
        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan kalkulator kami, " +userName +"!" +" Ditunggu kedatangannya kembali!");
        //kalkulator sederhana

        //ringkasan cerita
        JOptionPane.showMessageDialog(null, "Ini adalah survey kepuasan dan kalkulator yang disediakan oleh" +
                " kedai kopi. " +userName +" berumur " +userAge +" tahun. " +userName +" mendapat informasi kedai kopi ini dari " +
                userRekom +".\n" +userName +" telah mengisi survey nilai tempat, pelayanan, dan minum dengan nilai " +ratingPlace +", " +
                ratingPelayanan +", " +ratingDrink +". " +userName +" memberi saran yaitu " +userSaran +" dan memberi kritik yaitu " +
                userKritik +".\n" +"Menurut " +userName +", harga kira-kira yang normal untuk satu minuman yaitu Rp." +rekomHarga +". " +
                "Lalu, " +userName +" memesan " +jumlahMinuman +" " +namaMinuman +". " +userName +" harus membayar Rp." +hargaSetelahPajak +".\nTerimakasih banyak telah mengisi!");
        //ringkasan cerita
    }
}
