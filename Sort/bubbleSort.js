const list = [998,1,32,4,14,34783,13,41,3,123,7,999];

function bubbleSort(list) {     // This function is another way of bubble sort, using for loop inside another for loop

    for (let i = 0; i < list.length; i++) {
        for (let j = 0; j < list.length - i; j++) {
            if (list[j] > list[j+1]) {
                list[j] = list[j] + list[j+1]; list[j+1] = list[j] - list[j+1]; list[j] = list[j] - list[j+1];  // Mathematics method of swapping, see appendix
            }
        }
    }

    for (let k = 0; k < list.length; k++) console.log(list[k]);
}

function bubbleSortAlter(list){     // This function is Micro bit(Pat's way) bubble sort, using a for loop inside a while loop
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

/* Appendix: 3 different ways of swapping 2 variables

1. temp variable method

let temp;
temp = a;
a = b;
b = temp;

2. mathematical method (can only swap numbers)

a = a + b;
b = a - b;
a = a - b;

3. Logical(or say binary algebra) method

a = a xor b;
b = a xor b;
a = a xor b;
(xor is ' ^ ' in JavaScript)


*/