fun main() {
    val notificable: MutableList<Notificable> = mutableListOf(CorreoElectronico(), MensajeTexto(), NotificacionPush())

    for (i in notificable) {
        i.enviarNotificacion()
    }
}