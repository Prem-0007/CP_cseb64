function processData(input) {
    let a = input.trim().split(/\s+/).map(Number);

    let k = 0;

    let n = a[k++];
    let m = a[k++];

    let matrix = [];

    for (let i = 0; i < n; i++) {
        let row = [];

        for (let j = 0; j < m; j++) {
            row.push(a[k++]);
        }

        matrix.push(row);
    }

    let top = 0;
    let bottom = n - 1;
    let left = 0;
    let right = m - 1;

    let ans = [];

    while (top <= bottom && left <= right) {

        for (let j = left; j <= right; j++) {
            ans.push(matrix[top][j]);
        }
        top++;

        for (let i = top; i <= bottom; i++) {
            ans.push(matrix[i][right]);
        }
        right--;

        if (top <= bottom) {
            for (let j = right; j >= left; j--) {
                ans.push(matrix[bottom][j]);
            }
            bottom--;
        }

        if (left <= right) {
            for (let i = bottom; i >= top; i--) {
                ans.push(matrix[i][left]);
            }
            left++;
        }
    }

    console.log(ans.join(" "));
}

let input = "";

process.stdin.on("data", function(data) {
    input += data;
});

process.stdin.on("end", function() {
    processData(input);
});
