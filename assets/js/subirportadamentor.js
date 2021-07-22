    /* CODIGO PARA ACTIVAR O DESACTIVAR EL POPUP */
    var btnAbrirPopup = document.getElementById('btnAbrirPopup'),
    overlay= document.getElementById('overlay'),
    popup= document.getElementById('contenedor-popup'),
    btnCerrarPopup = document.getElementById('btn-cerrar-popup');

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
    var imgSubida = document.getElementById("img-subida");
    var imgPrevista = document.getElementById("img-prevista");
    var btnGuardar = document.getElementById('guardar-cambios');



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

    