package Modelo.negocio;

import java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IAlquileres;
import java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IClientes;
import java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IVehiculos;

public interface IFuenteDatos {

	IClientes CrearClientes();

	IVehiculos CrearVehiculos();

	IAlquileres CrearAlquileres();

}