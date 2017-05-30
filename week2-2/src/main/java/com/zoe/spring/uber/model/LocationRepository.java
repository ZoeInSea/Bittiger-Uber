package com.zoe.spring.uber.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by zoe on 5/29/17.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {

    Page<Location> findByVehicleMovementType(@Param("movementType") Location.VehicleMovementType type, Pageable pageable);

    Page<Location> findByUnitInfoUnitVin(@Param("unitInfo") String unitVin, Pageable pageable);
}
