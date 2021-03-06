package co.edu.unbosque.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Formacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	@JsonIgnoreProperties("formacion")
	private Usuario usuario;
	private String institucion;
	private String nivelFormacion;
	private String estadoFormacion;
	private Date f_inicio;
	private Date f_fin;

	public Formacion() {
	}

	public Formacion(int id, Usuario usuario, String institucion, String nivelFormacion, String estadoFormacion,
			Date f_inicio, Date f_fin) {
		this.id = id;
		this.usuario = usuario;
		this.institucion = institucion;
		this.nivelFormacion = nivelFormacion;
		this.estadoFormacion = estadoFormacion;
		this.f_inicio = f_inicio;
		this.f_fin = f_fin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getNivelFormacion() {
		return nivelFormacion;
	}

	public void setNivelFormacion(String nivelFormacion) {
		this.nivelFormacion = nivelFormacion;
	}

	public String getEstadoFormacion() {
		return estadoFormacion;
	}

	public void setEstadoFormacion(String estadoFormacion) {
		this.estadoFormacion = estadoFormacion;
	}

	public Date getF_inicio() {
		return f_inicio;
	}

	public void setF_inicio(Date f_inicio) {
		this.f_inicio = f_inicio;
	}

	public Date getF_fin() {
		return f_fin;
	}

	public void setF_fin(Date f_fin) {
		this.f_fin = f_fin;
	}

}
