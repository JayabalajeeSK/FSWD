let age = 22;
let hasID = true;

if (age >= 18 && hasID) 
{
    console.log("Entry allowed"); //Entry allowed
}

console.log(true && "Hello");   // "Hello"
console.log(false && "Hello");  // false
//returns the last evaluated value, not always true/false.

let isAdmin = false;
let isEditor = true;

if (isAdmin || isEditor) {
    console.log("Access granted"); //Access granted
}

console.log(null || "Default"); // "Default"
console.log("Hi" || "Hello");   // "Hi"

let isOnline = false;

if (!isOnline) {
    console.log("User is offline"); //User is offline
}

console.log(!!"Hello"); // true - Everything else ("0", [], {}, etc.)
console.log(!!0);       // false - come for false, 0, "", null, undefined, NaN
