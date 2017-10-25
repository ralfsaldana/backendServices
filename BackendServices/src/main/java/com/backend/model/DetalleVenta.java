package com.backend.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author rsaldana
 */
public class DetalleVenta implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2124814819213497598L;
	private Long idDetalleVenta;
    private Long idProducto; //este campo es de comodin, no existe en la tabla "detalle_venta"
    private String codigoProducto;
    private String descripcionProducto;
    private BigDecimal precioUnitario;
    private Long cantidad;
    private BigDecimal precioVenta;

    /**
     * @return the codigoProducto
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the descripcionProducto
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * @param descripcionProducto the descripcionProducto to set
     */
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    /**
     * @return the precioUnitario
     */
    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the cantidad
     */
    public Long getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioVenta
     */
    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the idProducto
     */
    public Long getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the idDetalleVenta
     */
    public Long getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     * @param idDetalleVenta the idDetalleVenta to set
     */
    public void setIdDetalleVenta(Long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }
    
}

