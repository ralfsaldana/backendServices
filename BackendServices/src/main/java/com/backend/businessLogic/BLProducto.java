package com.backend.businessLogic;

import java.util.ArrayList;

import com.backend.dao.ProductoDAO;
import com.backend.model.Producto;

/**
 *
 * @author rsaldana
 */
public class BLProducto {
    
    
    public ArrayList<Producto> listarProductos() throws Exception{
       return new ProductoDAO().listarProductos();
    }
    
    public void insertarProducto(Producto p) throws Exception{
        new ProductoDAO().insertarProducto(p);
    }
    
    public void actualizarProducto(Producto p) throws Exception{
        new ProductoDAO().actualizarProducto(p);
    }
    
    public ArrayList<Producto> filtrarProductos(String filtro) throws Exception{
        return new ProductoDAO().filtrarProductos(filtro);
    }
    
    public void eliminarProducto(Long idProducto) throws Exception{
        new ProductoDAO().eliminarProducto(idProducto);
    }
    
    public Producto obtenerProductoPorId(Long idProducto) throws Exception{
        return new ProductoDAO().obtenerProductoPorId(idProducto);
    }
    
}
