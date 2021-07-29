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

    /*  overlay.addEventListener('click' , ()=>{
        overlay.classList.remove('active');
        popup.classList.remove('active');
        imgPrevista.src="";  
    });
  */

    //CODIGO PARA SELECCIONAR LA IMG Y ENVIARLA AL SERVIDOR
    var imgSubida = document.getElementById("img-subida");
    var imgPrevista = document.getElementById("img-prevista");
    var btnGuardar = document.getElementById('guardar-cambios');

  /*Cloudinary*/
  const CLOUDINARY_URL = 'https://api.cloudinary.com/v1_1/dgvsi8noz/image/upload'; //aDONDE
  const CLOUDINARY_UPLOAD_PRESET = 'an4gdqvw';//CONTRa


    imgSubida.addEventListener('change', async (e)=>{
         //Se envia imagen a cloudinary
         const file =e.target.files[0];
        //La enviamos como formulario
         const formData = new FormData();
         formData.append('file', file);
         formData.append('upload_preset', CLOUDINARY_UPLOAD_PRESET );
        //axios es una biblioteca que nos permite hacer un fetch post 
        const res = await axios.post(CLOUDINARY_URL,
             formData, {
             headers:{
                'Content-Type': 'multipart/form-data'
             }
         });
         console.log(res);

         imgPrevista.src = res.data.secure_url;

    });   
    
    btnGuardar.addEventListener('click', ()=>{
        /* cuando se presione guardar enviar imgPrevista.src a la base de datos 
        y cambiar la foto de portada */
        
    });
    
    

    