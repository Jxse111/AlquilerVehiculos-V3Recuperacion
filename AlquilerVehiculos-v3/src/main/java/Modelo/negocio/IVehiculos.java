package Modelo.negocio;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import Modelo.dominio.Vehiculo;

public interface IVehiculos {

	List<Vehiculo> get();

	void insertar(Vehiculo vehiculo) throws OperationNotSupportedException;

	Vehiculo buscar(Vehiculo vehiculo);

	void borrar(Vehiculo vehiculo) throws OperationNotSupportedException;

}