package com.tourplanning.backend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, ObjectId> {
    Optional<Hotel> findHotelByState(String state);
}
