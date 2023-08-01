/*package com.example.uygulamadersi1

import java.util.Scanner

fun main(){
 var scanner = Scanner(System.`in`)
    println("isminizi giriniz:")
    var isim = scanner.next()
    println("Yaşınızı giriniz:")
    var yas = scanner.nextInt()
} */
/*fun main(){
    //Bir sayının faktöriyelini hesaplayan bir fonksiyonu nasıl oluşturursunuz?
    fun factorial(n: Int): Long {
        return if (n <= 1) {
            1
        } else {
            n * factorial(n - 1)
        }
    }

    fun main() {
        println("Faktöriyelini hesaplamak istediğiniz sayıyı girin:")
        val sayi = readLine()?.toIntOrNull()

        if (sayi != null && sayi >= 0) {
            val result = factorial(sayi)
            println("$sayi! = $sayi")
        } else {
            println("Geçerli bir pozitif tamsayı giriniz.")
        }
    }
} */
/*3Kullanıcının girdiği iki sayının toplamını, farkını, çarpımını ve bölümünü hesaplayan bir fonksiyonu nasıl yazarsınız
fun main() {
    println("Birinci sayıyı girin:")
    val sayi1 = readLine()?.toDoubleOrNull()

    println("İkinci sayıyı girin:")
    val sayi2 = readLine()?.toDoubleOrNull()

    if (sayi1 == null || sayi2 == null) {
        println("Geçersiz giriş")
        return
    }

    println("Toplam: ${topla(sayi1, sayi2)}")
    println("Fark: ${cikar(sayi1, sayi2)}")
    println("Çarpım: ${carp(sayi1, sayi2)}")
    if (sayi2 == 0.0) {
        println("Bir sayıyı 0'a bölemezsiniz!")
    } else {
        println("Bölüm: ${bol(sayi1, sayi2)}")
    }
}

fun topla(sayi1: Double, sayi2: Double): Double {
    return sayi1 + sayi2
}

fun cikar(sayi1: Double, sayi2: Double): Double {
    return sayi1 - sayi2
}

fun carp(sayi1: Double, sayi2: Double): Double {
    return sayi1 * sayi2
}

fun bol(sayi1: Double, sayi2: Double): Double {
    if (sayi2 == 0.0) {
        throw IllegalArgumentException("Bir sayıyı 0'a bölemezsiniz!")
    }
    return sayi1 / sayi2
}








4-4) Bir metinde çift tırnak işaretini nasıl kullanırsınız? Örnek bir program yazın
fun main() {
    val metin = " \"Kotlin\" dersine hoş geldiniz."
    println(metin)
}







5) Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf olduğunu ekrana yazdıran bir programı nasıl yazarsınız?

fun main() {
    println("Lütfen bir harf giriniz:")
    val harf = readLine()?.getOrNull(0)

    if (harf == null || !harf.isLetter()) {
        println("Geçersiz")
    } else if (harf in listOf('a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü')) {
        println("Sesli Harf")
    } else {
        println("Sessiz Harf")
    }
}

7) Bir kullanıcının sınav notuna göre, eğer notu 70 ve üzeriyse "Geçtiniz", aksi halde "Kaldınız" mesajını veren bir programı nasıl yazarsınız?
fun main(){
    var scanner = Scanner(System.`in`)
    println("Lütfen notunuzu giriniz")
    var not = scanner.next
    if (not >=70){
        println("Geçtiniz")
    } else {
        println("Kaldınız")
    }


}

8) Kullanıcının girdiği bir sayıyı ondalıklı sayıya dönüştüren bir programı nasıl yazarsınız?

fun main(){
    var scanner = Scanner(System.`in`)
    println("Sayı giriniz:")

}
*/

