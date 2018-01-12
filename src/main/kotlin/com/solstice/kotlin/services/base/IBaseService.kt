package com.solstice.kotlin.services.base

import org.springframework.data.domain.Example
import org.springframework.data.domain.Sort

interface IBaseService<T> {
    fun findAll(): List<T>

    fun save(var1: T): T

    fun update(var1: T): T

    fun delete(var1: T)

    fun delete(var1: Long)

    fun getById(var1: Long): T
}