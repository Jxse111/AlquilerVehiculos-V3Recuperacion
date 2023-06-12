package Modelo;

import Modelo.negocio.IFuenteDatos;
import Modelo.negocio.ficheros.FuenteDatosMemoria;

public enum FactoriaFuenteDatos {

	MEMORIA {
		
		@Override
		public  IFuenteDatos crear() {
			// TODO Auto-generated method stub
			return new FuenteDatosMemoria();
		}
	};
	
	public abstract IFuenteDatos crear();
}