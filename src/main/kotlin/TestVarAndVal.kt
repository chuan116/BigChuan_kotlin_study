import java.util.*

class VariableVSValue {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)

        var x = 5 //自动断出 int类型
        x += 1
        println("x = $x")
    }

    fun decalreVal() {
        val b = "a"
//        b="c"; //编译器自动报错  val相当于 final 不可重新赋值
        println(b)
        println(b::class)
        println(b::class.java)
        val  c:Int =1 //立即赋值
        val d =2 //自动推断出 int类型
        val e:Int //如果没有初始值 类型不能省略
        e=3//明确赋值
//        e=5  //编译报错 不能再此赋值
        println("c=$c , d = $d  , e=$e")
    }

    fun typeInference(){
        val str = "abc"
        println(str)
        println(str is String)
        println(str::class)
        println(str::class.java)

        val d  = Date()
        println(d)
        println(d is Date)
        println(d::class)
        println(d::class.java)

        val  bool  = true
        println(bool)
        println(bool::class)
        println(bool::class.java)

        var array  =  arrayOf(1,2,3)
        println(array)
        println(array is Array)
        println(array::class)
        println(array::class.java)


    }

    fun Int2Long(){
        val x:Int = 10
//        val y:Long  = x //类型不匹配
        val y:Long  = x.toLong()

        println(y);
    }

    fun getLength(obj:Any):Int?{
        var result = 0
        if (obj is String){
            //在该分支内自动转换成 String
            println("obj = [${obj}]")
            println(obj::class)
            result = obj.length
            println(result)
        }
        //在离开检测分支后 obj还是 any类型

        println(obj::class)

        return result
    }

    fun rawString(){

        val rawString = """
           fun helloWorld(val name:String){
           pringln("helloWorld1")
           }
        """
        println(rawString)

        val fooTemplateString  =  "$rawString has ${rawString.length} characters"
        println(fooTemplateString)
    }


}

fun main(args: Array<String>) {
    val sepator  =  "------@#$%%&*&@%%-------"
    var   testValue  = VariableVSValue()
    testValue  .declareVar()
    println(sepator)
    testValue.decalreVal()
    println(sepator)
    testValue.typeInference()
    println(sepator)
    testValue.Int2Long()
    println(sepator)
   val len  =  testValue.getLength("1")
}


