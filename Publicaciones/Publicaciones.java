package Publicaciones;

public class Publicaciones {

	private int codigo;
	private boolean prestado = false;
	private int anyoPublicacion;

	public Publicaciones(int codigo, boolean prestado, int anyoPublicacion) {
		
		this.codigo = codigo;
		this.prestado = prestado;
		this.anyoPublicacion = anyoPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

}
