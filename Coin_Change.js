const fs = require("fs");

const input = fs.readFileSync(0, "utf8").trim().split(/\s+/).map(Number);

let index = 0;

let amount = input[index++];
let n = input[index++];

let coins = [];

for (let i = 0; i < n; i++) {
    coins.push(input[index++]);
}

let dp = new Array(amount + 1).fill(amount + 1);

dp[0] = 0;

for (let i = 1; i <= amount; i++) {

    for (let coin of coins) {

        if (coin <= i) {
            dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
    }
}

if (dp[amount] === amount + 1) {
    console.log(-1);
} else {
    console.log(dp[amount]);
}
