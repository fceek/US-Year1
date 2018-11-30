var list = [81,5,23,7,56,5462,4,23,42,52,65,2356];

function insertSort() {

    let pivot = 1;

    while (pivot < list.length) {
        let temp = list[pivot];
        let position = pivot - 1;
        while (list[position] > temp && position >=0) {
            let swap = list[position + 1];
            list[position + 1] = list[position];
            list[position] = swap;

            position--;
        }

        pivot++;
    }

    for (let i = 0; i < list.length; i++) console.log(list[i]);
}

function insertSortAlter() {

    for (let i = 1; i < list.length; i++) {
        for (let j = 0; j < i; j++) {
            if (list[j] > list[i]) {
                let temp = list[i];
                for (let k = i; k > j; k--) list[k] = list[k-1]
                list[j] = temp;
            }
        }
    }

    for (let l = 0; l < list.length; l++) console.log(list[l]);
}

insertSortAlter();
list = [81,5,23,7,56,5462,4,23,42,52,65,2356];
insertSort();