package com.castles.models

import com.castles.models.PhaseLetterBonus.PhaseLetterBonus


/**
  * Created by jwillis on 4/26/17.
  */
case class Phase(goodsTiles: List[Good], rounds: List[Round], phaseLetter: PhaseLetterBonus, bonusScore: Int) {
  require(goodsTiles.size <= 5, "A phase must contain five goods")
  require(rounds.size <= 5, "A phase must contain five rounds")
}
