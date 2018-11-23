const target = 12;
const list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];

function binarySearch(lb,rb) {

    let mpt = Math.floor((lb + rb)/2);

    if (target == list[mpt]) return mpt;
    if (target <  list[mpt]) return binarySearch(lb,mpt-1);
    if (target >  list[mpt]) return binarySearch(mpt+1,rb);
}

console.log(binarySearch(0,list.length-1));
