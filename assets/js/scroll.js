 const container = document.getElementById("containerM")
const loading   = document.getElementById("loading") 
let postCounter = 0
getPost()
getPost()
getPost()

async function getPost(){
   postCounter++
   const urlPost= `https://jsonplaceholder.typicode.com/posts/${postCounter}`
   const newPost= await fetch(urlPost)
   const postResponse= await newPost.json()
   renderDOM(postResponse)
}
let newcounter = 0
window.addEventListener("scroll",()=>{
  const {scrollTop, scrollHeight, clientHeight} = document.documentElement
  newcounter++
  
  if((scrollTop + clientHeight)>= (scrollHeight -5)){
    getPost()
    getPost()
    getPost()
  }
})
function renderDOM(data){
  const newElement = document.createElement("div")
  newElement.classList.add("card")
  newElement.innerHTML=`<div class="card">
		<h2 class="title">${data.title}</h2>
		<p class="text">${data.body}.</p>
		<div class="user-info">
			<img src="https://randomuser.me/api/portraits/women/26.jpg" alt="pic" />
			<span>Leah Taylor</span>
		</div>
	</div>`
 container.append(newElement)
} 