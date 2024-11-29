package rp.consulting.planets.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlanetListViewModel : ViewModel() {

 private   val state = MutableLiveData<State>()
    val viewState: LiveData<State>
        get() = state


    fun loadData() {

        state.value = State.Loading

       state.value = State.Content(
            listOf(PlanetData("Terra","bom lugar"),
                    PlanetData("Júpiter","bom lugar"),
                    PlanetData("Mercúrio","bom lugar"),
                    PlanetData("Urano","bom lugar"),
                    PlanetData("Netuno","bom lugar"),


                )
        )

        state.value = State.Error
    }

}

sealed class State{

    data class Content(val list: List<PlanetData>) : State()

    object Loading : State()

    object Error : State()
}