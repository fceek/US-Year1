var list = [4,6,2,8,11,23,2,7,5];
var stringA = 'ahlucbad';
var stringB = 'ahlu8bad';
var configuration = ['x','','o','o','x','','x','x','o'];


function twoMaxSum(list) {   // calculate the sum of the biggest number and the second biggest number in a list

    let max = 0;
    let secondMax  = 0;

    for (let i = 0; i <= list.length - 1; i++) {
        if (list[i] > secondMax && list[i] < max) secondMax = list[i];
        if (list[i] >= max) {
            secondMax = max;
            max = list[i];
        }
    }

    console.log(max+secondMax);

}

function comparingString(a,b) {    // compare if two strings are the same
    if (a.length != b.length) return false;
    for (let i = 0; i < a.length; i++) {
        if (a[i] != b[i]) return false;
    }

    return true;
}

function insideSet(a,b) {   // check if a set is inside another set
    if (a.length > b.length) return false;

    for (let i = 0; i <= a.length; i++) {
        let containThis = false;
        for (let j = 0; j <= b.length; j++) {
            if (a[i] == b[j]) containThis = true;
        }
        if (!containThis) return false;
    }

    return true;
}

const winSet = [[0,1,2],[3,4,5],[6,7,8],[0,3,6],[1,4,7],[2,5,8],[0,4,8],[2,4,6]];  // if 'x' or 'o's are in these pattern, they can win the game

function ticTacToe(board) {
    let stepCount = 0;
    let nextMove = '';
    let player = '';
    let playerWin = '';

    for (let i = 0; i < board.length; i++) {  // first count how many steps passed
        if (board[i] != '') stepCount++;
    }

    let currentSet = [];

    if (stepCount % 2 === 0) {   // determine which side is going to move in the next step
        nextMove = 'cross';
        player = 'x';
    }
    else {
        nextMove = 'circle';
        player = 'o';
    }

    for (let j = 0; j < board.length; j++) {
        if (board[j] == '') {
            board[j] = player;     // check every possible move
            for (let k = 0; k < board.length; k++) {    // generate the pattern after this move
                if (board[k] == player) currentSet.push(k);
            }
            for (let n = 0; n < winSet.length; n++) {
                if (insideSet(winSet[n],currentSet)) playerWin = player;   // check if winning pattern is inside of the pattern generated above
            }
            board[j] = '';    // reset game board
        }
        currentSet = [];   // reset pattern
    }

    if (playerWin == 'x') console.log('cross win');
    if (playerWin == 'o') console.log('circle win');
    if (!playerWin) {
        console.log('continue, next move: '+nextMove);
    }

}

twoMaxSum(list);
console.log(comparingString(stringA,stringB));
ticTacToe(configuration);