class Reservacion {
    val habitacion: Habitacion,
    val fechaDeInicio: Int,
    val fechaDeSalida: Int,
    val total_noches: Int,
    val cantidadDePersonas: Int,

    ) {
        private var totalPagar = 0.00
        fun getReservacionData(): String {
            return "Habitacion: $habitacion"
            "total de noche $total_noches"
            " Fechas: $fechaDeInicio, $fechaDeSalida "
            " total a pagar: $totalPagar"
        }
        fun calculartotal(){
            totalPagar= total_noches*habitacion.precio
        }
}