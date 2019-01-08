function checkPrime(number) {  // This function is to check if the input is a prime number

    let flag = true;
    let upper = Math.floor(Math.sqrt(number)) + 1; //Upper boundary set to square root of input, because factors are always appeared in pairs both sides of square root of input, we don't need to check both sides

    for (let i = 2; i < upper; i++) {
        if (number % i == 0) flag = false;
    }

    if (flag) console.log('is prime');
    else console.log('not prime');
}

function goesToOne(number) {
    //nothing here
}


checkPrime(21371);
goesToOne(21371);