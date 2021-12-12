package com.usa.reto.interfaces;

import com.usa.reto.model.Clone;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Ricardo Parrado Forero
 */

public interface CloneCrudInterface extends MongoRepository<Clone, Integer> {


}
