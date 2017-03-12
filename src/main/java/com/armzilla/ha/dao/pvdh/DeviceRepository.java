package com.armzilla.ha.dao.pvdh;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;


/**
 * Created by arm on 4/13/15.
 */

public interface DeviceRepository extends JpaRepository<DeviceDescriptor, String> {
    Page<DeviceDescriptor> findByDeviceType(String type, Pageable request);
//    List<DeviceDescriptor> findAll();
//    DeviceDescriptor findOne(String id);

}
