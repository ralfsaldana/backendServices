package com.backend.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.businessLogic.BLCliente;
import com.backend.model.Cliente;

@RestController
public class ClienteController {

		@RequestMapping(value = "/listarClientes/",  produces = {"application/json"}, method = RequestMethod.GET )
		public ArrayList<Cliente> listarClientes() throws Exception{			
	       return new BLCliente().listarClientes();
	    }
	    
		@RequestMapping(value = "/insertarCliente/",  produces = {"application/json"}, method = RequestMethod.GET )
	    public void insertarCliente(Cliente p) throws Exception{
	        new BLCliente().insertarCliente(p);
	    }
	    
		@RequestMapping(value = "/actualizarCliente/",  produces = {"application/json"}, method = RequestMethod.GET )
	    public void actualizarCliente(Cliente p) throws Exception{
	        new BLCliente().actualizarCliente(p);
	    }
	    
		@RequestMapping(value = "/filtrarClientes/",  produces = {"application/json"}, method = RequestMethod.GET )
	    public ArrayList<Cliente> filtrarClientes(String filtro) throws Exception{
	        return new BLCliente().filtrarClientes(filtro);
	    }
	    
		@RequestMapping(value = "/eliminarCliente/",  produces = {"application/json"}, method = RequestMethod.GET )
	    public void eliminarCliente(Long idProducto) throws Exception{
	        new BLCliente().eliminarCliente(idProducto);
	    }
	    
		@RequestMapping(value = "/obtenerClientePorId/",  produces = {"application/json"}, method = RequestMethod.GET )
	    public Cliente obtenerClientePorId(Long id) throws Exception{
	        return new BLCliente().obtenerClientePorId(id);
	    }	
	
}
