package com.restapi.app.repos;

import com.restapi.app.pojo.GetControlData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ControlRepo extends JpaRepository<GetControlData, Integer> {

    @Transactional
    @Modifying
    @Query( value = "UPDATE Control c SET c.Mode = :mode WHERE c.System = :system", nativeQuery = true)
    public void updateControl(@Param("mode") String i, @Param("system") String s);

}
