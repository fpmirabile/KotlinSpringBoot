package com.solstice.kotlin.controller

import com.solstice.kotlin.model.Owner
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/owner")
class OwnerController {

    @RequestMapping("")
    fun getDefaultOwner(): Owner {
        val owner = Owner(
                id = 1,
                name = "Ana"
        )

        return owner
    }


}