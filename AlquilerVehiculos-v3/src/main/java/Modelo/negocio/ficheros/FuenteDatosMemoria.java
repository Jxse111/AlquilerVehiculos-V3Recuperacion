package Modelo.negocio.ficheros;

import java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.ficheros.Alquileres;
import java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.ficheros.Clientes;
import java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.ficheros.Vehiculos;

import Modelo.negocio.IAlquileres;
import Modelo.negocio.IClientes;
import Modelo.negocio.IFuenteDatos;
import Modelo.negocio.IVehiculos;

public class FuenteDatosMemoria implements IFuenteDatos {
 @Override
public IClientes CrearClientes() {
	 return new Clientes();
 }
 @Override
public IVehiculos CrearVehiculos() {
	 return  new Vehiculos();
 }
 @Override
public IAlquileres CrearAlquileres() {
	 return new Alquileres();
 }
}
