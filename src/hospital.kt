open class Hospital(name: String, head:String, id: Int) {
    init {
        println("The $name department is headed by dr $head and has the id $id")

    }
}

class Dental(name: String,head: String, id: Int): Hospital(name, head, id) {

    fun dent() {
        println("")
    }
}

class Surgery(name: String,head: String, id: Int): Hospital(name, head, id) {

    fun sur() {
        println("")
    }
}

class General(name: String,head: String, id: Int): Hospital(name, head, id) {

    fun gen() {
        println("")
    }
}

fun main(args: Array<String>) {
    val d = Dental("Dental","Musyoka", 243435)
    d.dent()
    val s = Surgery("White","Macharia", 1888)
    s.sur()
    val g = General("General", "Simon", 888880)
    g.gen()
}
