
let btn = document.querySelector("#btn");
let sidebar = document.querySelector(".sidebar");


btn.onclick = function(){
    sidebar.classList.toggle("active");
}
btn.onclick = function(){
    sidebar.classList.toggle("active");
}

let  lupa = document.querySelector(".buscador1"); 
let abrir = document.querySelector(".busc");
let contene = document.querySelector(".contenedor1");
console.log(lupa); 
console.log(abrir); 
console.log(contene); 
/* le da la opcion de abrir a la lupita */

abrir.addEventListener ('click' , (e)=>{
    e.preventDefault(); 
    contene.style.opacity = "1";
    contene.style.visibility = "visible";
    lupa.classList.toggle("busc-close");
});



window.addEventListener('click' , (e)=>{
    console.log(e.target)
    if (e.target == contene){
        lupa.classList.toggle("busc-close");

        setTimeout (function() {
            contene.style.opacity = "0";
            contene.style.visibility = "hidden";
        },900)
    }

});
