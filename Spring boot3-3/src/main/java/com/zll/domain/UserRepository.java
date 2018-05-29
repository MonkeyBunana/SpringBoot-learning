package com.zll.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zll on 2018/3/25 0025.
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}
