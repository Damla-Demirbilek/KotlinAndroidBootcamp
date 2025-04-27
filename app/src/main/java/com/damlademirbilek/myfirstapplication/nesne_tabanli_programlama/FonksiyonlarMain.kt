package com.damlademirbilek.myfirstapplication.nesne_tabanli_programlama

fun main(){
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Toprak")

    f.topla(10,20,"Damla")
}