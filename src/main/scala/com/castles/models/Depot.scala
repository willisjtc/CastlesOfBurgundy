package com.castles.models

import com.castles.models.DepotType.DepotType
import com.castles.models.PhaseLetterBonus.PhaseLetterBonus

/**
  * Created by jwillis on 4/27/17.
  */
case class Depot(tiles: List[Tile], goods: List[Good], depotType: DepotType, phaseLetterBonus: PhaseLetterBonus, diceValue: Int)
