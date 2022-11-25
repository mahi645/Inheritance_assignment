package com.axis.database

import com.axis.modal.Wrestler

class WrestlerDb {
    var wrestler=mutableListOf<Wrestler>()
    init{
        wrestler.add(Wrestler("karna",45,5.5f,70.0))
        wrestler.add(Wrestler("raju",30,5.8f,203.0))
        wrestler.add(Wrestler("rahim",23,6.0f,88.0))

    }
    fun wrestler1():MutableList<Wrestler>{
        return wrestler
    }
}