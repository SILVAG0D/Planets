package rp.consulting.planets.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun loadData() : State{
        return State.Content(
            listOf(PlanetData("Terra","bom lugar"),
                    PlanetData("Júpiter","bom lugar"),
                    PlanetData("Mercúrio","bom lugar"),
                    PlanetData("Urano","bom lugar"),
                    PlanetData("Netuno","bom lugar"),


                )
        )
    }

}

sealed class State{

    data class Content(val list: List<PlanetData>) : State()

    object Loading : State()

    object Error : State()
}