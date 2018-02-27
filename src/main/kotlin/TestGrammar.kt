

class Outer{
       val  oh  = "oh!"
        inner class  Inner{
            fun m(){
                val outer =this@Outer
                val inner = this@Inner
                val pthis  = this
                println("outer="+outer)
                println("inner="+inner)
                println("pthis="+pthis)
                val fun1 = hello@ fun String.() {
                    val d1 = this // fun1 的接收者
                    println("d1" + d1)
                }
                val fun2 = { s: String ->
                    val d2 = this
                    println("d2=" + d2)
                }
                "abc".fun1()

            }
        }
}

val <T>List<T>.lastIndex: Int get() = size - 1
fun String.notEmpty(): Boolean {
    return !this.isEmpty()
}
fun MutableList<Int>.swap(index1: Int, index2: Int) {

    val tmp = this[index1] // this对应该列表m

    this[index1] = this[index2]

    this[index2] = tmp

}

fun <T>MutableList<T>.mswap(index1: Int, index2: Int) {

    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]

    this[index2] = tmp

}

class ExtensionsDemo {
    fun useExtensions() {
        val a = "abc"
        println(a.notEmpty())//true
        val mList = mutableListOf<Int>(1, 2, 3, 4, 5)
        println("Before Swap:")
        println(mList)//[1, 2, 3, 4, 5]
        mList.swap(0, mList.size - 1)
        println("After Swap:")
        println(mList)//[5, 2, 3, 4, 1]
        val mmList = mutableListOf<String>("a12", "b34", "c56", "d78")
        println("Before Swap:")
        println(mmList)//[a12, b34, c56, d78]
        mmList.mswap(1, 2)
        println("After Swap:")
        println(mmList)//[a12, c56, b34, d78]
        val mmmList = mutableListOf<Int>(100, 200, 300, 400, 500)
        println("Before Swap:")
        println(mmmList)
        mmmList.mswap(0, mmmList.lastIndex)
        println("After Swap:")
        println(mmmList)
    }
}


fun main(args: Array<String>) {
    ExtensionsDemo().useExtensions()
}