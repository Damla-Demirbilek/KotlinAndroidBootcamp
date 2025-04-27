package com.damlademirbilek.myfirstapplication.standart_programlama

fun main() {
    val yas = 17

    if(yas >= 18) {
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz.")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if(ka == "admin" &&  s == 123456) { //&& = And(Ve), true && true ise true olur, diğer durumlarda false olur.
        println("Hoşgeldiniz.")

    }else{
        println("Hatalı giriş.")
    }
    if(sayi==9 || sayi == 10){
        println("sayi 9 veya 10 dur")
    }else{
        println("sayi 9 veya 10 değildir")
    }
    // When, Diğer dillerde Switch
    val number = 5

    when(number){
        1 -> println ("Sayı 1'dir.")
        2 -> println ("Sayı 2'dir.")
        else -> println ("Tanımlanmayan sayı")
    }
}
