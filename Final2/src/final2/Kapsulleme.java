
package final2;

public class Kapsulleme {
    //private türünde ad soyad ve yas tanımlama
     private String ad; 
    private String soyad;
    private int yas;
//Kapsulleme metotu ile yukardaki değişkenleri okutma ve yazdırma işlemleri 
    public Kapsulleme(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
//girilen değerleri yazdırma işlemi
    public void yazdir() {
        System.out.println("Adınız: " + this.ad);
        System.out.println("Soyadınız: " + this.soyad);
        System.out.println("Yaşınız: " + this.yas);
    }
    
}
