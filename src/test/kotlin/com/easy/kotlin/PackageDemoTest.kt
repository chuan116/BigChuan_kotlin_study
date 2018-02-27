package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import what
import  MotorBike

@RunWith(JUnit4::class)
 class PackageDemoTest {
    @Test
    fun testWhat() {
        what()
    }

    @Test
    fun testDriveMobileBike() {
        val  mobileBike  = MotorBike()
        mobileBike.drive()
    }
}