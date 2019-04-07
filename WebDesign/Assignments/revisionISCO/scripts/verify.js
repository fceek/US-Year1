function displayAns(that,right) {
  if (right) {
    that.value = "Right";
    that.style.color = "#0a0";
  }
  else {
    that.value = "Wrong";
    that.style.color = "#f00";
  }
}

function checkAns() {
  ans1 = document.getElementById("pro1");
  ans2 = document.getElementById("pro2");
  ans3 = document.getElementById("pro3");

  if (ans1.value == "11001100") displayAns(ans1,true);
  else displayAns(ans1,false);

  if (ans2.value == "57") displayAns(ans2,true);
  else displayAns(ans2,false);

  if (ans3.value == "85") displayAns(ans3,true);
  else displayAns(ans3,false);
}

function resetAns() {
  ans1.style.color = "#000";
  ans2.style.color = "#000";
  ans3.style.color = "#000";
}
