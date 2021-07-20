 window.onload=inicio;
function inicio(){
document.querySelector("#box-c").onclick=nombreDeLaFuncion;
}
function nombreDeLaFuncion(){
    Swal.fire(
        '¡Bien hecho!',
        'Cambios guardados',
        'success'
      );
      
}
