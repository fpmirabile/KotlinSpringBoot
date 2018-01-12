package com.solstice.kotlin.services

import com.solstice.kotlin.model.Owner
import com.solstice.kotlin.repositories.OwnerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OwnerService @Autowired constructor(val _ownerRepository: OwnerRepository) : IOwnerService {
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