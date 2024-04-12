package com.example.first_compose_app.presentation.data

import com.example.first_compose_app.presentation.composable_ui.model.Proverbs

class ProverbsProvider {
    private val proverbs = listOf(
        Proverbs("Más vale tarde que nunca.","DB"),
        Proverbs("No dejes para mañana lo que puedas hacer hoy.","DB"),
        Proverbs("El que mucho abarca, poco aprieta","DB"),
        Proverbs("Camarón que se duerme se lo lleva la corriente","DB"),
        Proverbs("En boca cerrada no entran moscas.","DB"),
        Proverbs("No hay mal que por bien no venga.","DB")
    )

    fun retrieveProverbs():List<Proverbs> = proverbs
}