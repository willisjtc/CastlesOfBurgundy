package com.castles.models

import com.castles.models.AnimalType.AnimalType
import com.castles.models.Tile.TileType

/**
  * Created by jwillis on 4/26/17.
  */
trait Tile {
  def tileType: TileType
}
case class KnowledgeTile() extends Tile { override def tileType = Tile.Knowledge }
case class ShipTile() extends Tile { override def tileType = Tile.Ship }
case class AnimalTile(animalType: AnimalType, numAnimals: Int) extends Tile { override def tileType = Tile.Animal }
case class BuildingTile() extends Tile { override def tileType = Tile.Building }
case class CastleTile() extends Tile { override def tileType = Tile.Castle }

object Tile extends Enumeration {
  type TileType = Value

  val Knowledge = Value
  val Ship = Value
  val Animal = Value
  val Building = Value
  val Castle = Value
  val Mine = Value
}
