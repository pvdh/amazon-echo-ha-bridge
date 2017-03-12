package com.armzilla.ha.dao.pvdh;

//import com.armzilla.ha.dao.elastic.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.*;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Created by arm on 4/13/15.
 */

public interface DeviceRepository extends JpaRepository<DeviceDescriptor, String> {
    Page<DeviceDescriptor> findByDeviceType(String type, Pageable request);
//    List<DeviceDescriptor> findAll();
//    DeviceDescriptor findOne(String id);

}


//public interface EmployeeRepository extends CrudRepository<Employee, Long> {
//
//  Employee findByFirstName(String firstName);
//
//  List<Employee> findByLastName(String lastName);
//}