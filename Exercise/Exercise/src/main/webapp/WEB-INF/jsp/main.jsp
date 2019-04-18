<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To The Page</title>
</head>
<body>
	<div class="main-window">
  <div class="post">
    <div class="user">
      <div class="user-img"></div>
      <div class="user-info">
        <div class="user-name">Louis Dickinson</div>
        <span class="post-date">Yesterday at 11:49</span>
      </div>
      <div class="actions">
        <span class="heart"></span>
        <span class="comment"></span>
        <span class="share"></span>
      </div>
    </div>
    <div class="content">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati beatae ipsum aperiam recusandae tempora eos architecto odio, voluptatibus, et fuga veritatis, ratione, magnam laudantium quas accusamus! Ea, maiores! Tenetur, nesciunt.
    </div>
  </div>
</div>

<div class="main-window">
  <div class="post">
    <div class="user">
      <div class="user-img"></div>
      <div class="user-info">
        <div class="user-name">Louis Dickinson</div>
        <span class="post-date">Yesterday at 11:49</span>
      </div>
      <div class="actions">
        <span class="heart"></span>
        <span class="comment"></span>
        <span class="share"></span>
      </div>
    </div>
    <div class="content">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati beatae ipsum aperiam recusandae tempora eos architecto odio, voluptatibus, et fuga veritatis, ratione, magnam laudantium quas accusamus! Ea, maiores! Tenetur, nesciunt.
    </div>
    <div class="post media">
      <img src="https://www.w3schools.com/w3css/img_temp_social.jpg"/>
    </div>
  </div>
</div>


<div class="main-window">
  <div class="post">
    <div class="user">
      <div class="user-img"></div>
      <div class="user-info">
        <div class="user-name">Louis Dickinson</div>
        <span class="post-date">Yesterday at 11:49</span>
      </div>
      <div class="actions">
        <span class="heart"></span>
        <span class="comment"></span>
        <span class="share"></span>
      </div>
    </div>
    <div class="content">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati beatae ipsum aperiam recusandae tempora eos architecto odio, voluptatibus, et fuga veritatis, ratione, magnam laudantium quas accusamus! Ea, maiores! Tenetur, nesciunt.
      
    </div>
    <div class="post media">
      <iframe width="659" height="494" src="https://www.youtube.com/embed/QILiHiTD3uc" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>
  </div>
</div>




<div class="main-window">
  <div class="post">
    <div class="user">
      <div class="user-img"></div>
      <div class="user-info">
        <div class="user-name">Louis Dickinson</div>
        <span class="post-date">Yesterday at 11:49</span>
      </div>
      <div class="actions">
        <span class="heart"></span>
        <span class="comment"></span>
        <span class="share"></span>
      </div>
    </div>
    <div class="content">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati beatae ipsum aperiam recusandae tempora eos architecto odio, voluptatibus, et fuga veritatis, ratione, magnam laudantium quas accusamus! Ea, maiores! Tenetur, nesciunt.
      
    </div>
    <div class="post media">
     
    </div>
    <div class="gallery-container">
    <div class="gallery-item" data-index="1">
        <img src="https://images.pexels.com/photos/39811/pexels-photo-39811.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb">
    </div>
    <div class="gallery-item" data-index="2">
        <img src="https://images.pexels.com/photos/5969/wood-nature-forest-bridge.jpg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb">
    </div>
    <div class="gallery-item" data-index="3">
        <img src="https://images.pexels.com/photos/531321/pexels-photo-531321.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb">
    </div>
    <div class="gallery-item" data-index="4">
        <img src="https://images.pexels.com/photos/373920/pexels-photo-373920.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260">
    </div>
    <div class="gallery-item" data-index="5">
        <img src="https://images.pexels.com/photos/164241/pexels-photo-164241.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260">
    </div>
    <div class="gallery-item" data-index="6">
        <img src="https://images.pexels.com/photos/417054/pexels-photo-417054.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260">
    </div>
   
</div>
  </div>
</div>


<style>

.main-window {
  margin:auto;
  left:0;
  right:0;
  max-width:650px;
  width:95%;
  
  /* background:#fff; */
}



/*

  User Posts
   - User Details
   - Share Icons
   - Content
   - Media

*/

.post {
  margin:20px auto 40px;
  width:90%;
  background:#fff;
  border-radius:4px;
  box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
  transition: all 0.2s ease-in-out;
  overflow:hidden;
}

.post:hover {
  box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);
}

.post .user {
  padding:10px;
  background:#f9f9f9;
  overflow:hidden;
}
.post .user .user-img {
  margin-right:10px;
  width:35px;
  height:35px;
  float:left;
  border-radius:6px;
  background:#444;
  box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
  overflow:hidden;
}
.post .user .user-info {
  margin-right:10px;
  width:calc(100% - 190px);
  height:35px;
  line-height:18px;
  float:left;
  color:#98d;
}
.post .user .user-info .post-date {
  font-size:13px;
  color:#444;
}
.post .user .actions {
  float:right;
}
.post .user .actions span {
  margin-right:10px;
  width:35px;
  height:35px;
  float:left;
  display:block;
  cursor:pointer;
  overflow:hidden;
  background-size:80%;
  background-position:50% 50%;
  background-repeat:no-repeat;
  opacity:0.2;
  transition:0.25s opacity ease-in-out;
}
.post .user .actions span:hover {
  opacity:1;
}
.post .user .actions span:last-child{
  margin-right:0;
}
.post .user .actions span.heart {
  background-image:
  url('data:image/png;base64,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')
  

}
.post .user .actions span.comment {
  background-image: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABIElEQVRYR+2X0bEBQRBFjwgQARkgAkKQASJQIkAGRIAMhEAGRPCeDGRAXTVTtTW1ip4dy8f2z+58TN9z7/ZHb40vVw1oAHNg7N7LQLoCW2AmgBUwLUM1R2MtANHUgSMwdOdP8ijxPdAH/gVwc2rNEsS9sTbwp0MWQO9l1sN4BfDTCZyATqKhUK9e0OvlDKQEOANdK0Ai80/bvEygAvi5BCxDmTf1oSHzDFgA8qa+MEDqT2JOoAKoEvh4Al9byfxSegAmWhRTWw36aR/cAAPgooVk4f4LLLoC1V6fLf1XqLGlln4RFYQatAy3sxBW8YszsIjZhOV85EAFofLOd87I2z5iANQ8C+HFzOK6GAsQQkSJFwXwEHpqBqKqSAJRguGlOwYCUNzXkk7/AAAAAElFTkSuQmCC');
}
.post .user .actions span.share {
  background-image: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAB6ElEQVRYR82XgTEEQRBF/0WACBABGSADIkAEiIAMEAEi4CJABkTgZEAG6l1Nq941s9d7s1unq1Sp2pnu37+7//RNNJ6dSDqTtJtCPEm6lfTiQ05GiL8u6VHSfsH3vaRT+zYGgJuUeVduR5JgREMD2JL0EWB1Jml7DADU/S4AgCMAmA3NwJWkyyCAAxpySADQT/NZ1y/CsSHpawgAdD3jRvZRe7UpqQVwKOlaEtlH7TsFf6tpQgLSbKVZn6Zvay1UBAf0rxiVGIDWnXT5nVql/xfRzdnzFICzTIWxQ8bMvvmau2wD4BKUctEbF/mjzjm6yYxviFAv8wAI/tyjiy3QQ8q6kVkUhQcQkVDv19MdjffnnAdABu2myTlemu6cMwNAN0N/xC6WqXXJ8b8BAMBoCThHx7NcVFtNEzLXlKOx4fRF1B5DnJkARX2x4QCkegwJiBYwjset6EirCdFmBtnSZemSYntWodpLMVJbevN9WUiGRLwUk0inFEdpxynU7xUuwBajDQhvBGcfXPgYRYHwslGyXFlKPgDBNlT1HHvnZNlVlhwQGADEoFsxZYH66BQNtpL5DFe6lAJk5Wt59IfJp41n7VKaa7DIXjHaTzNTU5qxpBE8YkzN3MZgwHzTDwSyqUAFYafxeP0AlftgIScjdPAAAAAASUVORK5CYII=');
}
.post .content {
  padding:20px;
  font-size:16px;
  line-height:22px;
  font-family:'Helvetica Neue';
  overflow:hidden;
}
.post .media{
  margin:0 20px 20px;
}
.post .media img {
  border-radius:4px;
  width:100%;
}
.post .media iframe {
  border-radius:4px;
}
.gallery-container {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    background-color: #fff;
    box-shadow: 0 0 3px 0 rgba(0, 0, 0, 0.3);
   	width: 97%;
    margin: auto;
    margin-top: -20px;
    
}
.gallery-item {
    flex-basis: 32.7%;
    margin-bottom: 6px;
    opacity: .85;
    cursor: pointer;
}
.gallery-item:hover {
    opacity: 1;
}
.gallery-item img {
    width: 100%;
    height: 100%;
    height: 28%;
    object-fit: cover;
}
.gallery-content {
    font-size: .8em;
}

.lightbox {
    position: fixed;
    display: none;
    background-color: rgba(0, 0, 0, 0.8);
    width: 100%;
    height: 100%;              
    overflow: auto;
    top: 0;
    left: 0;
}
.lightbox-content {
    position: relative;
    width: 70%;
    height: 70%;
    margin: 5% auto;
}
.lightbox-content img {
    border-radius: 7px;
    box-shadow: 0 0 3px 0 rgba(225, 225, 225, .25);
    width: 100%;
    height: 100%;
    object-fit: cover;
}
.lightbox-prev,
.lightbox-next {
    position: absolute;
    background-color: rgba(0, 0, 0, 0.8);
    color: #fff;
    padding: 7px;
    top: 45%;
    cursor: pointer;
}
.lightbox-prev {
    left: 0;
}
.lightbox-next {
    right: 0;
}
.lightbox-prev:hover,
.lightbox-next:hover {
    opacity: .8;
}

@media (max-width: 767px) {
    .gallery-container {
        width: 100%;
    }
    .gallery-item {
        flex-basis: 49.80%;
        margin-bottom: 3px;
    }
    .lightbox-content {
        width: 80%;
        height: 60%;
        margin: 15% auto;
    }
}
@media (max-width: 480px) {
    .gallery-item {
        flex-basis: 100%;
        margin-bottom: 1px;
    }
    .lightbox-content {
        width: 90%;
        margin: 20% auto;
    }
}
</style>


<script>
const galleryItem = document.getElementsByClassName("gallery-item");
const lightBoxContainer = document.createElement("div");
const lightBoxContent = document.createElement("div");
const lightBoxImg = document.createElement("img");
const lightBoxPrev = document.createElement("div");
const lightBoxNext = document.createElement("div");

lightBoxContainer.classList.add("lightbox");
lightBoxContent.classList.add("lightbox-content");
lightBoxPrev.classList.add("fa", "fa-angle-left", "lightbox-prev");
lightBoxNext.classList.add("fa", "fa-angle-right", "lightbox-next");

lightBoxContainer.appendChild(lightBoxContent);
lightBoxContent.appendChild(lightBoxImg);
lightBoxContent.appendChild(lightBoxPrev);
lightBoxContent.appendChild(lightBoxNext);

document.body.appendChild(lightBoxContainer);

let index = 1;

function showLightBox(n) {
    if (n > galleryItem.length) {
        index = 1;
    } else if (n < 1) {
        index = galleryItem.length;
    }
    let imageLocation = galleryItem[index-1].children[0].getAttribute("src");
    lightBoxImg.setAttribute("src", imageLocation);
}

function currentImage() {
    lightBoxContainer.style.display = "block";

    let imageIndex = parseInt(this.getAttribute("data-index"));
    showLightBox(index = imageIndex);
}
for (let i = 0; i < galleryItem.length; i++) {
    galleryItem[i].addEventListener("click", currentImage);
}

function slideImage(n) {
    showLightBox(index += n);
}
function prevImage() {
    slideImage(-1);
}
function nextImage() {
    slideImage(1);
}
lightBoxPrev.addEventListener("click", prevImage);
lightBoxNext.addEventListener("click", nextImage);

function closeLightBox() {
    if (this === event.target) {
        lightBoxContainer.style.display = "none";
    }
}
lightBoxContainer.addEventListener("click", closeLightBox);
</script>
	
</body>
</html>