package com.edu.unlam.pb2;

import java.util.*;

public class Sistema {
	
	private Set<Usuario> usuarios;
	
	public Sistema() {
		usuarios = new HashSet<Usuario>();
	}

	public void ingresarUsuario(Usuario nuevo) {
		usuarios.add(nuevo);
		
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Integer GetCantidadDeUsuarios() {
		
		return usuarios.size();
	}

	public Boolean ingresarAlSistema(String usuario, String contrasena) throws unlam.pb2.UserNotFound {
		Boolean sePudoLoguear = false;
		for(Usuario actual: usuarios) {
			if(actual.getNombre().equals(usuario) && (actual.getContrasena().equals(contrasena))){
				sePudoLoguear = true;
			}if(!actual.getNombre().equals(usuario)) {
				throw new unlam.pb2.UserNotFound("Usuario inexistente");
			}
			
				
			}
		
		return sePudoLoguear;
	}

	public boolean elminarUsuario(Administrador administrador) throws java.lang.ClassCastException{
		Boolean sePudoEliminar = false;
		for(Usuario actual: usuarios) {
			if(actual instanceof Basico) {
				sePudoEliminar = true;
				((Basico) actual).setUsuarioEliminado(true);
				
			}if(actual instanceof Administrador) {
				throw new java.lang.ClassCastException("No se puede eliminar administrado");
			}
		}
		
		return sePudoEliminar;
	}
	
	

}
