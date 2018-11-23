const target = 13;
const list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13];



function binarySearchAlter(lb,rb) {

    let mpt = Math.floor((lb + rb) / 2);

    if (target == list[mpt]) return mpt;
    if (target <  list[mpt]) return binarySearchAlter(lb,mpt-1);
    if (target >  list[mpt]) return binarySearchAlter(mpt+1,rb);

}

console.log(binarySearchAlter(0,list.length-1) + 1);
