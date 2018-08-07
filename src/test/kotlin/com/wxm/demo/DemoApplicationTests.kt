package com.wxm.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

import org.assertj.core.api.Assertions.*

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserVehicleControllerTests {
    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    @Throws(Exception::class)
    fun testSayHelloWorld() {
        restTemplate.getForObject("/", String::class.java).let {
            assertThat(it).containsSequence("Hello here")
        }
    }

    @Test
    @Throws(Exception::class)
    fun testSayHelloUsr() {
        restTemplate.getForObject("/greeting", String::class.java).let {
            assertThat(it).containsSequence("Hello")
        }
    }
}

