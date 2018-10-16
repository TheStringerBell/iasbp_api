package com.restapi.app.repos;

import com.restapi.app.pojo.GetTempData;
import org.springframework.data.repository.CrudRepository;

public interface TempRepo extends CrudRepository<GetTempData, Integer> {
}
