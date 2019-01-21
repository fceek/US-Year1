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

    let count = 0;

    for (let i = 1; i <= number; i++) {
        if (number % i == 0) {
            console.log(i + ' ');
            count++;
        }
    }

    console.log('Total: ' + count);
}


addIndexes();
combinationOfIndexes();
productOfIndexes();
getAllFactors(65536);