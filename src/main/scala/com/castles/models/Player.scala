package com.castles.models

/**
  * Created by jwillis on 4/26/17.
  */
case class Player(map: Map,
                  workerTiles: Int,
                  silverlings: Int,
                  goods: List[Good],
                  storageTiles: List[Tile],
                  soldGoods: List[Good]) {
  require(storageTiles.size <= 3, "User can have no more than 3 storage tiles.")
  require(hasValidGoods(goods), "Player can only have three different types of goods in the goods storage spaces")

  private def hasValidGoods(goods: List[Good]) = {
    goods.groupBy({ good =>
      good.diceColorValue
    }).size <= 3
  }
}
