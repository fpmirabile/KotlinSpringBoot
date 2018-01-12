package com.solstice.kotlin.model

import javax.persistence.*

@Entity
data class Owner(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String = "",
    @OneToMany(mappedBy = "owner", cascade = [ CascadeType.ALL ], fetch = FetchType.EAGER)
    val devices: List<Device> = emptyList()
)