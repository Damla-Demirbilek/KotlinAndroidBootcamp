package com.damlademirbilek.myfirstapplication.odevlerim

class TemperatureConverter {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }
}

// 2. Dikdörtgen Çevresi
class Rectangle {
    fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
        return 2 * (kenar1 + kenar2)
    }
}

// 3. Faktöriyel Hesaplayıcı
class FactorialCalculator {
    fun faktoriyel(sayi: Int): Long {
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }
}

// 4. 'a' Harfi Sayacı
class WordAnalyzer {
    fun aHarfiSayisi(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }
}

// 5. İç Açı Toplamı Hesaplayıcı
class Polygon {
    fun icAcilarToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }
}

// 6. Maaş Hesaplayıcı
class SalaryCalculator {
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            (160 * 10) + (mesaiSaat * 20)
        }
    }
}

// 7. Kota Ücreti Hesaplayıcı
class DataUsage {
    fun kotaUcreti(kotaGB: Int): Int {
        return if (kotaGB <= 50) {
            100
        } else {
            val asim = kotaGB - 50
            100 + (asim * 4)
        }
    }
}