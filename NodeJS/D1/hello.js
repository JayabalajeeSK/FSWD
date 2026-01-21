console.log("Jayabalajee S K Hello World")
// node hello
// Jayabalajee S K Hello World

const hello = (name1) => 
{
    console.log(`hello, ${name1}`)
}
hello("jaya");
// console.log(window);
// console.log(document);

console.log(global); //global {global: global, clearImmediate: ƒ, setImmediate: ƒ, clearInterval: ƒ, clearTimeout: ƒ, …}

setTimeout(() =>
{
    console.log("timeout");
    clearInterval(intfunc);
},5000)

const intfunc = setInterval(() =>
{
    console.log("interval");
},1000)

console.log(__dirname);
console.log(__filename);
// E:\FSWD\NodeJS
// E:\FSWD\NodeJS\hello.js