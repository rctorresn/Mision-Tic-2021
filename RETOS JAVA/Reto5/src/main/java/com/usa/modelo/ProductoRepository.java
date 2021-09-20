
package com.usa.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramses Torres
 */
@Repository 
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    
    
}
