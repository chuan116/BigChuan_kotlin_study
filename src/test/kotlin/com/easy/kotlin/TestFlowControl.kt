package com.easy.kotlin

import java.lang.Integer.parseInt


fun main(args: Array<String>) {
//    println(max3(3, 2))

//    case("1");

//    testFor()

//    println(sum(1,2))
//    println(sumf(1,2).invoke())

//    returnDemo_3()
//    returnDemo_4()
//    breakDemo_1()
    breakDemo_3()
}






fun max(a: Int, b: Int): Int {
    //作为表达式
    val max = if (a > b) a else b
    return max

}

fun max1(a: Int, b: Int): Int {
    var max1 = a
    if (a < b) {
        max1 = b
    }
    return max1
}

fun max2(a: Int, b: Int): Int {
    var max2 = a;
    if (a > b) {
        max2 = a

    } else {
        max2 = b;
    }
    return max2;

}

fun max3(a: Int, b: Int): Int {
    var max3 = if (a > b) {
        println("a is max")
        a
    } else {
        println("b is max")
        b
    }

    return max3
}

fun case(obj: Any) {
    when (obj) {
        1 -> println("第一项")
        "hello" -> println("这是一个 hello字符串")
        is Long -> println("这是一个long类型数据")
        !is String -> println("这不是一个Strig类型的数据")
        else -> println("else 类似于java中的 default")
    }

}


fun switch(x:Int){
    var s  = "123"
    when (x) {
        -1, 0 -> println("x==-1 or  x==0")
        1 -> println("x==1")
        2 -> println("x==2")
        parseInt(s) -> println("x is 123")
        else ->{
            println("x is neither 1 ner 2 nor -1 nor 0 ")
        }

    }

}

fun switch(x:Any){
    val x  =1
    val  validNumbers  = arrayOf(1,2,3);
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is  in the valid")
        !in 10..20 -> println("x is outside the range")
        else -> print("none of the above")

    }

}

/***
 * for 循环
 */


fun testFor(){
    var  list_numbers  = arrayListOf<String>()
    list_numbers.add("1")
    list_numbers.add("2")
    list_numbers.add("3")
    list_numbers.add("4")

    for (item in list_numbers) {
        println(item)
    }

}


fun sum(a: Int,b: Int) = a + b

fun sumf(a: Int,b: Int) = {a+b}


fun returnDemo_3() {
    println(" START " + ::returnDemo_3.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach here@{
        if(it  == 3 ){
            return@here
        }
        println(it)
    }
    println(" End " + ::returnDemo_3.name)
}


fun returnDemo_4() {

    println(" START " + ::returnDemo_4.name)

    val intArray = intArrayOf(1, 2, 3, 4, 5)

    intArray.forEach {
        if (it == 3) return@forEach
        println(it)
    }

    for (i in intArray) {
        here@
        if (i ==3) return@here
        println(i)
    }

    println(" End " + ::returnDemo_4.name)
}

fun returnDemo_1() {

    println(" START " + ::returnDemo_1.name)

    val intArray = intArrayOf(1, 2, 3, 4, 5)

    intArray.forEach {

        if (it == 3) return

        println(it)

    }

    println(" END " + ::returnDemo_1.name)

}


fun breakDemo_1() {

    println("--------------- breakDemo_1 ---------------")

    for (outer in 1..5) {

        println("outerr=" + outer)

        for (inner in 1..10) {

            println("inner=" + inner)

            if (inner % 2 == 0) {

                break

            }

        }

    }

}

fun breakDemo_3() {
    println("--------------- breakDemo_3 ---------------")
    for (outer in 1..5)
        inner@ for (inner in 1..10) {
        println("inner=" + inner)
        println("outer=" + outer)
        if (inner % 2 == 0) {
            break@inner
        }
    }
}


