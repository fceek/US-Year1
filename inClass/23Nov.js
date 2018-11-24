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

function getAllFactors(number) {  // This function is to get the input's every factor(including 1 and itself)


    for (let i = 1; i <= number; i++) {
        if (number % i == 0) console.log(i + ' ');
    }
}

function checkPrime(number) {  // This function is to check if the input is a prime number

    let flag = true;
    let upper = Math.floor(Math.sqrt(number)) + 1; //Upper boundary set to square root of input, because factors are always appeared in pairs both sides of square root of input, we don't need to check both sides

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