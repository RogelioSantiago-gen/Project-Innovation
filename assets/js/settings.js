/* document.getElementById(perfil).innerHTML ="Aja te cambie";
 */
/* $(document).ready(function(){
    
    $('.menu').on('click', function() {
		$('.bar').toggleClass('animate');
        $('.expand-menu').toggleClass('animate');
        $('.expand-menu .nav-link').toggleClass('animate');
        setTimeout(function(){
            $('.expand-menu .nav-link').toggleClass('animate-show');
        },500)
	})
    
}) */

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

