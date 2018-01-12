package com.solstice.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.solstice.kotlin.controller", "com.solstice.kotlin.repositories", "com.solstice.kotlin.services")
class KotlinExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinExampleApplication::class.java, *args)
}
