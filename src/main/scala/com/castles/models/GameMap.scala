package com.castles.models

/**
  * Created by jwillis on 4/26/17.
  */
case class GameMap(tiles: Map[(Int, Int), TileSpace]) {


}

object GameMap {
  def map1 = {
    GameMap(loadMap("""

            """))
  }

  def map6 = {
    GameMap(loadMap("""
               K6 K5 C4 S3
              K2 B1 B6 S5 B4
             F5 F4 M3 S1 B2 B3
            K6 B1 B2 C6 S5 B4 B1
             K2 B5 B4 M3 S1 B2
              K6 M1 F2 F5 S6
               C3 F4 F1 C3
            """))
  }

  private def loadMap(serializedMap: String) = {
    serializedMap.trim().split("\n").zipWithIndex.flatMap(lineIndex => {
      createMapRow(lineIndex._2, lineIndex._1)
    }).reduce(_ ++ _)
  }

  def createMapRow(row: Int, encodedTileSpaceLine: String) = {
    encodedTileSpaceLine.trim().split(" ").zipWithIndex.map(tileSpaceIndex => {
      Map((row, tileSpaceIndex._2) -> decodeTileSpace(tileSpaceIndex._1))
    })
  }

  def decodeTileSpace(tileSpace: String) = {
    tileSpace.charAt(0) match {
      case 'K' => TileSpace(None, Tile.Knowledge, tileSpace.charAt(1).asDigit)
      case 'C' => TileSpace(None, Tile.Castle, tileSpace.charAt(1).asDigit)
      case 'S' => TileSpace(None, Tile.Ship, tileSpace.charAt(1).asDigit)
      case 'B' => TileSpace(None, Tile.Building, tileSpace.charAt(1).asDigit)
      case 'F' => TileSpace(None, Tile.Animal, tileSpace.charAt(1).asDigit)
      case 'M' => TileSpace(None, Tile.Mine, tileSpace.charAt(1).asDigit)
      case '_' => throw new IllegalArgumentException(s"Invalid tile entry ${tileSpace.charAt(0)}")
    }
  }

}
