package com.solstice.kotlin.services

import com.solstice.kotlin.model.Device
import com.solstice.kotlin.repositories.DeviceRepository
import com.solstice.kotlin.services.base.IBaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DeviceService @Autowired constructor(val _deviceRepository: DeviceRepository) : IDeviceService {
    override fun update(var1: Device): Device {
        return _deviceRepository.saveAndFlush(var1)
    }

    override fun delete(var1: Long) {
        _deviceRepository.delete(var1)
    }

    override fun findAll(): List<Device> {
        return _deviceRepository.findAll();
    }

    override fun save(var1: Device): Device {
        return _deviceRepository.save(var1);
    }

    override fun delete(var1: Device) {
        _deviceRepository.delete(var1);
    }

    override fun getById(var1: Long): Device {
        return _deviceRepository.getOne(var1);
    }

}