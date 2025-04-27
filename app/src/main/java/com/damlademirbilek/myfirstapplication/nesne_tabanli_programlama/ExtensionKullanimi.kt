package com.damlademirbilek.myfirstapplication.nesne_tabanli_programlama

fun main(){
    val sonuc = 5 carp 2 // 5.carp(2) infix yoksa
    println(sonuc)
}

infix fun Int.carp(sayi:Int) : Int {  //Int sınıfına carp fonksiyonu ekledik.
    return this * sayi //this(Int)
}