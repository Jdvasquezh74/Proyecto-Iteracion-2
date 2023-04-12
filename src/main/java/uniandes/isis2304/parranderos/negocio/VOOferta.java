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
  * Interfaz para los métodos get de USUARIO.
  * Sirve para proteger la información del negocio de posibles manipulaciones desde la interfaz 
  * 
  * @author Juan Vásquez y Diego Párraga
  */
 public interface VOOferta
 {
     /* ****************************************************************
      * 			Métodos
      *****************************************************************/
     /**
      * @return El id del tipo de bebida
      */
     public long getId();
 
     /**
      * @return El id del usuario
      */
     public long getIdusuario();

    /**
      * @return El numero de habitaciones de la oferta
      */
        public int getNumeroHabitaciones();

    /**
      * @return El número de días de arriendo de la oferta
      */

        public int getNumeroDias();
 
     /**
      * @return Una cadena de caracteres con la información del usuario
      */
     @Override
     public String toString(); 
 
     /**
      * Define la igualdad dos usuarios
      * @param us - El usuario a comparar
      * @return true si tienen el mismo identificador y el mismo número de identificación 
      * en NIT o en documento
      */
     @Override
     public boolean equals (Object us); 
 }
 