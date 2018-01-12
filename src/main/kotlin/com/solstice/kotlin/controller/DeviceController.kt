package com.solstice.kotlin.controller

import com.solstice.kotlin.model.Device
import com.solstice.kotlin.model.Owner
import com.solstice.kotlin.services.DeviceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/device")
class DeviceController @Autowired constructor(val _deviceService: DeviceService) {

    @GetMapping("")
    fun getDefaultDevice(): Device {
        val ana = Owner(
                id = 1,
                name = "Ana"
        )

        val device = Device(
                id = 1,
                name = "John lakowsky",
                owner = ana
        )

        return device
    }

    @PostMapping("/save")
    fun saveDevice(@RequestBody newDevice: Device): Device {
        return _deviceService.save(newDevice)
    }

//    @GetMapping("/search")
//    fun searchDevicesByName(@RequestParam(name = "name") value: String): Device {
//        val ana = Owner(
//                id = 1,
//                name = "Ana"
//        )
//
//        val device = Device(
//                id = 1,
//                name = value,
//                owner = ana
//        )
//
//        return device
//    }
//
//    @GetMapping("/{name}")
//    fun getDeviceByName(@PathVariable("name") value: String): Device {
//        val ana = Owner(
//                id = 1,
//                name = "Ana"
//        )
//
//        val device = Device(
//                id = 1,
//                name = value,
//                owner = ana
//        )
//
//        return device
//    }

    @DeleteMapping("/delete/{id}")
    fun deleteDevice(@PathVariable(value = "id") value: String): ResponseEntity<Void> {
        try {
            _deviceService.delete(value.toLong())
            return ResponseEntity<Void>(HttpStatus.OK)
        } catch (ex: Exception) {
            return ResponseEntity.notFound().build<Void>()
        }
    }

    @PutMapping("/update/{id}")
    fun updateDevice(@PathVariable(value = "id") value: Long, @RequestBody device: Device): ResponseEntity<Device> {
        val searchDevice = _deviceService.getById(value)

        if (searchDevice !== null) {
            val updatedDevice = _deviceService.update(device)
            return ResponseEntity.ok().body(updatedDevice)
        }

        return return ResponseEntity.notFound().build<Device>()
    }
}