class Cliente {
    val nombre: String,
    val primerApellido: String,
    val segundoApellido: String,
    val correo_electronico: String,
    val telefono: Int,
    val bookingLista: MutableList< Habitacion> = mutableListOf()
    )
    {
        fun getClienteData():String{
            return "Nombre :$nombre $primerApellido $segundoApellido Informacion: $telefono , $correo_electronico"
        }
}