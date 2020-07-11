package com.saludocursospring.app;

public class ContratoServiceImpl implements ContratoService {
	
	// Creamos el campo de clase con el modificador private

		private SelloEmpresaImpl creaccionSelloEmpresa;
		
		// creaci�n del constructor para la inyecci�n de dependencia
		public ContratoServiceImpl(SelloEmpresaImpl creaccionSelloEmpresa) {
			this.creaccionSelloEmpresa = creaccionSelloEmpresa;
		}

	public int numContrato() {
		// TODO Auto-generated method stub
		return 1;
	}

	public String getSelloEmpesa() {
		// TODO Auto-generated method stub
		return "Sello empresa para el contrato: EMPRESA SA";
	}

}
