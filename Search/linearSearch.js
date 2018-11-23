const list = [4,32,23,3,213,56,7,576,6,247,24,7,154,2,7,27];

function linearSearchForMax(list) {
    let maxPosition = 0;
    let position = 0;
    let max = 0;

    while (position <= list.length) {
        if (list[position] > max) {
            max = list[position];
            maxPosition = position + 1;
        }
        position++;
    }

    console.log(max+','+maxPosition);
}


linearSearchForMax(list);