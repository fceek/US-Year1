document.addEventListener("DOMContentLoaded",handleDocumentStyle);

function handleDocumentStyle() {

  let leftNav = document.querySelector(".left-nav");
  let leftBar = document.querySelector(".left");
  let rightBar = document.querySelector(".right");
  let main = document.querySelector("main");


  leftBar.style.height = main.clientHeight + "px";
  rightBar.style.height = main.clientHeight + "px";

  window.addEventListener("resize",setWidth);


  function setWidth() {
    let scrWidth = window.innerWidth;
    leftBar.style.width = Math.max(((scrWidth - 960) / 2 - 4),200)+ "px";
    rightBar.style.width = Math.max(((scrWidth - 960) / 2 - 20),200)+ "px";
    leftNav.style.left = leftBar.clientWidth - 199 + "px";
  }

  setWidth();
}
