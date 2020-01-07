/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.lobos.springbootservicioproductos.models.service;

import java.util.List;

import mx.com.lobos.models.entity.Producto;


/**
 *
 * @author chavon
 */
public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);
    
    public Producto save(Producto producto);
    
    public void deleteById(Long id);
}
