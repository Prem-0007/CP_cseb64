const fs = require("fs");

const input = fs.readFileSync(0, "utf8").trim().split(/\s+/).map(Number);

let index = 0;

let n = input[index++];
let m = input[index++];

let grid = [];

for (let i = 0; i < n; i++) {
    grid[i] = [];

    for (let j = 0; j < m; j++) {
        grid[i][j] = input[index++];
    }
}

let dp = Array.from(
    { length: n },
    () => Array(m).fill(0)
);

dp[0][0] = grid[0][0];

for (let i = 0; i < n; i++) {

    for (let j = 0; j < m; j++) {

        if (i === 0 && j === 0) {
            continue;
        }
        let up = Infinity;
        let left = Infinity;
        let diagonal = Infinity;

        if (i > 0) {
            up = dp[i - 1][j];
        }

        if (j > 0) {
            left = dp[i][j - 1];
        }

        if (i > 0 && j > 0) {
            diagonal = dp[i - 1][j - 1];
        }

        dp[i][j] = grid[i][j] +
                   Math.min(up, left, diagonal);
    }
}
console.log(dp[n - 1][m - 1]);
