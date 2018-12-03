var list = [8,5,2,6,9,3,888,1,666,4,0,7];

function selectionSort() {

    for (let i = 0; i < list.length; i++) {
        let position = i;
        for (let j = i; j <list.length; j++) {
            if (list[j] < list[position]) position = j;
        }

        let temp = list[i];
        list[i] = list[position];
        list[position] = temp;
    }

    for (let k = 0; k < list.length; k++) console.log(list[k]);

}

selectionSort();