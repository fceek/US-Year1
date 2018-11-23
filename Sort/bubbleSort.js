const list = [998,1,32,4,14,34783,13,41,3,123,7,999];

function bubbleSort(list) {

    for (let i = 0; i < list.length; i++) {
        for (let j = 0; j < list.length - i; j++) {
            if (list[j] > list[j+1]) {
                list[j] = list[j] + list[j+1]; list[j+1] = list[j] - list[j+1]; list[j] = list[j] - list[j+1];
            }
        }
    }

    for (let k = 0; k < list.length; k++) console.log(list[k]);
}

function bubbleSortAlter(list){
    let outp = list.length - 1;

    while (outp >= 0) {
        for (let i = 0; i <= outp - 1; i++) {
            if (list[i] > list[i+1]) {
                list[i] = list[i] + list[i+1]; list[i+1] = list[i] - list[i+1]; list[i] = list[i] - list[i+1];
            }
        }

        outp--;
    }

    for (let j = 0; j < list.length; j++) console.log(list[j]);
}


bubbleSort(list);
bubbleSortAlter(list);

