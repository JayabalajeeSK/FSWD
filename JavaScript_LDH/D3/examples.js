// | Expression           | Result | Reason           |
// | -------------------- | ------ | ---------------- |
// | `5 == "5"`           | true   | Type conversion  |
// | `5 === "5"`          | false  | Different types  |
// | `0 == false`         | true   | false → 0        |
// | `0 === false`        | false  | number ≠ boolean |
// | `null == undefined`  | true   | special rule     |
// | `null === undefined` | false  | strict           |

console.log(5 == "5");
console.log(5 === "5");
console.log(0 == false);
console.log(0 ===false);
console.log(null == undefined);
console.log(null === undefined);
// true
// false
// true
// false
// true
// false


let score = "80"; // string

if (score >= 90) 
{
    console.log("A");
} 
else if (score >= 75) 
{
    console.log("B"); //
} 
else 
{
    console.log("C");
}

// JavaScript uses implicit type coercion

// Only relational operators (>, <, >=, <=) automatically convert strings to numbers.

// == operator also does coercion (loose equality)

// === does NOT (strict equality, no coercion)

let score1 = 80; // int

if (score1 >= 90) 
{
    console.log("A");
} 
else if (score1 >= 75) 
{
    console.log("B"); //
} 
else 
{
    console.log("C");
}
