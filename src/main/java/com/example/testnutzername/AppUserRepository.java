package com.example.testnutzername;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppUserRepository extends MongoRepository<AppUser, String> {
}
