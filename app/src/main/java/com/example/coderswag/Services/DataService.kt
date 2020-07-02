package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val category = listOf(
        Category("SHIRT", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$19", "hat01"),
        Product("Devslopes Hat Black", "$25", "hat02"),
        Product("Devslopes Hat white", "$18", "hat03"),
        Product("Devslopes hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$19", "hoodie01"),
        Product("Devslopes Hoodie Red", "$25", "hoodie02"),
        Product("Devslopes Gray Hoodie", "$18", "hoodie03"),
        Product("Devslopes Black Hoodie", "$22", "hoodie04")
    )

    val shirt = listOf(
        Product("Devslopes Shirt Black", "$19", "shirt01"),
        Product("Devslopes Badge Light Gray", "$25", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$18", "shirt03"),
        Product("Devslopes Hustle", "$22", "shirt04"),
        Product("Devslopes Studios", "$22", "shirt05")
    )
}