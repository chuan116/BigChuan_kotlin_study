  class testNull{
      fun testNull(){
          var a  = "abc"
          var one   =1
          var c:String? ="12312"
          c = null
          println(c?.length)
          c!!.length //产生null pointer exception
      }
 }
  fun main(args: Array<String>) {
      testNull().testNull()
  }