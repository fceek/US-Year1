const target = 13;
const list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13];

function binarySearch(list) {    // This function is the normal way(Pat's way) of binary search
    let lb = 0;
    let mpt = 0;                 // mpt is the mid point
    let rb = list.length - 1;    // lb, rb is lower-boundary and upper-boundary (I am used to use l for left and r for right to indicate boundary)

    while (list[mpt] != target) {
        mpt = Math.round((lb + rb) / 2);
        if (list[mpt] > target) {
            rb = mpt - 1;
        }
        else if (list[mpt] < target) {
                lb = mpt + 1;
             }
             else {
                console.log(mpt + 1);
             }
    }
}

function binarySearchAlter(lb,rb) {    // This function is another way of binary search using call stack (looks more neat)

    let mpt = Math.floor((lb + rb) / 2);

    if (target == list[mpt]) return mpt;
    if (target <  list[mpt]) return binarySearchAlter(lb,mpt-1);
    if (target >  list[mpt]) return binarySearchAlter(mpt+1,rb);

}


binarySearch(list);
console.log(binarySearchAlter(0,list.length-1) + 1);
