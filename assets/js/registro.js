

buttonLong= document.querySelector("#buttonLog");
userName= document.querySelector("#userName");
nombre= document.querySelector("#name");
email=document.querySelector("#email");
tipo_Usuario = document.querySelector("#tipo_Usuario")
password= document.querySelector("#password");

emailError= document.querySelector("#emailError");
nombreError= document.querySelector("#nombreError");
passwordError= document.querySelector("#passwordError");
nombreusuarioError = document.querySelector("#nombreusuarioError");


buttonLong.addEventListener('click', (e)=>{

    e.preventeDefault;


    if(email.value==''){
        emailError.textContent= 'Error, el email no debe estas vacia';
    }

    if(password.value==''){
        passwordError.textContent='Error, la constraseña  no debe estar vacio';
    }

    if(userName.value==''){
        nombreusuarioError.textContent= 'Error, el nombre de usuario no debe estas vacia';
    }

    if(nombre.value==''){
        nombreError.textContent='Error, el nombre  no debe estar vacio';
    }


    if(email.value!='' && password.value != '' && userName.value!='' &&  tipo_Usuario.value != '' && nombre.value != ''){
       
        fetch('http://localhost:8080/usuario/users/',{
            method: 'POST',
            body: JSON.stringify({
                nombre: nombre.value,
                correo: email.value,
                password: password.value,
                username: userName.value,
                tipo_Usuario: tipo_Usuario.value
            }),
            headers: {
                'Content-Type':'application/json'
            }
        }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => alert("Te has registrado con exito"));
    }


});
