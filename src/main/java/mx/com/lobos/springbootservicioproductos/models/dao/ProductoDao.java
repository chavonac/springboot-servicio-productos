/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.lobos.springbootservicioproductos.models.dao;

import mx.com.lobos.springbootservicioproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author chavon
 */
public interface ProductoDao extends CrudRepository<Producto, Long> {

}
