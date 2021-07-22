    /* CODIGO PARA ACTIVAR O DESACTIVAR EL POPUP */
    var btnAbrirPopup = document.getElementById('btnAbrirPopup-perfil'),
    overlay= document.getElementById('overlay-fotoPerfil'),
    popup= document.getElementById('contenedor-popup-fotoPerfil'),
    btnCerrarPopup = document.getElementById('btn-cerrar-popup-fotoPerfil');

    btnAbrirPopup.addEventListener('click', ()=>{
        overlay.classList.add('active');
        popup.classList.add('active');
    })

    btnCerrarPopup.addEventListener('click', ()=>{
        overlay.classList.remove('active');
        popup.classList.remove('active');
        imgPrevista.src="";
    });

    //CODIGO PARA SELECCIONAR LA IMG Y ENVIARLA AL SERVIDOR
    var imgSubida = document.getElementById("img-subida-fotoPerfil");
    var imgPrevista = document.getElementById("img-prevista-fotoPerfil");
    var btnGuardar = document.getElementById('guardar-cambios-fotoPerfil');



    imgSubida.addEventListener('change', (e)=>{
        let reader = new FileReader();
        console.log(e);
         reader.readAsDataURL(e.target.files[0]);

         reader.onload= function(){
            console.log(reader.result);
            imgPrevista.src = reader.result;
         };        
    });   
    

    btnGuardar.addEventListener('click', ()=>{

        //INSERTE AQUI EL CODIGO PARA ENVIARLO AL SERVIDOR
    });

    