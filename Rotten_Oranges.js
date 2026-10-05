const fs = require("fs");

const input = fs.readFileSync(0, "utf8").trim().split(/\s+/).map(Number);

let idx = 0;
let n = input[idx++];
let m = input[idx++];
let grid = [];

for (let i = 0; i < n; i++) {
    grid[i] = [];

    for (let j = 0; j < m; j++) {
        grid[i][j] = input[idx++];
    }
}
let queue = [];
let fresh = 0;
for (let i = 0; i < n; i++) {
    for (let j = 0; j < m; j++) {

        if (grid[i][j] === 2) {
            queue.push([i, j]);
        }

        if (grid[i][j] === 1) {
            fresh++;
        }
    }
}

if (fresh === 0) {
    console.log(0);
    process.exit();
}

let front = 0;
let time = 0;

let directions = [
    [-1, 0], 
    [1, 0],  
    [0, -1],
    [0, 1]   
];

while (front < queue.length) {
let size = queue.length - front;
    let rotten = false;
    for (let k = 0; k < size; k++) {
        let [r, c] = queue[front++];
        for (let [dr, dc] of directions) {
            let nr = r + dr;
            let nc = c + dc;
            if (
                nr >= 0 &&
                nr < n &&
                nc >= 0 &&
                nc < m &&
                grid[nr][nc] === 1
            ) {

                grid[nr][nc] = 2;

                fresh--;

                queue.push([nr, nc]);

                rotten = true;
            }
        }
    }
    if (rotten) {
        time++;
    }
}

if (fresh > 0) {
    console.log(-1);
} else {
    console.log(time);
}
