public class Hero {
    private int idHero;
    private String namaHero;
    private String kategori;
    private String gender;

    public Hero(int idHero, String namaHero, String kategori, String gender) {
        this.idHero = idHero;
        this.namaHero = namaHero;
        this.kategori = kategori;
        this.gender = gender;
    }

    public int getIdHero() {
        return idHero;
    }

    public void setNamaHero(String namaHero) {
        this.namaHero = namaHero;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "ID: " + idHero + ", Nama: " + namaHero + ", Kategori: " + kategori + ", Gender: " + gender;
    }
}
