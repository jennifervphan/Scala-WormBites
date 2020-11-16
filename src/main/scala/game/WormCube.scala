package game

import org.scalajs.dom.CanvasRenderingContext2D

class WormCube (x: Int, y: Int) {
  def draw(ctx: CanvasRenderingContext2D): Unit = {
    ctx.lineWidth = 2
    ctx.fillStyle = "#B0762A"
    ctx.strokeStyle = "#734508"

    ctx.fillRect(15 * x, 15 * y, 15, 15)
    ctx.strokeRect(15 * x, 15 * y, 15, 15)
  }

  def getX() : Int = {
    return x
  }

  def getY() : Int = {
    return y
  }
}
