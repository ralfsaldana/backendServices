package com.backend.businessLogic;

import java.util.ArrayList;

import com.backend.dao.ClienteDAO;
import com.backend.model.Cliente;

/**
 *
 * @author rsaldana
 */
public class BLCliente {
    
    public ArrayList<Cliente> listarClientes() throws Exception{
       return new ClienteDAO().listarClientes();
    }
    
    public void insertarCliente(Cliente p) throws Exception{
        new ClienteDAO().insertarCliente(p);
    }
    
    public void actualizarCliente(Cliente p) throws Exception{
        new ClienteDAO().actualizarCliente(p);
    }
    
    public ArrayList<Cliente> filtrarClientes(String filtro) throws Exception{
        return new ClienteDAO().filtrarClientes(filtro);
    }
    
    public void eliminarCliente(Long idProducto) throws Exception{
        new ClienteDAO().eliminarCliente(idProducto);
    }
    
    public Cliente obtenerClientePorId(Long id) throws Exception{
        return new ClienteDAO().obtenerClientePorId(id);
    }
    
}
