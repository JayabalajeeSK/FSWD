for (let i = 1; i <= 3; i++) 
{
    console.log(i);
}

let result = "";
for (let i = 1; i <= 3; i++) 
{
    result = result + i + " ";
}

console.log(result);

console.log("");
let numbers1 = [10, 20, 30];
numbers1.forEach((value, index) => //v,i -> v,i = v,i
{
    console.log(value, index);
});

console.log("");
let numbers2 = [10, 20, 30];
numbers2.forEach((index, value) => //i,v -> v,i = i,v
{
    console.log(value, index);
});

console.log("");
let numbers3 = [10, 20, 30];
numbers3.forEach((value, index) => //v,i -> i,v = i,v
{
    console.log(index, value);
});
//v,i -> v,i = v,i
//i,v -> v,i = i,v
//v,i -> i,v = i,v

// 1
// 2
// 3
// for (let i = 1; i <= 3; i++) 
// {
//     process.stdout.write(String(i));
// }
// for (let i = 1; i <= 3; i++) 
// {
//     process.stdout.write(i + " ");
// }
// for (let i = 1; i <= 3; i++) 
// {
//     process.stdout.write(i);
// }

