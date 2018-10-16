package com.restapi.app.repos;

import com.restapi.app.pojo.GetInsideData;
import org.springframework.data.repository.CrudRepository;

public interface InsideRepo extends CrudRepository<GetInsideData, Integer> {
}
