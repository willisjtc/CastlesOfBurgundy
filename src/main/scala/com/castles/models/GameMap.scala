package com.castles.models

/**
  * Created by jwillis on 4/26/17.
  */
case class GameMap(tiles: Map[(Int, Int), TileSpace]) {


}

object GameMap {
  def map1 = {
    loadMap("""
               
            """)
  }

  def map6 = {
    loadMap("""
               K6 K5 C4 S3
              K2 B1 B6 S5 B4
             F5 F4 M3 S1 B2 B3
            K6 B1 B2 C6 S5 B4 B1
             K2 B5 B4 M3 S1 B2
              K6 M1 F2 F5 S6
               C3 F4 F1 C3
            """)
  }

  private def loadMap(serializedMap: String) = {
    serializedMap.split("\n").toList.flatMap(line => {
      line.split(" ").toList.map(tileSpace => {

      })
    })
  }

  private def deserializeTileSpace(tileSpace: String) = tileSpace.charAt(0) match {
    case 'K' => TileSpace(None, Tile.Knowledge, tileSpace.charAt(1).toInt)
    case 'C' => TileSpace(None, Tile.Castle, tileSpace.charAt(1).toInt)
    case 'S' => TileSpace(None, Tile.Ship, tileSpace.charAt(1).toInt)
    case 'B' => TileSpace(None, Tile.Building, tileSpace.charAt(1).toInt)
    case 'F' => TileSpace(None, Tile.Animal, tileSpace.charAt(1).toInt)
    case 'M' => TileSpace(None, Tile.Mine, tileSpace.charAt(1).toInt)
    case '_' => throw new IllegalArgumentException(s"Invalid tile entry ${tileSpace.charAt(0)}")
  }

}
