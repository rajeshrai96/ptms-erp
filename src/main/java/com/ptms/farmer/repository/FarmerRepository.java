package com.ptms.farmer.repository;

import com.ptms.common.enums.RecordStatus;
import com.ptms.farmer.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {

    /**
     * Find farmer by farmer code.
     */
    Optional<Farmer> findByFarmerCode(String farmerCode);

    /**
     * Find farmer by mobile number.
     */
    Optional<Farmer> findByMobileNumber(String mobileNumber);

    /**
     * Check if mobile number already exists.
     */
    boolean existsByMobileNumber(String mobileNumber);

    /**
     * Check if Aadhaar number already exists.
     */
    boolean existsByAadhaarNumber(String aadhaarNumber);

    /**
     * Check if PAN number already exists.
     */
    boolean existsByPanNumber(String panNumber);

    /**
     * Get all active farmers.
     */
    java.util.List<Farmer> findByStatus(RecordStatus status);

}