package example.myapp.decor

data class Decoration(val rocks: String)

fun MakeDecorations(){
    val decoration1 = Decoration("granite")
    println(decoration1)
    val decoration2 = Decoration("slate")
    println(decoration2)
    val decoration3 = Decoration("slate")
    println(decoration3)
    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
}
fun main(){
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)}

enum class Color(val rg: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int){
    NORTH(0), SOUTH(180),EAST(90),WEST(270)
}
