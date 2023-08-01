package com.example.uygulamadersi

/*Bir "Dikdörtgen" adlı sınıf oluşturun ve uzunluk ve genişlik gibi özellikleri içeren özellikleri tanımlayın. Ardından, bu sınıftan bir dikdörtgen nesnesi
oluşturun ve dikdörtgenin alanını ve çevresini hesaplayan bir fonksiyon yazın.



class Dikdortgen(val uzunluk: Int, val genislik: Int) {

    fun alan(): Int {
        return uzunluk * genislik
    }

    fun cevre(): Int {
        return 2 * (uzunluk + genislik)
    }
}

fun main() {

    val dikdortgen = Dikdortgen(8, 5)


    val alan = dikdortgen.alan()
    val cevre = dikdortgen.cevre()

    println("Dikdörtgenin Alanı: $alan")
    println("Dikdörtgenin Çevresi: $cevre")
}
*/
/*"Arac" adlı bir üst sınıf oluşturun ve bu sınıfta araçların hızı ve yakıt tüketimi gibi özellikleri tanımlayın. Ardından "Otomobil" adlı bir alt sınıf
oluşturun ve bu sınıfta otomobil türüne özgü özellikleri ekleyin. "Otomobil" sınıfı "Arac" sınıfından kalıtım almalıdır. Otomobil sınıfında "bagajHacmi"
adlı bir özelliği ve "bagajAc" adlı bir metodu ekleyin.

// Arac class
open class Arac(val speed: Int, val fuelConsumption: Double) {
    fun printInfo() {
        println("Hiz: $speed km/h")
        println("Yakit Tüketimi: $fuelConsumption L/100km")
    }
}

// Otomobil class
class Otomobil(speed: Int, fuelConsumption: Double, val trunkVolume: Double) : Arac(speed, fuelConsumption) {
    fun openTrunk() {
        println("Bagaj Açıldı.")
    }
}

fun main() {
    val Otomobil = Otomobil(180, 7.5, 500.0)

    // Arac sınıfından gelen bilgiler
    Otomobil.printInfo()

    // Otomobil sınıfına özgü özellik
    println("Bagaj Hacmi: ${Otomobil.trunkVolume} litre")

    // Otomobil sınıfına özgü metod
    Otomobil.openTrunk()
}
*/
/*Bir string içindeki tüm sesli harfleri kaldıran bir fonksiyon yazın. Fonksiyon, kullanıcıdan alınan bir string içindeki tüm sesli harfleri kaldırarak
yeni bir string döndürmelidir.



fun SesliHarfleriYokEt(metin: String): String {
    // Sesli harfleri içeren bir string
    val sesliHarfler = "aeiouAEIOU"

    // Sonuç stringini oluşturmak için StringBuilder kullanıyoruz
    val sonucStringBuilder = StringBuilder()

    // Girdi stringindeki her bir karakteri dolaşan bir for döngüsü
    for (karakter in metin) {
        // Eğer karakter sesli harfler içinde değilse, sonuç stringine ekle
        if (karakter !in sesliHarfler) {
            sonucStringBuilder.append(karakter)
        }
    }

    // Sonuç stringini döndür
    return sonucStringBuilder.toString()
}

fun main() {
    // Kullanıcıdan alınan metin
    val kullaniciGirdisi = "Merhaba Dünya! Bu bir örnek cümle."

    // Kullanıcıdan alınan metindeki sesli harfler çıkarılarak yeni bir metin oluştur
    val sonucMetin = SesliHarflerİYokEt(kullaniciGirdisi)

    // Sonucu ekrana yazdır
    println("Sesli harfler çıkarıldıktan sonra metin: $sonucMetin")
}
*/
/*Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin. Ardından, listedeki sayıları toplayan bir fonksiyon
yazın ve sonucu ekrana yazdırın



import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var sayilar = ArrayList<Int>()
    for(j in 1..5){
        println("Sayı giriniz: ")
        var sayi = scanner.nextInt()
        sayilar.add(sayi)
    }
    var sonuc = elemanlarinToplami(sayilar)
    println("Sayıların Toplamı = $sonuc")

}
fun elemanlarinToplami(elemanlar: ArrayList<Int>): Int {
    var sonuc = 0
    for (sayi in elemanlar) {
        sonuc += sayi
    }
    return sonuc
}  */


/*Bir String türünde ArrayList oluşturun ve içine "ahmet", "mehmet", "ayşe", "feyza", "emir" gibi isimleri ekleyin. Kullanıcıdan alınan bir indeks
 numarasına göre listedeki ismi güncelleyen bir fonksiyon yazın. Yani kullanıcı, "ahmet" isminin indeksini ve yeni ismi (örn. "ali") girerek listedeki
 "ahmet" ismini "ali" olarak değiştirebilsin.
 */


fun main() {
    val isimlerListesi = arrayListOf("Ahmet", "Mehmet", "Ayşe", "Feyza", "Emir")
    println("İsimler listesi: $isimlerListesi")

    println("Değiştirmek istediğiniz ismin indeksini girin: ")
    val indeks = readLine()?.toIntOrNull()

    if (indeks != null && indeks >= 0 && indeks < isimlerListesi.size) {
        println("Yeni ismi girin: ")
        val yeniIsim = readLine()

        if (!yeniIsim.isNullOrEmpty()) {
            isimlerListesi[indeks] = yeniIsim
            println("Yeni liste: $isimlerListesi")
        } else {
            println("Yeni isim boş olamaz.")
        }
    } else {
        println("İndeks numarası hatalı.")
    }
}
