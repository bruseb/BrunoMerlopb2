package com.edu.unlam.pb2;

public class Basico extends Usuario {

	private Boolean usuarioBloquedo;
	private Boolean usuarioEliminado;

	public Basico(String nombre, String contrasena) {
		super(nombre, contrasena);
		this.usuarioBloquedo = false;
		this.usuarioEliminado = false;

	}

	public Boolean getUsuarioBloquedo() {
		return usuarioBloquedo;
	}

	public void setUsuarioBloquedo(Boolean usuarioBloquedo) {
		this.usuarioBloquedo = usuarioBloquedo;
	}

	public Boolean getUsuarioEliminado() {
		return usuarioEliminado;
	}

	public void setUsuarioEliminado(Boolean usuarioEliminado) {
		this.usuarioEliminado = usuarioEliminado;
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
