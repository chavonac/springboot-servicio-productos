/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.lobos.springbootservicioproductos.models.dao;


import org.springframework.data.repository.CrudRepository;
import mx.com.lobos.models.entity.Producto;

/**
 *
 * @author chavon
 */
public interface ProductoDao extends CrudRepository<Producto, Long> {

}
