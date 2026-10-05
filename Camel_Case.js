const fs = require("fs");

const input = fs.readFileSync(0, "utf8").trim().split("\n");

let n = Number(input[0]);

let words = input[1].split(",");
let pattern = input[2];

let ans = [];

for (let word of words) {
    let abr = "";

    for (let ch of word) {
        if (ch >= "A" && ch <= "Z") {
            abr += ch;
        }
    }

    if (abr.startsWith(pattern)) {
        ans.push(word);
    }
}

if (ans.length === 0) {
    console.log("No match found");
} else {
    ans.sort();

    for (let word of ans) {
        console.log(word);
    }
}
