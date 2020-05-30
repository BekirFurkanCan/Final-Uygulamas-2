// Kapsülleme işlemi yaparak ad soyad ve yaş bilgilerini gösteren prog

package final2;

public class Final2 {

    
    public static void main(String[] args) {
        Kapsulleme k = new Kapsulleme("Ahmet", "Yılmaz", 25); //nesne oluşturma ve değerleri atama
        k.yazdir();
        k.setAd("Furkan");//ekrana yazdırmak için yazdırma
        k.setSoyad("Can");//ekrana yazdırmak için yazdırma
        k.setYas(20);
        k.yazdir();
    }
    
}
