const buttonLog = document.querySelector('#buttonLog');

buttonLog.addEventListener('submit', (e)=>{

    e.preventDefault;

    const email = document.querySelector('#email');
    const password = document.querySelector('#password');

    if(email.value != '' && password.value != ''){
        fetch('http://localhost:8080/login', {
         method:'POST',
         body: JSON.stringify({ 
             username: email.value,
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
             const path = url.pathname.substring(0, url.pathname.lastIndexOf("/") + 1);
                                              
             location.href = path + 'index.html' ; 
         }else{
             localStorage.removeItem('token'); 
             emailError.textContent='Usuario o contraseña incorrecta';
         }
     })
 }

});