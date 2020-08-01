// 1. Enum
// Numeric Enum
enum Gender {
    no = 0,
    yes   // yes = 1, it will increment automatically
}

// String Enum
enum Color {
    red = "red",
    green = "green",
    white = "white"
}


// 2. Union
// A union type describes a value that can be one of several types.
function display1(empname: string, empid: string | number): void {
    console.log(empname + " " + empid);
}


// 3. Any
// Any type describeas variables that we do not know the acutal type when we are writing an application.
function display2(empname: string, empid: any): void {
    console.log(empname + " " + empid);
}


// 4. Void
// The return type of functions that do not return a value.
function display3(empname: string, empid: number): void {
    console.log(empname + " " + empid);
}


// 5.  Never
// As the return type of functions that never return.
function infiniteLoop(): never {
    while (true) {
        console.log("Never has an end");
    }
}

// As the type of variables under type guards that are never true.
function impossibleTypeGuard(value: any) {
    if (
      typeof value === "string" &&
      typeof value === "number"
    ) {
      value;     // Type never
    }
  }


// 6. For loops
function factorialFor (num:number):number {
    var i:number;
    var res:number = 1;
    for (i=1; i<=num; i++) {
        res *= i;
    }
    return res;
}


// 7. While loops
function factorialWhile (num:number):number {
    var i:number = 1;
    var res:number = 1;
    while (i<=num) {
        res *= i;
        i++;
    }
    return res;
}


// 8. Arrow Function
let add8 = (a: number, b: number): number => {  
    return a + b;  
}  
console.log(add8(10, 20)); //returns 50  


// 9. Function Overloading
function add(a:string, b:string):string;
function add(a:number, b:number): number;
function add(a: any, b:any): any {
    return a + b;
}

add("Hello ", "Steve");    // returns "Hello Steve" 
add(10, 20);               // returns 30 


// 10. Rest params
function Greet(greeting: string, ...names: string[]) {
    return greeting + " " + names.join(", ") + "!";
}

Greet("Hello", "Steve", "Bill"); // returns "Hello Steve, Bill!"
Greet("Hello");// returns "Hello !"
