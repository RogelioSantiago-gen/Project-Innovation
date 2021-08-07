


token = localStorage.getItem('token');

if(!token){
    url = window.location;
    console.log(url);
    const path = 'file:///C:/Users/bayin/OneDrive/Documentos/Proyecto_Inovation/Project-Innovation/assets/html/login.html';
    location.href= path;
}
