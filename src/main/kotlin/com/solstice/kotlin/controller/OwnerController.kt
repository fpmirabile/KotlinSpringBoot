package com.solstice.kotlin.controller

import com.solstice.kotlin.model.Owner
import com.solstice.kotlin.services.OwnerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/owner")
class OwnerController @Autowired constructor(val _ownerService: OwnerService) {

    @RequestMapping("")
    fun getDefaultOwner(): Owner {
        val owner = Owner(
                id = 1,
                name = "Ana"
        )

        return owner
    }


}