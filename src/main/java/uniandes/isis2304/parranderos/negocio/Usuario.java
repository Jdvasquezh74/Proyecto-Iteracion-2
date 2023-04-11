/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.parranderos.negocio;

/**
 * Clase para modelar el concepto USUARIO del negocio de AlohAndes
 *
 * @author Juan Vásquez y Diego Párraga
 */
public class Usuario implements VOUsuario
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del usuario
	 */
	private long id;

	/**
	 * El nit en caso de ser un ente jurídico
	 */
	private String nit;
	
	/**
	 * La ubicación en caso de ser un ente jurídico
	 */
	private String ubicacion;
	
	/**
	 * El tipo jurídico (Hotel, Hostal o Vivienda Universitaria) 
	 * en caso de ser un ente jurídico
	 */
	private String tipoJuridico;
	
	/**
	 * El número de documento en caso de ser un ente natural
	 */
	private int numeroDocumento;
	
	/**
	 * El tipo de documento en caso de ser un ente natural
	 */
	private String tipoDocumento;
	
	/**
	 * La relación con la comunidad académica
	 */
	private String relacionComunidad;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	public Usuario() 
	{
		this.id = 0;
	}

	/**
	 * Constructor con valores
	 * @param id - El identificador del tipo de bebida
	 * @param nit - El nit de un ente jurídico (ingresar null si es natural)
	 * @param ubicacion - La ubicacion del ente jurídico (ingresar null si es natural)
	 * @param tipoJuridico - El tipo de ente jurídico (Hotel, Hostal o Vivienda Universitaria,
	 * null si es natural)
	 * @param numeroDocumento - El documento del ente natural (ingresar null si es jurídico)
	 * @param tipoDocumento - El tipo de documento (ingresar null si es jurídico)
	 * @param relacionComunidad - La relación con la comunidad académica
	 */
	public Usuario(long id, String nit, String ubicacion, String tipoJuridico, 
			int numeroDocumento, String tipoDocumento, String relacionComunidad) 
	{
		this.id = id;
		this.nit = nit;
		this.ubicacion = ubicacion;
		this.tipoJuridico = tipoJuridico;
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.relacionComunidad = relacionComunidad;
		
	}

	/**
	 * @return El id del usuario
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @return El nit del usuario
	 */
	public String getNit() 
	{
		return nit;
	}
	
	/**
	 * @return La ubicacion del usuario
	 */
	public String getUbicacion() 
	{
		return ubicacion;
	}
	
	/**
	 * @return El tipo juridico del usuario
	 */
	public String getTipoJuridico() 
	{
		return tipoJuridico;
	}
	
	/**
	 * @return El número de documento del usuario
	 */
	public int getNumeroDocumento() 
	{
		return numeroDocumento;
	}
	
	/**
	 * @return El tipo de documento del usuario
	 */
	public String getTipoDocumento() 
	{
		return tipoDocumento;
	}
	
	/**
	 * @return La relación con la comunidad del usuario
	 */
	public String getRelacionComunidad() 
	{
		return relacionComunidad;
	}

	/**
	 * @param ubicacion - La nueva ubicacion del usuario - si modifica sus instalaciones -.
	 */
	public void setUbicacion(String ubicacion) 
	{
		this.ubicacion = ubicacion;
	}
	
	/**
	 * @param relacion - La nueva relación con la comunidad - si cambia su condición a lo largo del uso -.
	 */
	public void setRelacionComunidad(String relacion) 
	{
		relacionComunidad = relacion;
	}


	/**
	 * @return Una cadena de caracteres con la información del usuario
	 */
	@Override
	public String toString() 
	{
		if (!(nit == null)) {
			return "Usuario [id=" + id + ", nit=" + nit + ", tipo jurídico=" + tipoJuridico + 
					", relación comunidad=" + relacionComunidad + "]";
		}
		else {
			return "Usuario [id=" + id + ", numero documento=" + numeroDocumento + ", tipo documento=" + tipoDocumento + 
					", relación comunidad=" + relacionComunidad + "]";
		}
	}

	/**
	 * @param usuario - El usuario a comparar
	 * @return True si tienen el mismo valor de identificacion 
	 */
	public boolean equals(Object usuario) 
	{
		Usuario us = (Usuario) usuario;
		return id == us.id && nit == us.nit && numeroDocumento == us.numeroDocumento;
	}

}
