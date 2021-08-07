

buttonLong= document.querySelector("#buttonLog");
userName= document.querySelector("#userName");
nombre= document.querySelector("#name");
email=document.querySelector("#email");
tipo_Usuario = document.querySelector("#tipo_Usuario")
password= document.querySelector("#password");



buttonLong.addEventListener('click', (e)=>{

    e.preventeDefault;

    console.log(tipo_Usuario.value);
    console.log(userName.value);
    console.log(nombre.value);
    console.log(email.value);
    console.log(password.value);


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
                'Authorization': token,
                'Content-Type':'application'
            }
        }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => console.log('Success:', response));

    }


});
