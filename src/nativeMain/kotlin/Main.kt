fun main() {
    val i:Int = 1
    for(i in 1..100 step 2){
        when{
            i<50 -> println("smal ${i}")
            i>=100 -> println("BIG  ${i}")
        }
    }
}