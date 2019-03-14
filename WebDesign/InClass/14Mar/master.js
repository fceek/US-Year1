function bigImg(x) {
  x.style.height = "64px";
  x.style.width = "64px";
  var ind = document.getElementById('indicator');
  ind.innerHTML = "Mouse On";
  ind.style.color = "#ff0000";
}

function normalImg(x) {
  x.style.height = "32px";
  x.style.width = "32px";
  var ind = document.getElementById('indicator');
  ind.innerHTML = "Mouse Absent";
  ind.style.color = "#00ff00";
}
