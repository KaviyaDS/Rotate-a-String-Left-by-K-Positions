function Rotate(str, k) {
    let r_str = "";
    if(k > str.length) {
        k = k%str.length;
    }
    for(let i = k; i < str.length; i++) {
        r_str += str.charAt(i);
    }
    for(let i = 0; i < k; i++) {
        r_str += str.charAt(i);
    }
    return r_str;
}

const prompt = require('prompt-sync')();
const str = prompt("Enter String: ");
const k = parseInt(prompt("Enter K: "));

const rotate_str = Rotate(str, k);
console.log("Original String: " + str);
console.log("Rotated String: " + rotate_str);