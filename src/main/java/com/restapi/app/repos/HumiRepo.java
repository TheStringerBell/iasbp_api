package com.restapi.app.repos;

import com.restapi.app.pojo.GetHumiData;
import org.springframework.data.repository.CrudRepository;

public interface HumiRepo extends CrudRepository<GetHumiData, Integer> {
}
