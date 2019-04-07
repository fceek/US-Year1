document.addEventListener("DOMContentLoaded",handleDocumentLoad);

function handleDocumentLoad() {

  let entVideo = document.querySelector("#theVideo");
  let ppButton = document.getElementById("play-pause");
  let muteButton = document.getElementById("mute-unmute");
  let rwButton = document.getElementById("rewind");
  let progbar = document.getElementById("prog-bar");
  let prog = document.getElementById("video-prog");
  let timer = document.getElementById("timetag");
  let volButton = document.getElementById("volumeb");
  let defVideo = document.getElementById("PositiveInt");

  entVideo.addEventListener("click",playOrPause);
  ppButton.addEventListener("click",playOrPause);
  muteButton.addEventListener("click",muteOrUnmute);
  rwButton.addEventListener("click",rewindVideo);
  progression = setInterval(setProg,1000);
  progbar.addEventListener("click", progJump);
  volButton.addEventListener("mouseover",volAdjust);
  volButton.addEventListener("mouseout",volAdjustEnd);
  volButton.addEventListener("click",volSet);

  setProg();
  switchVideo(defVideo);

  function playOrPause() {
    if (entVideo.paused === true) {
      entVideo.play();
      ppButton.firstChild.src = "resources/icon/pause-button.png";
    }
    else {
      entVideo.pause();
      ppButton.firstChild.src = "resources/icon/play-button.png";
    }
    setProg();
  }

  function muteOrUnmute() {
    if (entVideo.muted === true) {
      entVideo.muted = false;
      muteButton.firstChild.src = "resources/icon/mute.png";
    }
    else {
      entVideo.muted = true;
      muteButton.firstChild.src = "resources/icon/unmute.png"
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

  function volAdjust() {
    volButton.style.height = 128 + "px";
    volButton.innerHTML = Math.floor(entVideo.volume * 100);
  }

  function volSet(e) {
    let ypos = e.clientY;
    let startpos = volButton.getBoundingClientRect().top;
    let volratio = (ypos - startpos) / volButton.offsetHeight;
    volratio = 1 - volratio;
    entVideo.volume = volratio;
    volButton.innerHTML = Math.floor(entVideo.volume * 100);
  }

  function volAdjustEnd() {
    volButton.style.height = 48 + "px";
    volButton.innerHTML = "<img src=\"resources/icon/volume.png\">"
  }

}

function switchVideo(s) {
  let target = document.querySelector("#theVideo");
  target.src = "resources/videos/" + s.id + ".mp4";
  target.poster = "resources/images/" + s.id + ".jpg";
}
