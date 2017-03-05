package admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comunidad {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String cif;
	private String calle;
	private String poblacion;
	private String cuenta;
	private String numero;
	private String codigoPostal;
	

	public Comunidad() {
	}

	public Comunidad(String cif, String calle, String poblacion, String cuenta, String num, String cp) {
		this.cif = cif;
		this.calle = calle;
		this.poblacion = poblacion;
		this.cuenta = cuenta;
		this.numero= num;
		this.codigoPostal= cp;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	

}
