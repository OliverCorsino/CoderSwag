package com.olivercorsino.coderswag.services

import com.olivercorsino.coderswag.models.Category
import com.olivercorsino.coderswag.models.Product

object DataService {

    val categories = listOf(
            Category("Shirts", "shirtimage"),
            Category("Hoodies", "hoodieimage"),
            Category("Hats", "hatimage"),
            Category("Digital", "digitalgoodsimage")
    )

    val products = listOf(
        Product("Devlopes Graphic Beanie", "$18", "hat1"),
        Product("Devlopes Hat Black", "$20", "hat2"),
        Product("Devlopes Hat White", "$18", "hat3"),
        Product("Devlopes Hat Snapback", "$18", "hat1")
    )

    val hoodies = listOf(
        Product("Devlopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devlopes Hoodie Red", "$32", "hoodie2"),
        Product("Devlopes Gray Hoodie", "$28", "hoodie3"),
        Product("Devlopes Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devlopes Shirt Black", "$18", "shirt1"),
        Product("Devlopes Badge Ligth Gray", "$20", "shirt2"),
        Product("Devlopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devlopes Hustle", "$22", "shirt4"),
        Product("DKickflip", "$18", "shirt5")
    )
}