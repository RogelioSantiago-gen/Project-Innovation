/*
const buttonLog = document.querySelector('#buttonLog');
const userName = document.querySelector('#userName');
const password = document.querySelector('#password');


buttonLog.addEventListener('click', (e)=>{


    e.preventDefault;

    if(userName.value != '' && password.value != ''){
        fetch('http://localhost:8080/login', {
         method:'POST',
         body: JSON.stringify({ 
             username: userName.value,
             password: password.value
         }),
         headers: {
             'Content-Type': 'application'
         }
 
     }).then(resp=> {
 
         token= resp.headers.get('Authorization');
 
         console.log(token);
 
         if(token && token.includes('Bearer')){ 
            
             localStorage.setItem('token', token); 
             url = window.location;  
             console.log(url);
             const path = 'file:///C:/Users/andre/Desktop/Copia%20proyecto/Project-Innovation/';
                                              
             location.href = path + 'index.html' ; 
         }else{
             localStorage.removeItem('token'); 
             alert("Contraseña o usuario equivocado");
         }
     })
 }

});
*/