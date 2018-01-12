package com.solstice.kotlin.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "devices")
@IdClass(value = Device::class)
data class Device(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        val id: Long = 0,
        @Id
        val name: String = "",
        @ManyToOne(fetch = FetchType.EAGER)
        val owner: Owner? = null
) : Serializable
