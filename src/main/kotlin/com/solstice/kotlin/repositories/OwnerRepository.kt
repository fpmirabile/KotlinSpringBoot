package com.solstice.kotlin.repositories

import com.solstice.kotlin.model.Owner
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OwnerRepository : JpaRepository<Owner, Long> {
}