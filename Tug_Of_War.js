function processData(input) {
    let a = input.trim().split(/\s+/).map(Number);

    let n = a[0];
    let arr = a.slice(1);

    let total = arr.reduce((sum, x) => sum + x, 0);

    let need = Math.floor(n / 2);
    let ans = Infinity;

    function dfs(i, count, sum) {
        if (count === need) {
            let diff = Math.abs(total - 2 * sum);
            ans = Math.min(ans, diff);
            return;
        }
        if (i === n) {
            return;
        }
        dfs(i + 1, count + 1, sum + arr[i]);
        dfs(i + 1, count, sum);
    }

    dfs(0, 0, 0);

    console.log(ans);
}
let input = "";

process.stdin.on("data", function(data) {
    input += data;
});

process.stdin.on("end", function() {
    processData(input);
});
