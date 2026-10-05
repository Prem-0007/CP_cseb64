function processData(input) {
    let lines = input.trim().split(/\s+/);

    let str = lines[0];
    let pattern = lines[1];

    let i = 0;
    let j = 0;
    let star = -1;
    let match = 0;

    while (i < str.length) {
        if (j < pattern.length &&
            (pattern[j] === '?' || pattern[j] === str[i])) {
            i++;
            j++;
        }
        else if (j < pattern.length && pattern[j] === '*') {
            star = j;
            match = i;
            j++;
        }
        else if (star !== -1) {
            j = star + 1;
            match++;
            i = match;
        }
        else {
            console.log(0);
            return;
        }
    }

    while (j < pattern.length && pattern[j] === '*') {
        j++;
    }

    console.log(j === pattern.length ? 1 : 0);
}

let input = "";

process.stdin.on("data", function(data) {
    input += data;
});

process.stdin.on("end", function() {
    processData(input);
});
