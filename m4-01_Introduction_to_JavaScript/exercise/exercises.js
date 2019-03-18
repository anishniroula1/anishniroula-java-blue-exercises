/*
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

function sumDouble(x, y) {
    // do logic here
    // return result;
    return x + y;
}
*/

function sumDouble(x,y){
    if(x===y){
        return (x+y)*2;
    }
    return x + y;
}


/*
2. hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

function hasTeen(teen1, teen2, teen3){
    if(teen1 >=13 && teen1<=19){
        return true;
    }
    else if(teen2 >=13 && teen2<=19){
        return true;
    }
    else if(teen3 >=13 && teen3<=19){
        return true;
    }
    else{
        return false;
    }
}

/*
3. lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/
function lastDigit(x, y){
    x=x.toString();
    y=y.toString();
    if(x.substring(0,1)===y.substring(y.length-1)){
        return true;
    }
    else{
        return false;
    }
}

/*
4. seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/
function seeColor(color){
    color =color.toString();
    if(color.startsWith("red")){
        return "red";
    }
    else if(color.startsWith("blue")){
        return "blue";
    }
    else{
        return "";
    }
}

/*
5.oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) → [1, 3, 5, 7, 9, 11];
oddOnly([2, 4, 8, 32, 256]); → []
*/

function oddOnly(odd){
    let ar = [];
    for(let i =0; i<odd.length;i++){
        if(odd[i] % 2 !=0){
             ar.push(odd[i]);
        }
    }
    return ar;
    
}

/*
6. frontAgain Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/
function frontAgain(value){
    value = value.toString();
    if(value.substring(0,1)===value.substring(value.length-2,value.length-1)){
        return true;
    }
    return false;
}

/*
7. cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
*/
function cigarParty(numberOfCigars, isWeekend) {
    if (numberOfCigars >= 40 && isWeekend) {
    return true;
    } else if (numberOfCigars >= 40 && numberOfCigars <= 60) {
    return true;
    } else {
    return false;
    }
    }

/*
8.fizzBuzz(3) → "Fizz"
fizzBuzz(1) → 1
fizzBuzz(10) → "Buzz"
fizzBuzz(15) → "FizzBuzz"
fizzBuzz(8) → 8
*/
function fizzBuzz(num){
    if(num % 3==0 && num % 5==0){
        return "FizzBuzz";
    }
    else if(num%5==0){
        return "Buzz"
    }
    else if(num%3==0){
        return "Fizz";
        }
    
    else{
        return num;
        }
}

/*
9. filterEvens([]) → [] filterEvens([1, 3, 5]) → [] 
filterEvens([2, 4, 6]) → [2, 4, 6] 
filterEvens([100, 8, 21, 24, 62, 9, 7]) → [100, 8, 24, 62]
*/

function filterEvens(num){
    let filterNum = [];
    for (let i=0; i<num.length; i++){
        if(num[i]%2==0){
            filterNum.push(num[i]);
        }
    }
    return filterNum;
}

/*
10.filterBigNumbers([7, 10, 121, 100, 24, 162, 200]) → [121, 100, 162, 200] 
filterBigNumbers([3, 2, 7, 1, -100, -120]) → [] 
filterBigNumbers([]) → []
*/
function filterBigNumbers(num){
   let filterBigNum = [];
       for(let i=0; i<num.length;i++){
        if(num[i]>=100){
            filterBigNum.push(num[i]);
             }
    }
    return filterBigNum;
}

/*
11.filterMultiplesOfX([3, 5, 1, 9, 18, 21, 42, 67], 3) → [3, 9, 18, 21, 42] 
filterMultiplesOfX([3, 5, 10, 20, 18, 21, 42, 67], 5) → [5, 10, 20]
*/
function filterMultiplesOfX(arr, num){
    let filterMultiplesOfX = [];
    for(let i = 0; i<arr.length;i++){
        if(arr[i]%num==0){
         filterMultiplesOfX.push(arr[i]);
        }
    }
    return filterMultiplesOfX;
}

/*
12. 
createObject() →

{
firstName,
lastName,
age
}
*/

function createObject(){
    const person = {
        firstName: "Anish",
        lastName: "Niroula",
        age: 23
    }
    return person;
}

 