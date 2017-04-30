package com.castles.models

import com.castles.models.Tile.TileType


/**
  * Created by jwillis on 4/27/17.
  */
case class Depot(tiles: List[Tile], tileType: TileType, goods: List[Good], diceValue: Int)
