package com.damlademirbilek.myfirstapplication.odevlerim

fun main() {
    // 1. Sıcaklık Dönüştürme
    val converter = TemperatureConverter()
    val derece = 16.0
    val fahrenheit = converter.celsiusToFahrenheit(derece)
    println("[1] $derece derece Fahrenheit olarak: $fahrenheit")

    // 2. Dikdörtgen Çevresi
    val rectangle = Rectangle()
    val kenar1 = 15
    val kenar2 = 30
    val cevre = rectangle.dikdortgenCevresi(kenar1, kenar2)
    println("[2] Dikdörtgenin çevresi: $cevre")

    // 3. Faktöriyel Hesaplama
    val calculator = FactorialCalculator()
    val sayi = 5
    val faktoriyelSonucu = calculator.faktoriyel(sayi)
    println("[3] $sayi sayısının faktöriyeli: $faktoriyelSonucu")

    // 4. 'a' Harfi Sayma
    val analyzer = WordAnalyzer()
    val kelime = "Adana"
    val aSayisi = analyzer.aHarfiSayisi(kelime)
    println("[4] Kelime içinde $aSayisi adet 'a' harfi var.")

    // 5. İç Açı Toplamı
    val polygon = Polygon()
    val kenarSayisi = 4
    val toplamIcAcilar = polygon.icAcilarToplami(kenarSayisi)
    println("[5] $kenarSayisi kenarlı şeklin iç açılar toplamı: $toplamIcAcilar derece")

    // 6. Maaş Hesaplama
    val salaryCalculator = SalaryCalculator()
    val gunSayisi = 20
    val maas = salaryCalculator.maasHesapla(gunSayisi)
    println("[6] $gunSayisi gün çalışmanın maaşı: $maas TL")

    // 7. Kota Ücreti Hesaplama
    val dataUsage = DataUsage()
    val kota = 60
    val ucret = dataUsage.kotaUcreti(kota)
    println("[7] $kota GB kullanım için ücret: $ucret TL")
}