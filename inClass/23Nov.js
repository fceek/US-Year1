function addIndexes() {

    let result = 0;

    for (let i = 1; i <= 4; i++) {
        result = result + i;
    }

    console.log(result);
}

function combinationOfIndexes() {

    for (let i = 0; i <= 4; i++) {
        for (let j = 0; j <= 4; j++) {
            console.log(i + ' , ' + j);
        }
    }
}

function productOfIndexes() {

    let result = 0;

    for (let i = 1; i <= 4; i++) {
        for (let j = 1; j <= 4; j++) {
            result = result + i * j;
        }
    }

    console.log(result);
}

function getAllFactors(number) {


    for (let i = 1; i <= number; i++) {
        if (number % i == 0) console.log(i + ' ');
    }
}

function checkPrime(number) {

    let flag = true;
    let upper = Math.floor(Math.sqrt(number)) + 1;

    for (let i = 2; i < upper; i++) {
        if (number % i == 0) flag = false;
    }

    if (flag) console.log('is prime');
        else console.log('not prime')
}

addIndexes();
combinationOfIndexes();
productOfIndexes();
getAllFactors(21371);
checkPrime(21371);