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
 public class Oferta implements VOOferta
 {
     /* ****************************************************************
      * 			Atributos
      *****************************************************************/
     /**
      * El identificador de la oferta
      */
    private long id;
 
        /**
        * El id  del usuario dueño de la oferta
        */
    private long idusuario;

    private long numerohabitaciones;

    private long diasarriendo;

    private long historialdiasarriendo;

    private String tipo;

    private long precio;

    private long capacidad;

    private String tipohabitacion;
 
    private String compartida;
    
    private String amoblado;
    
    private String dimensiones;
    
    private String baniera;
    
    private String yacuzzi;

    private String sala;

    private String cosineta;
    


    private String Otros;
     /* ****************************************************************
      * 			Métodos
      *****************************************************************/
     /**
      * Constructor por defecto
      */
     public Oferta() 
     {
         this.id = 0;
     }
 
      /**
      * Crea y ejecuta la sentencia SQL para adicionar una RESERVA a la base de datos de AlohAndes
      * @param pm - El manejador de persistencia
      * @param id - El identificador de la oferta
      * @param idusuario - El id del usuario dueño de la oferta
        * @param numerohabitaciones - El número de habitaciones de la oferta
        * @param diasarriendo - El número de días de arriendo de la oferta
        * @param historialdiasarriendo - El número de días de arriendo de la oferta
        * @param tipo - El tipo de la oferta
        * @param precio - El precio de la oferta
        * @param capacidad - La capacidad de la oferta
        * @param tipohabitacion - El tipo de habitación de la oferta
        * @param compartida - La compartida de la oferta
        * @param amoblado - El amoblado de la oferta
        * @param dimensiones - Las dimensiones de la oferta
        * @param baniera - La baniera de la oferta
        * @param yacuzzi - El yacuzzi de la oferta
        * @param sala - La sala de la oferta
        * @param cosineta - La cosineta de la oferta
        * @param Otros - Otros de la oferta
      * @return EL número de tuplas insertadas
      */
      
     public Oferta(long id, Long  idusuario, Long  numerohabitaciones, Long  diasarriendo, Long  historialdiasarriendo, 
     String  tipo, Long  precio, Long  capacidad, String  tipohabitacion, String  compartida, String  amoblado, 
     String  dimensiones, String  baniera, String  yacuzzi, String  sala, String  cosineta, String  Otros) 
     {
        this.id = id;
        this.idusuario = idusuario;
        this.numerohabitaciones = numerohabitaciones;
        this.diasarriendo = diasarriendo;
        this.historialdiasarriendo = historialdiasarriendo;
        this.tipo = tipo;
        this.precio = precio;
        this.capacidad = capacidad;
        this.tipohabitacion = tipohabitacion;
        this.compartida = compartida;
        this.amoblado = amoblado;
        this.dimensiones = dimensiones;
        this.baniera = baniera;
        this.yacuzzi = yacuzzi;
        this.sala = sala;
        this.cosineta = cosineta;
        this.Otros = Otros;
     }
    
 
     /**
      * @return El id de la oferta 
      */
     public long getId() 
     {
         return id;
     }
 
     /**
      * @return El id del usuario
      */
     public long getIdusuario() 
     {
         return idusuario;
     }
     
    /**
    * @return El número de habitaciones de la oferta
    */
    public long getNumerohabitaciones() 
    {
        return numerohabitaciones;
    }    

    /**
    * @return El número de dias de arriendo de la oferta
    */
    public long getDiasarriendo(){
        return diasarriendo;
    }

     public void setIdusuario(long idusuario) 
     {
         this.idusuario = idusuario;
     }

        public void setId(long id) 
        {
            this.id = id;
        }

        public void setNumerohabitaciones(long numerohabitaciones) 
        {
            this.numerohabitaciones = numerohabitaciones;
        }

        public void setDiasarriendo(long diasarriendo) 
        {
            this.diasarriendo = diasarriendo;
        }

        public void setHistorialdiasarriendo(long historialdiasarriendo) 
        {
            this.historialdiasarriendo = historialdiasarriendo;
        }

        public void setTipo(String tipo) 
        {
            this.tipo = tipo;
        }   

        public void setCapacidad(long capacidad) 
        {
            this.capacidad = capacidad;
        }   

        public void setTipohabitacion(String tipohabitacion) 
        {
            this.tipohabitacion = tipohabitacion;
        }

        public void setCompartida(String compartida) 
        {
            this.compartida = compartida;
        }

        public void setAmoblado(String amoblado) 
        {
            this.amoblado = amoblado;
        }


        public void setDimensiones(String dimensiones) 
        {
            this.dimensiones = dimensiones;
        }

        public void setBaniera(String baniera) 
        {
            this.baniera = baniera;
        }

        public void setYacuzzi(String yacuzzi) 
        {
            this.yacuzzi = yacuzzi;
        }


        public void setSala(String sala) 
        {
            this.sala = sala;
        }

        public void setCosineta(String cosineta) 
        {
            this.cosineta = cosineta;
        }


        public void setOtros(String Otros) 
        {
            this.Otros = Otros;
        }

        public void setPrecio(long precio) 
        {
            this.precio = precio;
        }

        public long getHistorialdiasarriendo() 
        {
            return historialdiasarriendo;
        }

        public String getTipo() 
        {
            return tipo;
        }

        public long getCapacidad() 
        {
            return capacidad;
        }

        public String getTipohabitacion() 
        {
            return tipohabitacion;
        }

        public String getCompartida() 
        {
            return compartida;
        }

        public String getAmoblado() 
        {
            return amoblado;
        }

        public String getDimensiones() 
        {
            return dimensiones;
        }

        public String getBaniera() 
        {
            return baniera;
        }

        public String getYacuzzi() 
        {
            return yacuzzi;
        }

        public String getSala() 
        {
            return sala;
        }

        public String getCosineta() 
        {
            return cosineta;
        }

        public String getOtros() 
        {
            return Otros;
        }

        public long getPrecio() 
        {
            return precio;
        }

     /**
      * @return Una cadena de caracteres con la información de la reserva
      */
     @Override
     public String toString() 
     {
        return "Usuario [id=" + id + ", idusuario=" + idusuario + ", numerohabitaciones=" + numerohabitaciones + 
        ", diasarriendo=" + diasarriendo + ", historialdiasarriendo=" + historialdiasarriendo + ", tipo=" + tipo +
         ", precio=" + precio + ", capacidad=" + capacidad + ", tipohabitacion=" + tipohabitacion + ", compartida=" + 
         compartida + ", amoblado=" + amoblado + ", dimensiones=" + dimensiones + ", baniera=" + baniera + ", yacuzzi=" 
         + yacuzzi + ", sala=" + sala + ", cosineta=" + cosineta + ", Otros=" + Otros + "]";

         }
     
 
     /**
      * @param oferta - la oferta a comparar
      * @return True si tienen el mismo valor de identificacion 
      */
     public boolean equals(Object oferta) 
     {
         Oferta us = (Oferta) oferta;
         return id == us.id ;
     }

    @Override
    public int getNumeroHabitaciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumeroHabitaciones'");
    }

    @Override
    public int getNumeroDias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumeroDias'");
    }

 
}
 