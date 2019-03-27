document.addEventListener("DOMContentLoaded",handleDocumentLoad);

function handleDocumentLoad() {

  // get elements
  entVideo = document.querySelector("#theVideo");
  ppButton = document.getElementById("play-pause");
  muteButton = document.getElementById("mute-unmute");
  rwButton = document.getElementById("rewind");
  progbar = document.getElementById("prog-bar");
  prog = document.getElementById("prog");
  timer = document.getElementById("timetag");

  //bind video
  entVideo.addEventListener("click",playOrPause);

  //bind buttons
  ppButton.addEventListener("click",playOrPause);
  muteButton.addEventListener("click",muteOrUnmute);
  rwButton.addEventListener("click",rewindVideo);

  //progress bar set n go
  progression = setInterval(setProg,1000);
  progbar.addEventListener("click", progJump);

  //
  setProg();
}

function playOrPause() {
  if (entVideo.paused === true) {
    entVideo.play();
    ppButton.firstChild.src = "resource/icon/pause-button.png";
  }
  else {
    entVideo.pause();
    ppButton.firstChild.src = "resource/icon/play-button.png";
  }
  setProg();
}

function muteOrUnmute() {
  if (entVideo.muted === true) {
    entVideo.muted = false;
    muteButton.firstChild.src = "resource/icon/mute.png";
  }
  else {
    entVideo.muted = true;
    muteButton.firstChild.src = "resource/icon/unmute.png"
  }
}

function rewindVideo() {
  entVideo.currentTime = 0;
}

function setProg() {
  let barratio = entVideo.currentTime / entVideo.duration;
  prog.style.width = barratio * progbar.offsetWidth + "px";
  timer.innerHTML = calcTime(entVideo.currentTime);
}

function progJump(e) {
  let xpos = e.clientX;
  let startpos = progbar.getBoundingClientRect().left;
  let progratio = (xpos - startpos) / progbar.offsetWidth;
  entVideo.currentTime = entVideo.duration * progratio;
  setProg();
}

function calcTime(intSec) {
  let procMin = Math.floor(intSec / 60);
  let procSec = Math.floor(intSec - 60 * procMin);
  if (procMin < 10) procMin = "0" + procMin;
  if (procSec < 10) procSec = "0" + procSec;
  return "" + procMin + ":" + procSec;
}
