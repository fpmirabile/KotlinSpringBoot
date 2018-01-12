package com.solstice.kotlin.services

import com.solstice.kotlin.model.Owner
import com.solstice.kotlin.repositories.OwnerRepository

class OwnerService(val _ownerRepository: OwnerRepository) : IOwnerService {
    override fun findAll(): List<Owner> {
        return _ownerRepository.findAll()
    }

    override fun save(var1: Owner): Owner {
        return _ownerRepository.save(var1)
    }

    override fun update(var1: Owner): Owner {
        return _ownerRepository.saveAndFlush(var1)
    }

    override fun delete(var1: Owner) {
        _ownerRepository.delete(var1)
    }

    override fun delete(var1: Long) {
        _ownerRepository.delete(var1)
    }

    override fun getById(var1: Long): Owner {
        return _ownerRepository.getOne(var1)
    }
}